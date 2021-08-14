#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/stat.h>

int main(int argc, char* argv[])
{
    if(argc < 2)
    {
        printf("a.out dirname\n");
        exit(1);
    }

    int ret = rmdir(argv[1]);
    if(ret == -1)
    {
        perror("rmdir");
        exit(1);
    }
    return 0;
}
