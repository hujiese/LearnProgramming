#include <stdio.h>

int sum = 0; // ȫ�ֱ���

int add(int param1, int param2)
{
    int sum = param1 + param2; // �ֲ�����
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
	int sum = add(a, b); // �ֲ�����
	printf("In function main sum = %d\n", sum);
	printSum();
	
	return 0;
}
