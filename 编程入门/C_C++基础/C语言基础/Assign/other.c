#include <stdio.h>
 
int main()
{
   int a = 10;
   int b = 0;
 
   /* ��Ԫ�����ʵ�� */
   b = (a == 1) ? 20: 30;
   printf( "b ��ֵ�� %d\n", b );
   
   a = 1; // �޸�a��ֵ
   b = (a == 1) ? 20: 30;
   printf( "b ��ֵ�� %d\n", b );
}
