#include <stdio.h>

int main(void)
{
#ifndef MAX
printf("MAX is not defined\n");
#endif

#define MAX
#ifdef MAX
printf("MAX is defined\n");
#endif

	return 0;
}
