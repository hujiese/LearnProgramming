#include <stdio.h>
 
int main ()
{
   /* �ֲ��������� */
   int a = 10;

   /* do ѭ��ִ�� */
   do
   {
      if( a == 15)
      {
         /* �������� */
         a = a + 1;
         continue;
      }
      printf("a ��ֵ�� %d\n", a);
      a++;
     
   }while( a < 20 );
 
   return 0;
}
