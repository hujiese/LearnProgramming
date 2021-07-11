#include<stdio.h>
#include<stdlib.h>

#define MEMSIZE 3

int main(void)
{
	int *p = NULL;
	p = (int *)malloc(MEMSIZE * sizeof(int));
	p[0] = 0;
	p[1] = 1;
	p[2] = 3;
	printf("p[0] = %d, p[1] = %d, p[2] = %d\n", p[0], p[1], p[2]);
	
	free(p);
	return 0;
}
