#include <stdio.h>
 
int main()
{
   int a = 21;
   int b = 10;
   int c ;
 
   c = a + b;
   printf("%d + %d ��ֵ�� %d\n", a, b, c );
   c = a - b;
   printf("%d - %d ��ֵ�� %d\n", a, b, c );
   c = a * b;
   printf("%d * %d ��ֵ�� %d\n", a, b, c );
   c = a / b;
   printf("%d / %d ��ֵ�� %d\n", a, b, c );
   c = a % b;
   printf("%d / %d ������ %d\n", a, b, c );
   c = a++;  // ��ֵ���ټ� 1 ��c Ϊ 21��a Ϊ 22
   printf("c ��ֵ�� %d\n", c );
   c = a--;  // ��ֵ���ټ� 1 ��c Ϊ 22 ��a Ϊ 21
   printf("c ��ֵ�� %d\n", c );
   c = ++a;  // �� 1���ٸ�ֵ ��c Ϊ 22��a Ϊ 22
   printf("c ��ֵ�� %d\n", c );
   c = --a;  // �� 1���ٸ�ֵ ��c Ϊ 22 ��a Ϊ 22
   printf("c ��ֵ�� %d\n", c );
 
}
