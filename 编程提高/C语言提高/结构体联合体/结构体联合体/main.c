#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>

typedef struct
{
	int number;
	char name[36];
} BOOK ;

int main(void)
{
	BOOK book;
	book.number = 10;
	strcpy(book.name, "C++从入门到精通");

	printf("book number is = %d, book name is = %s\n", book.number, book.name); // book number is = 10, book name is = C++从入门到精通
	return 0;
}