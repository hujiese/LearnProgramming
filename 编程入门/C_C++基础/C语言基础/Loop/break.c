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
         /* ����ѭ�� */
         a = a + 1;
         break;
      }
      printf("a ��ֵ�� %d\n", a);
      a++;
     
   }while( a < 20 );
 
   return 0;
}
