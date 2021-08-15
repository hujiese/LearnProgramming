#include <stdio.h>
#include <string.h>
#include <unistd.h>
#include <errno.h>
#include <pthread.h>
#include <malloc.h>

#define ERR_EXIT(m) \
        do  \
        {   \
            perror(m);  \
            exit(EXIT_FAILURE); \
        } while(0);

struct tsd_t
{
    int id;
    char* arg;
};

pthread_key_t thread_key;

pthread_once_t once = PTHREAD_ONCE_INIT;

void destr_function(void *arg)
{
    printf("destroy...\n");
}

void once_run(void)
{
    pthread_key_create(&thread_key, destr_function);
	printf("once_run in thread %d\n", (unsigned int )pthread_self());
}

void* start_routine (void *arg)
{
    pthread_once(&once, once_run);
    struct tsd_t *value = (struct tsd_t*)malloc(sizeof(struct tsd_t));
    value->arg = (char *)arg;
    value->id = pthread_self();

    pthread_setspecific(thread_key, value);
    printf("%s setspecific %p\n", (char*)arg, value);
    value = (struct tsd_t*)pthread_getspecific(thread_key);
    printf("tid = 0x%x str = %s\n", (int)value->id, value->arg);
    sleep(2);
    value = (struct tsd_t*)pthread_getspecific(thread_key);
    printf("tid = 0x%x str = %s\n", (int)value->id, value->arg);

    return NULL;
}



int main(int argc, char** argv) {

    //pthread_key_create(&thread_key, destr_function);

    pthread_t thread1;
    pthread_t thread2;

    pthread_create(&thread1, NULL, start_routine, (char *)"thread1");
    pthread_create(&thread2, NULL, start_routine, (char *)"thread2");

    pthread_join(thread1, NULL);
    pthread_join(thread2, NULL);
    return 0;
}