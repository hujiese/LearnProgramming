#include <iostream>

namespace Add1
{
	int a = 0;
	int add(int num1, int num2)
	{
		return num1 + num2;
	}
}

namespace Add2
{
	int a = 0;
	int add(int num1, int num2)
	{
		return num1 + num2;
	}
}

int main()
{
	Add1::a = 5;
	Add2::a = 6;
	printf("%d\n", Add1::a);
	printf("%d\n", Add2::a);
	printf("%d\n", Add1::add(1, 3));
	printf("%d\n", Add2::add(1, 3));
	return 0;
}