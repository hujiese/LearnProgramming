#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
	FILE *fp;

	fp = fopen("file2.txt", "w+");
	fputs("012345678", fp);

	fseek(fp, 3, SEEK_SET);
	char buffer[4];
	fgets(buffer, 4, fp);
	printf("%s\n", buffer); // 345
	fclose(fp);

	return(0);
}