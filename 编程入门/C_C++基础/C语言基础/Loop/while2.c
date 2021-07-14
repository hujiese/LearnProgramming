#include<stdio.h>

int main(void)
{
	int sum = 0;
	int i = 1;
	
	while(i <= 100)
	{
		sum += i;
		++i;
	}
	printf("sum = %d\n", sum); // sum = 5050
	
	return 0;
}
