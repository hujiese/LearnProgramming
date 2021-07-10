#include<stdio.h>

int main(void)
{
	printf("------------- test int array -------------\n");
	int array1[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	printf("array1[0] = %d\n", array1[0]);
	printf("array1[4] = %d\n", array1[4]);
	printf("array1[9] = %d\n", array1[9]);
	printf("The size of array1 is %d.\n", sizeof(array1));
	
	printf("------------- test char array -------------\n");
	char array2[5] = {'H', 'e', 'l', 'l', 'o'};
	printf("array2[0] = %c\n", array2[0]);
	printf("array2[4] = %c\n", array2[4]);
	printf("The size of array2 is %d.\n", sizeof(array2));
	
	printf("------------- test no length array -------------\n");
	int array3[] = {1, 2, 3, 4, 5};
	printf("array3[0] = %d\n", array3[0]);
	printf("array3[4] = %d\n", array3[4]);
	printf("The size of array3 is %d.\n", sizeof(array3));
	
	printf("------------- test uninitialized array -------------\n");
	int array4[5];
	printf("array4[0] = %d\n", array4[0]);
	printf("array4[4] = %d\n", array4[4]);
	array4[0] = 1;
	array4[4] = 5;
	printf("array4[0] = %d\n", array4[0]);
	printf("array4[4] = %d\n", array4[4]);
	printf("The size of array4 is %d.\n", sizeof(array4));
	
	return 0;
}
