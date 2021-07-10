#include <stdio.h>

int main(void)
{
	int a;
	float b;
	char c;
	printf("Please input your data: ");
	scanf("%d, %f, %c", &a, &b, &c);
	printf("%d, %f, %c\n", a, b, c);
	
	scanf("%d-%f-%c", &a, &b, &c);
	printf("%d, %f, %c\n", a, b, c);
	return 0;
}
