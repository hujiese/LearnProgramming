#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <string.h>
#include <pthread.h>

int number = 100;

void* myfunc(void* arg)
{
    printf("child pthread id: %lu\n", pthread_self());
    printf("child thread .....\n");
    for(int i=0; i<5; ++i)
    {
        printf("child i = %d\n", i);
    }
        
    return &number;
}

int main(int argc, const char* argv[])
{
    // 创建子线程
    pthread_t thid;
    // 返回错误号
    int ret = pthread_create(&thid, NULL, myfunc, NULL);
    if(ret != 0)
    {
        printf("error number: %d\n", ret);
        // 根据错误号打印错误信息
        printf("error information: %s\n", strerror(ret));
    }
    printf("parent pthread id: %lu\n", pthread_self());

    // 退出主线程，子线程不受影响
    int *ptr;
    pthread_join(thid, (void**)&ptr);
    printf("in main thread number = %d\n", *ptr);

    printf("parent thread end.....\n");
    return 0;
}
