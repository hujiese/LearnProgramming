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
	strcpy(book.name, "C++�����ŵ���ͨ");

	printf("book number is = %d, book name is = %s\n", book.number, book.name); // book number is = 10, book name is = C++�����ŵ���ͨ
	return 0;
}