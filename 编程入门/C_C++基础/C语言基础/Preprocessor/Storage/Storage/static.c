#include <stdio.h>

static int count = 5;

void func(void)
{
	static int thingy = 5;
	int num = 0;
	thingy++;
	num++;
	printf("num = %d, thingy = %d£¬count = %d\n", num, thingy, count);
}

int main()
{
	while (count--) {
		func();
	}
	return 0;
}