#include <iostream>
using namespace std;

template<typename T>
class MathUtil
{
public:
	T add(T num1, T num2);
	T minu(T num1, T num2);
	T mul(T num1, T num2);
	T div(T num1, T num2);
};

template<typename T>
T MathUtil<T>::add(T num1, T num2){ return num1 + num2; }

template<typename T>
T MathUtil<T>::minu(T num1, T num2){ return num1 - num2; }

template<typename T>
T MathUtil<T>::mul(T num1, T num2){ return num1 * num2; }

template<typename T>
T MathUtil<T>::div(T num1, T num2){ return num1 / num2; }

int main(void)
{
	MathUtil<int> util;

	cout << util.add(2, 4) << endl; // 6
	cout << util.minu(6, 3) << endl; // 3
	cout << util.div(8, 2) << endl; // 4
	cout << util.mul(3, 3) << endl; // 9

	return 0;
}