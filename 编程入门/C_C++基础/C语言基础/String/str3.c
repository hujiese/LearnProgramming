#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(void)
{
   char* str1 = "Hello";
   char* str2 = NULL;
   str2 = (char*)malloc(strlen(str1) + 1);
   strcpy(str2, str1);
   
   printf("�ַ��� %s ����Ϊ %d ��\n", str1, strlen(str1));
   printf("�ַ��� %s ����Ϊ %d ��\n", str2, strlen(str2));
 
   str2[0] = 'A';
   printf("�ַ��� %s ����Ϊ %d ��\n", str2, strlen(str2));
   
   free(str2);
   return 0;
}
