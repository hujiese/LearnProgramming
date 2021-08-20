#include<stdio.h>
#include<string.h>
#include<fcntl.h>
#include<sys/mman.h>
#include<sys/stat.h>
#include <unistd.h>

int main()
{
    int fd;
    char *addr;
    fd=shm_open("test",O_RDWR|O_CREAT,0777);   //创建共享内存对象
    if(fd<0)
    {
        printf("shm_open error\n");
    }

    char string[20]="Hello world\n";
    if(ftruncate(fd,strlen(string))==-1)    //改变对象大小
    {
        printf("ftruncate error\n");
    }

    addr=mmap(NULL,strlen(string),PROT_READ | PROT_WRITE,MAP_SHARED,fd,0);  //内存映射
    if(addr==MAP_FAILED)
    {
        printf("mmap error\n");
    }

    memcpy(addr,string,strlen(string));  //拷贝字符串到共享内存中

    close(fd);

    return 0;


}
