#include <iostream>
using namespace std;

class point
{
public:
	point(const int& x, const int& y) :x(x), y(y){};
	bool operator==(const point& p)
	{
		return (this->x == p.x) && (this->y == p.y);
	}
private:
	int x;
	int y;
};
int main(void)
{
	point p1(3, 4);
	point p2(3, 5);
	point p3(3, 4);

	if (p1 == p3) // true
		cout << "p1 == p3" << endl;

	if (!(p1 == p2)) // false
		cout << "p1 != p2" << endl;

	return 0;
}