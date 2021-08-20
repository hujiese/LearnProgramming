#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>
#include <unistd.h>
#include <fcntl.h>
#include<mqueue.h>
#include <sys/stat.h>
#include <sys/types.h>

int main()
{
    mqd_t mqID;
	// 创建一个消息队列
    mqID = mq_open("/testmq", O_RDWR | O_CREAT | O_EXCL, 0666, NULL);
 
    if (mqID < 0)
    {
        if (errno == EEXIST)
        {
            mq_unlink("/testmq");
			// 如果已经存在则打开，而非创建
            mqID = mq_open("/testmq", O_RDWR | O_CREAT, 0666, NULL);
        }
        else
        {
			printf("open message queue error...%s\n", strerror(errno));
            return -1;
        }
    }
 
	// 子进程接收五条消息
    if (fork() == 0)
    {
        struct mq_attr mqAttr;
        mq_getattr(mqID, &mqAttr);
 
        char *buf = (char *)malloc(mqAttr.mq_msgsize);
 
        for (int i = 1; i <= 5; ++i)
        {
            if (mq_receive(mqID, buf, mqAttr.mq_msgsize, NULL) < 0)
            {
				printf("receive message  failed. error info: %s\n", strerror(errno));
                continue;
            }
			printf("receive message %d : %s\n", i, buf);
        }
		free(buf);
        exit(0);
    }
 
    char msg[] = "hello";
    for (int i = 1; i <= 5; ++i)
    {
        if (mq_send(mqID, msg, sizeof(msg), i) < 0)
        {
			printf("send message %d failed. error info: %s\n", i, strerror(errno));
        }
		printf("send message %d success.\n", i);
 
        sleep(1);
    }
}