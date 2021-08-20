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
    fd=shm_open("test",O_RDWR|O_CREAT,0777);   //���������ڴ����
    if(fd<0)
    {
        printf("shm_open error\n");
    }

    char string[20]="Hello world\n";
    if(ftruncate(fd,strlen(string))==-1)    //�ı�����С
    {
        printf("ftruncate error\n");
    }

    addr=mmap(NULL,strlen(string),PROT_READ | PROT_WRITE,MAP_SHARED,fd,0);  //�ڴ�ӳ��
    if(addr==MAP_FAILED)
    {
        printf("mmap error\n");
    }

    memcpy(addr,string,strlen(string));  //�����ַ����������ڴ���

    close(fd);

    return 0;


}
