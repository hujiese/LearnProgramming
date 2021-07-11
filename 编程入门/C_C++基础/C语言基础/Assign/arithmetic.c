#include <stdio.h>
 
int main()
{
   int a = 21;
   int b = 10;
   int c ;
 
   c = a + b;
   printf("%d + %d 的值是 %d\n", a, b, c );
   c = a - b;
   printf("%d - %d 的值是 %d\n", a, b, c );
   c = a * b;
   printf("%d * %d 的值是 %d\n", a, b, c );
   c = a / b;
   printf("%d / %d 的值是 %d\n", a, b, c );
   c = a % b;
   printf("%d / %d 余数是 %d\n", a, b, c );
   c = a++;  // 赋值后再加 1 ，c 为 21，a 为 22
   printf("c 的值是 %d\n", c );
   c = a--;  // 赋值后再减 1 ，c 为 22 ，a 为 21
   printf("c 的值是 %d\n", c );
   c = ++a;  // 加 1后再赋值 ，c 为 22，a 为 22
   printf("c 的值是 %d\n", c );
   c = --a;  // 减 1后再赋值 ，c 为 22 ，a 为 22
   printf("c 的值是 %d\n", c );
 
}
