#include <stdio.h>
 
int main()
{
   int a = 21;
   int c ;
 
   c =  a;// c = 21
   printf("=  运算符实例，c 的值 = %d\n", c );
 
   c +=  a; // c = c + a = 21 + 21 = 42
   printf("+= 运算符实例，c 的值 = %d\n", c );
 
   c -=  a; // c = c - a = 42 - 21 = 21
   printf("-= 运算符实例，c 的值 = %d\n", c );
 
   c *=  a; // c = c * a = 21 * 21 = 441
   printf("*= 运算符实例，c 的值 = %d\n", c );
 
   c /=  a; // c = c / a = 441 / 21 = 21
   printf("/= 运算符实例，c 的值 = %d\n", c );
 
   c  = 200;
   c %=  a; // c = c % a = 200 % 21 = 11
   printf("%%= 运算符实例，c 的值 = %d\n", c );
 
   c <<=  2; // c = c << 2 = 11 << 2 = (0000 1011) << 2 = (0001 1100)= 44
   printf("<<= 运算符实例，c 的值 = %d\n", c );
 
   c >>=  2; // c = c >> 2 = 44 >> 2 = (0001 1100) >> 2 = (0000 1011)= 11
   printf(">>= 运算符实例，c 的值 = %d\n", c );
 
   c &=  2; // c = c & 2 = 11 & 2 = (0000 1011) & (0000 0010) = (0000 0010) = 2
   printf("&= 运算符实例，c 的值 = %d\n", c );
 
   c ^=  2; // c = c ^ 2 = 2 ^ 2 = (0000 0010) ^ (0000 0010) = (0000 0000) = 0
   printf("^= 运算符实例，c 的值 = %d\n", c );
 
   c |=  2; // c = c | 2 = 0 | 2 = (0000 0000) | (0000 0010) = (0000 0010) = 2
   printf("|= 运算符实例，c 的值 = %d\n", c );
 
}
