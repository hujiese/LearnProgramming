//#include <iostream>
//using namespace std;
//
//int main(void)
//{
//	int* a = (int *)malloc(sizeof(int));
//	free(a);
//
//	char* c = (char *)malloc(10);
//	free(c);
//
//	return 0;
//}

#include <iostream>
using namespace std;

int main(void)
{
	int* a = new int;
	delete a;

	char* c = new char[10];
	delete[] c;

	return 0;
}