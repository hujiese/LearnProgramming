#include<stdio.h>
#include<string.h>
#include<fcntl.h>
#include<sys/mman.h>
#include<sys/stat.h>
#include<unistd.h>

int main()
{
    int fd;
    char *addr;
    struct stat sb;
    fd=shm_open("test",O_RDWR,0);   //创建共享内存对象
    if(fd<0)
    {
        printf("shm_open error\n");
    }


    if(fstat(fd,&sb)==-1)
    {
        printf("fstat error\n");
    }

    addr=mmap(NULL,sb.st_size,PROT_READ | PROT_WRITE,MAP_SHARED,fd,0);  //内存映射
    if(addr==MAP_FAILED)
    {
        printf("mmap error\n");
    }

    write(STDOUT_FILENO,addr,sb.st_size);  //拷贝字符串到共享内存中

    close(fd);

    return 0;
}