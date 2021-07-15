#include <stdio.h>
#include "func.h"

int main(void)
{
	int a = 10;
	int b = 20;
	int result = add(a, b);
	printf("result = %d\n", result);
	result = mul(a, b);
	printf("result = %d\n", result);
	return 0;
}
