#include <stdio.h>
#include <string.h>

struct BOOK {
  int number;
  char name[36];
  float price;
};

int main(void)
{
	struct BOOK book;
	book.number = 1001;
	strcpy(book.name, "C���Դ����ŵ���ͨ");
	book.price = 34.8;
	
	printf("number = %d, name = ��%s��, price = %f\n", book.number, book.name, book.price);
	return 0;
}
