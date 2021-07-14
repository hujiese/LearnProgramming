#include <stdio.h>
#include <string.h>

void printStr(char* str)
{
	int len = strlen(str);
	for(int i = 0; i < len; ++i)
	{
		printf("%c ", str[i]);
	}	
	printf("\n");
}

int main(void)
{
	char* str1 = "Hello";
	char  str2[] = "Hello";
	char  str3[6] = {'H', 'e', 'l', 'l', 'o','\0'};
	
	printStr(str1);
	printStr(str2);
	printStr(str3);
	
	return 0;
}
