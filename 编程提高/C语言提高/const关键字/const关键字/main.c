#include <stdio.h>

#define ADD(a, b) (a + b)
void testConst(void)
{
	const int i = 100;
	//i = 60; // error: 表达式必须是可修改的左值
	int* p = &i;
	*p = 666;
	printf("i = %d\n", i); // i = 666

	return 0;
}

int main(void)
{
	int result = ADD(1, 2);
	printf("result = %d\n", result);
}