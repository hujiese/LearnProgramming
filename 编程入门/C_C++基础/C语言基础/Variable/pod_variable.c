#include <stdio.h>

int main(void)
{
	char c = 's';
	int i = 10;
	float f = 10.66;
	double d = 100.66668;
	
	printf("%c, %d, %f, %lf\n", c, i, f, d);
    printf("%d,%d,%d,%d\n", sizeof(char), sizeof(int), sizeof(float), sizeof(double));
	return 0;
}
