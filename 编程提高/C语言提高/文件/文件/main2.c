#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main(void)
{
	FILE *fw, *fr;
	char str[] = "This is a test file.\n";

	fw = fopen("F:/file.txt", "w+");
	int ret = fwrite(str, sizeof(str), 1, fw);
	printf("ret = %d\n", ret);
	fclose(fw);

	char buffer[128];
	fr = fopen("F:/file.txt", "r");
	fread(buffer, strlen(str) + 1, 1, fr);
	printf("Read from file: %s\n", buffer);
	fclose(fr);
	return 0;
}