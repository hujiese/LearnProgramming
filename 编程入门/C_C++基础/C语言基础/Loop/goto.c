#include<stdio.h>

int main(void)
{
	int i = 0;
	
LOOP:
	printf("i = %d\n", i);
	++i;
	if(i < 5)
	   goto LOOP;
	return 0;
}
