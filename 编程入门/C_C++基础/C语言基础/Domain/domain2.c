#include <stdio.h>

int main(void)
{
	int i = 10;
	
	{
		int i = 20;
		int k = 66;
		printf("In bolck i = %d\n", i);
	}
	
//	k = 20; // [Error] 'k' undeclared (first use in this function) 
	printf("In function main i = %d\n", i);
	return 0;
}
