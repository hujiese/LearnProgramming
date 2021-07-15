#include <stdio.h>

int main(void)
{
	auto num1 = 10;
	printf("num1 = %d\n", num1); // num1 = 10
	auto num2 = 10.66;
	printf("num2 = %d, num2 = %f\n", num2, num2); // num2 = 10, num2 = 0.000000
	return 0;
}