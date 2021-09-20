#include <iostream>
using namespace std;

class Animal
{
public:
	Animal()
	{
		cout << "Animal initilize ok..." << endl;
	}
	void eat()
	{
		cout << "Animal eat ..." << endl;
	}
	void sleep()
	{
		cout << "Animal sleep ..." << endl;
	}
	~Animal()
	{
		cout << "Animal die ..." << endl;
	}
};

class Cat : public Animal
{
public:
	Cat()
	{
		cout << "Cat initilize ok ..." << endl;
	}

	void bark()
	{
		cout << "Cat bark ..." << endl;
	}

	~Cat()
	{
		cout << "Cat die ..." << endl;
	}
};

int main(void)
{
	Cat cat;
	cat.eat();
	cat.sleep();
	cat.bark();
	
	return 0;
}