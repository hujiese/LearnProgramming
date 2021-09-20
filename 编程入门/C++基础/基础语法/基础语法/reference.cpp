#include <iostream>
using namespace std;

//void plus10(int* num)
//{
//	*num += 10;
//}
//int main(void)
//{
//	int a = 10;
//	int* p = &a;
//	++(*p);
//	cout << a << " " << *p << endl; // 11 11
//	plus10(&a);
//	cout << a << " " << *p << endl; // 21 21
//	plus10(p);
//	cout << a << " " << *p << endl; // 31 31
//
//	return 0;
//}

void plus10(int& num)
{
	num += 10;
}
int main(void)
{
	int a = 10;
	int& p = a;
	++p;
	cout << a << " " << p << endl; // 11 11
	plus10(a);
	cout << a << " " << p << endl; // 21 21
	plus10(p);
	cout << a << " " << p << endl; // 31 31

	return 0;
}
