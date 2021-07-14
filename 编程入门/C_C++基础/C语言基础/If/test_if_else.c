#include<stdio.h>

int main(void)
{
	int a = 10;
	int b = 20;
	
	// ≤‚ ‘ && 
	if(a == 10 && b == 30)
	{
		printf("a == 10 && b == 30\n");
	}
	else if(a == 10 && b == 20)
	{
		printf("a == 10 && b == 20\n");
	}
	else
	{
		printf("nothing...\n");	
	}
	
	// ≤‚ ‘«∂Ã◊if
	if(a == 10)
	{
		if(b == 20)
		{
			printf("a == 10 && b == 20\n");
		}
		else
		{
			printf("b != 20\n");
		}
	}
	else
	{
		printf("a != 10\n");
	}
	
	// ≤‚ ‘ ||
	if(a == 10 || b == 20)
	{
		printf("a == 10 || b == 30\n");
	}
	else
	{
		printf("a != 10 && b != 30\n");
	}
	
	// ≤‚ ‘ !=
	if(a != 30)
	{
		printf("a != 30\n");
	}
	return 0;
}
