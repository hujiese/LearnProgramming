#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <string.h>

int main(int argc, char* argv[])
{
    pid_t pid = fork();
    if(pid == -1)
    {
        perror("fork error");
        exit(1);
    }
    if(pid >0)
    {
        sleep(1);
    }
    //　子进程执行程序
    if(pid == 0)
    {
        execlp("ls", "ls", "-l", ".", NULL);
		//char* args[] = {"ls", "-l", ".", NULL};
		//execvp("ls", args);
        perror("exec");
        exit(1);
    }
    return 0;
}
