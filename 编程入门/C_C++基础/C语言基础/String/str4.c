#include <stdio.h>
#include <string.h>
 
int main ()
{
   char str1[14] = "tencent";
   char str2[14] = "google";
   char str3[14];
   int  len ;
 
   /* ���� str1 �� str3 */
   strcpy(str3, str1);
   printf("strcpy( str3, str1) :  %s\n", str3 ); // tencent
 
   /* ���� str1 �� str2 */
   strcat( str1, str2);
   printf("strcat( str1, str2):   %s\n", str1 ); // tencentgoogle
 
   /* ���Ӻ�str1 ���ܳ��� */
   len = strlen(str1);
   printf("strlen(str1) :  %d\n", len ); // 13
 
   return 0;
}
