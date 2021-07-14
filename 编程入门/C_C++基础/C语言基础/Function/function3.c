#include<stdio.h>

void swap(int* param1, int* param2)
{	
	int temp;
	temp = *param1;
	*param1 = *param2;
	*param2 = temp;	
}

int main(void)
{
	int a = 10;
	int b = 20;
	swap(&a, &b);
	
	// In Main function after swap: a = 20, b = 10.
	printf("In Main function after swap: a = %d, b = %d.\n", a, b);
	
	return 0;
}
