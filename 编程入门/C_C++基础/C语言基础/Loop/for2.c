#include<stdio.h>

int main(void)
{
	int i;
	int sum = 0;
	for(i = 1; i <= 100; ++i)
	{
		sum += i;
	}
	printf("sum = %d\n", sum); // sum = 5050
	return 0;
}
