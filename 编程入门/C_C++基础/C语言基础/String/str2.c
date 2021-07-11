#include <stdio.h>
#include <string.h>

int main(void)
{
   char* str1 = "Hello";
   char str2[] = "Hello";
   
   printf("字符串 %s 长度为 %d 。\n", str1, strlen(str1));
   printf("字符串 %s 长度为 %d 。\n", str2, strlen(str2));
 
   return 0;
}
