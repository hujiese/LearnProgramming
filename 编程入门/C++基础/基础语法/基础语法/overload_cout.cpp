#include <iostream>
using namespace std;

class point
{
public:
	point(const int& x, const int& y) :x(x), y(y){};
	friend ostream& operator<<(ostream& output, const point& p)
	{
		output << "(" << p.x << "," << p.y << ")" << endl;
		return output;
	}
private:
	int x;
	int y;
};
int main(void)
{
	point p(3, 4);
	cout << p << endl; // (3,4)
	return 0;
}