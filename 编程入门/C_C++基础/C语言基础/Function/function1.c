#include <stdio.h>

int add(int param1, int param2);

int main(void)
{
	int a = 10;
	int b = 20;
	int sum = add(a, b);
	printf("sum = %d\n", sum);
	
	return 0;
}

int add(int param1, int param2)
{
	return param1 + param2;
}
