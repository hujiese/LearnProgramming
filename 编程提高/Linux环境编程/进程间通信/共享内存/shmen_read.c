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
    fd=shm_open("test",O_RDWR,0);   //���������ڴ����
    if(fd<0)
    {
        printf("shm_open error\n");
    }


    if(fstat(fd,&sb)==-1)
    {
        printf("fstat error\n");
    }

    addr=mmap(NULL,sb.st_size,PROT_READ | PROT_WRITE,MAP_SHARED,fd,0);  //�ڴ�ӳ��
    if(addr==MAP_FAILED)
    {
        printf("mmap error\n");
    }

    write(STDOUT_FILENO,addr,sb.st_size);  //�����ַ����������ڴ���

    close(fd);

    return 0;
}