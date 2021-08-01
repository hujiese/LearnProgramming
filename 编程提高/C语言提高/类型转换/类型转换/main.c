#include <stdio.h>

void testAutoCast()
{
	float PI = 3.14159;
	int result1;
	int r = 5;
	double result2;
	result1 = r * r * PI;
	result2 = r * r * PI;
	printf("result1=%d, result2=%f\n", result1, result2);
	return 0;
}

void testCast()
{
	int sum = 106;  //总数
	int count = 7;  //数目
	int average1;
	double average2;  //平均数
	average1 = sum / count;
	average2 = (double)sum / count;
	printf("Average1 is %d, Average2 is %lf\n", average1, average2);
	return 0;
}

int main(void)
{
	//testAutoCast();
	testCast();
	return 0;
}