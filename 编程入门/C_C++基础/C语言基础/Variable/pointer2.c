#include<stdio.h>

int main(void)
{
	int array[5] = {1, 2, 3, 4, 5};
	
	int* p1 = array;
	int* p2 = &array; // &array[0]
	
	printf("array[0] = %d, *p1 = %d, *p2 = %d\n", array[0], *p1, *p2);
	printf("array[2] = %d, *p1 = %d, *p2 = %d\n", array[2], p1[2], p2[2]);
	printf("array[3] = %d, *p1 = %d, *p2 = %d\n", array[3], *(p1 + 3), *(p2 + 3));
	return 0;
}
