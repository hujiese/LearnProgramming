#include <stdio.h>
 
int main()
{
   int a = 20;
   int b = 10;
   int c = 15;
   int d = 5;
   int e;
 
   e = (a + b) * c / d;      // ( 30 * 15 ) / 5
   printf("(%d + %d) * %d / %d = %d\n", a, b, c, d, e);
 
   e = ((a + b) * c) / d;    // (30 * 15 ) / 5
   printf("((%d + %d) * %d) / %d = %d\n", a, b, c, d, e);
 
   e = (a + b) * (c / d);   // (30) * (15/5)
   printf("(%d + %d) * (%d / %d) = %d\n", a, b, c, d, e);
 
   e = a + (b * c) / d;     //  20 + (150/5)
   printf("%d + (%d * %d) / %d = %d\n", a, b, c, d, e);
  
   return 0;
}
