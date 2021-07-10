#include<stdio.h>

int main(void)
{
	int i = 10;
	printf("0x%p\n", &i); // 0x009ffa98
	int* p = &i;
	printf("0x%p, *p = %d\n", p, *p); // 0x009ffa98, *p = 10
	
	*p = 20;
	printf("i = %d, *p = %d\n", i, *p); // i = 20, *p = 20
	
	return 0;
}
