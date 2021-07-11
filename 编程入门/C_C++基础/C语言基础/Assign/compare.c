#include <stdio.h>
 
int main()
{
   int a = 20;
   int b = 10;
 
   if( a == b )
   {
      printf("a 等于 b\n" );
   }
   else
   {
      printf("a 不等于 b\n" );
   }
   
   if ( a < b )
   {
      printf("a 小于 b\n" );
   }
   else
   {
      printf("a 不小于 b\n" );
   }
   
   if ( a > b )
   {
      printf("a 大于 b\n" );
   }
   else
   {
      printf("a 不大于 b\n" );
   }
   
   /* 改变 a 和 b 的值 */
   a = 5;
   b = 20;
   if ( a <= b )
   {
      printf("a 小于或等于 b\n" );
   }
   
   if ( b >= a )
   {
      printf("b 大于或等于 a\n" );
   }
}
