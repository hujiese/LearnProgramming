#include <stdio.h>
 
int main()
{
   int a = 10;
   int b = 0;
 
   /* 三元运算符实例 */
   b = (a == 1) ? 20: 30;
   printf( "b 的值是 %d\n", b );
   
   a = 1; // 修改a的值
   b = (a == 1) ? 20: 30;
   printf( "b 的值是 %d\n", b );
}
