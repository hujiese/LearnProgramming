#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct BOOK {
  int number;
  char* name;
  float price;
};

int main(void)
{
	struct BOOK* book = NULL;
	book = (struct BOOK*)malloc(sizeof(struct BOOK));
	book->name = (char*)malloc(36 * sizeof(char));
	book->number = 1001;
	strcpy(book->name, "C语言从入门到精通");
	book->price = 34.8;
	
	printf("number = %d, name = 《%s》, price = %f\n", book->number, book->name, book->price);
	
	free(book->name);
	free(book);
	return 0;
}
