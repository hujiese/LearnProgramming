#include <stdio.h>

#define FLAG 0

int main(void)
{
#if FLAG
printf("flag = 1\n");
#else
printf("flag = 0\n");
#endif
	return 0;
}
