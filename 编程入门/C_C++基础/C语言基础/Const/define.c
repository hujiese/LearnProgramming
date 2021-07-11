#include <stdio.h>
 
#define LENGTH 10   
#define WIDTH  5
#define STRING "Hello World !"
 
int main()
{
 
   int area;  
  
   area = LENGTH * WIDTH;
   printf("value of area : %d\n", area);
   printf("%s", STRING);
 
   return 0;
}
