#include <stdio.h>

int sum = 0; // 全局变量

int add(int param1, int param2)
{
    int sum = param1 + param2; // 局部变量
    printf("In function add sum = %d\n", sum);
	return sum;
}

void printSum(void)
{
	printf("In function printSum sum = %d\n", sum);
}

int main(void)
{
	int a = 10;
	int b = 20;
	int sum = add(a, b); // 局部变量
	printf("In function main sum = %d\n", sum);
	printSum();
	
	return 0;
}
