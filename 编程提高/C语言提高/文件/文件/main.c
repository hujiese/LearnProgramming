#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
	//FILE *fp = NULL;

	//fp = fopen("F:/test.txt", "w+");
	//fprintf(fp, "This is testing for fprintf %d...\n", 666);
	//fputs("This is testing for fputs...\n", fp);
	//fclose(fp);

	FILE *fp = NULL;
	char buff[255];

	fp = fopen("F:/test.txt", "r");
	fscanf(fp, "%s", buff);
	printf("line 1: %s\n", buff);

	fgets(buff, 255, (FILE*)fp);
	printf("line 2: %s\n", buff);

	fgets(buff, 255, (FILE*)fp);
	printf("line 3: %s\n", buff);
	fclose(fp);

	return 0;
}