#include <stdio.h>

int main(void)
{
	int i = 6; // 定义整型变量i
	float v = 2; // 定义浮点型变量v
	float r = i * v; // 定义浮点型变量r，保存i和v相乘结果
	
	/* 输出i,v,r的值*/
	printf("%d * %f = %f\n", i, v, r);
	
	return 0;
}
