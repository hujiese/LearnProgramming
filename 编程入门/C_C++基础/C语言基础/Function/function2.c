#include<stdio.h>

void swap(int param1, int param2)
{
	printf("In function swap before swap: param1 = %d, param2 = %d.\n", param1, param2);
	
	int temp;
	temp = param1;
	param1 = param2;
	param2 = temp;	
	
	printf("In function swap after swap: param1 = %d, param2 = %d.\n", param1, param2);
}

int main(void)
{
	int a = 10;
	int b = 20;
	swap(a, b);
	
	printf("In Main function after swap: a = %d, b = %d.\n", a, b);
	
	return 0;
}
