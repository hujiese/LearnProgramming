#include <stdio.h>
 
int main()
{
   int a = 20;
   int b = 10;
 
   if( a == b )
   {
      printf("a ���� b\n" );
   }
   else
   {
      printf("a ������ b\n" );
   }
   
   if ( a < b )
   {
      printf("a С�� b\n" );
   }
   else
   {
      printf("a ��С�� b\n" );
   }
   
   if ( a > b )
   {
      printf("a ���� b\n" );
   }
   else
   {
      printf("a ������ b\n" );
   }
   
   /* �ı� a �� b ��ֵ */
   a = 5;
   b = 20;
   if ( a <= b )
   {
      printf("a С�ڻ���� b\n" );
   }
   
   if ( b >= a )
   {
      printf("b ���ڻ���� a\n" );
   }
}
