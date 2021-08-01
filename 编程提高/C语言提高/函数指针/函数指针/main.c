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
//	/* p �Ǻ���ָ�� */
//	int (*p)(int, int) = &max; // &����ʡ��
//
//	FUNC func = max;
//
//	printf("����������: %d\n", (*p)(3, 5));
//	printf("����������: %d\n", (*func)(3, 5));
//
//	return 0;
//}

#include <stdlib.h>  
#include <stdio.h>

// �ص�����
void cal_array(int *array, size_t arraySize, int(*func)(int))
{
	for (size_t i = 0; i < arraySize; i++)
		array[i] = add5(array[i]);
}

// ��ȡ���ֵ
int add5(int num)
{
	return num + 5;
}

int main(void)
{
	int myarray[5] = {1, 2, 3, 4, 5};
	/* add5 ���ܼ����ţ������޷����룬��Ϊ��������֮���൱�ڴ���˲���ʱ������ int , �����Ǻ���ָ��*/
	cal_array(myarray, 5, add5);

	for (int i = 0; i < 5; i++) {
		printf("%d ", myarray[i]); // 6 7 8 9 10
	}
	printf("\n");
	return 0;
}