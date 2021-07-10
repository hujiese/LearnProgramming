#include <stdio.h>

int main(void)
{
	char c = 's';
	int i = 10;
	unsigned int ui = 20;
	long l = 100;
	float f = 10.66;
	double d = 100.66668;
	
	printf("Data is : ");
	printf("%c, %d, %u, %ld, %f, %lf\n", c, i, ui, l, f, d);
	printf("Data print over.");
	return 0;
}
