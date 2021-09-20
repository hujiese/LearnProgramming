#include <iostream>

using namespace std;

class integer
{
public:
	integer(const int& num) :num(num){}
	int getNum(void)
	{
		return num;
	}

	// Ç°ÖÃ++
	integer operator++()
	{
		this->num += 1;
		return *this;
	}

	// ºóÖÃ++
	integer operator++(int)
	{
		integer it(num);
		this->num += 1;
		return it;
	}
private:
	int num;
};

int main(void)
{
	integer i1(1);
	integer i2(2);

	cout << (++i1).getNum() << endl; // 2
	cout << (i2++).getNum() << endl; // 2

	return 0;
}