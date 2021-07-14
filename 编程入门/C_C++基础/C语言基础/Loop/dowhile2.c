#include<stdio.h>

int main(void)
{
	int sum = 0;
	int i = 1;
	
	do
	{
		sum += i;
		++i;
	}while(i <= 100);
	printf("sum = %d\n", sum); // sum = 5050
	
	return 0;
}
