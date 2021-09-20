#include <iostream>
#include <string>

using namespace std;

class Cat
{
public:
	Cat(const string& name) :nickName(name){};

private:
	void play(void) const
	{
		cout << "ºÍÃ¨Íæ" << endl;
	}

	friend void friendOfCat(const Cat& cat);
private:
	string nickName;
};

void friendOfCat(const Cat& cat)
{
	cat.play();
	cout << cat.nickName << endl;
}

int main(void)
{
	Cat cat("Tom");
	friendOfCat(cat);
	return 0;
}