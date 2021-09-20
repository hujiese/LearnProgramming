#include <iostream>

using namespace std;

class point
{
public:
	point(const int& x, const int& y) :x(x), y(y){}

	void printXY(void)
	{
		cout << "x = " << x << ", " << "y = " << y << endl;
	}
	point operator+(point& p)
	{
		int x = this->x + p.x;
		int y = this->y + p.y;
		point result(x, y);
		return result;
	}
private:
	int x;
	int y;
};

int main(void)
{
	point p1(1, 2);
	point p2(3, 4);
	point p3 = p1 + p2;
	p3.printXY(); // x = 4, y = 6

	return 0;
}