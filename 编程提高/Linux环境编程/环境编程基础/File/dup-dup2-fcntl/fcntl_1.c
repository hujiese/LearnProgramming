#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <string.h>
#include <fcntl.h>

int main()
{
	int fd = open("temp", O_RDWR, 0664);
	if(fd == -1)
	{
		perror("open");
		exit(1);
	}
	char* t = "Hello ";
	write(fd, t, strlen(t));

	// 获取文件状态标志
	int flag = fcntl(fd, F_GETFL, 0);
	switch(flag & O_ACCMODE)
	{
		case O_RDONLY:
			printf("read only\n");
			break;
		case O_WRONLY:
			printf("write only\n");
			break;
		case O_RDWR:
			printf("read and write\n");
			break;
		default:
			break;
	}
	if(flag & O_APPEND)
	{
		printf("append\n");
	}
	// 追加flag
	flag |= O_APPEND;
	fcntl(fd, F_SETFL, flag);
	char*p = "Are you ok ?\n";
	write(fd, p, strlen(p));
	close(fd);

	return 0;
}
