//#include <stdio.h>
//
//typedef int (*FUNC)(int, int);
//
//int max(int x, int y)
//{
//	return x > y ? x : y;
//}
//
//int main(void)
//{
//	/* p 是函数指针 */
//	int (*p)(int, int) = &max; // &可以省略
//
//	FUNC func = max;
//
//	printf("最大的数字是: %d\n", (*p)(3, 5));
//	printf("最大的数字是: %d\n", (*func)(3, 5));
//
//	return 0;
//}

#include <stdlib.h>  
#include <stdio.h>

// 回调函数
void cal_array(int *array, size_t arraySize, int(*func)(int))
{
	for (size_t i = 0; i < arraySize; i++)
		array[i] = add5(array[i]);
}

// 获取随机值
int add5(int num)
{
	return num + 5;
}

int main(void)
{
	int myarray[5] = {1, 2, 3, 4, 5};
	/* add5 不能加括号，否则无法编译，因为加上括号之后相当于传入此参数时传入了 int , 而不是函数指针*/
	cal_array(myarray, 5, add5);

	for (int i = 0; i < 5; i++) {
		printf("%d ", myarray[i]); // 6 7 8 9 10
	}
	printf("\n");
	return 0;
}