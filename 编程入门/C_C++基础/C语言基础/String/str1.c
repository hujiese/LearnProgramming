#include <stdio.h>
#include <string.h>

int main(void)
{
   char str1[6] = {'H', 'e', 'l', 'l', 'O', '\0'};
   char str2[] = "Hello";
   
   printf("�ַ��� %s ����Ϊ %d ��\n", str1, strlen(str1));
   printf("�ַ��� %s ����Ϊ %d ��\n", str2, strlen(str2));
 
   return 0;
}
