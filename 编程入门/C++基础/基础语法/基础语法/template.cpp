#include <iostream>
using namespace std;

template<typename T>
T sum(T t1, T t2)
{
	return t1 + t2;
}

int main(void)
{
	cout << sum(1, 4) << endl; // 5
	cout << sum(3.2, 4.0) << endl; // 7.2

	return 0;
}