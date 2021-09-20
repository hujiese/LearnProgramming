#include <iostream>

using namespace std;

class AutoFather
{
public:
	virtual void kill(void) = 0;
};

class TaiLuoAutoMan :public AutoFather
{
public:
	void kill(void)
	{
		cout << "TaiLuoAutoMan kill !" << endl;
	}

	void taiLuoLight()
	{
		cout << "Ì©ÂÞ¹âÊø" << endl;
	}
};

class JackAutoMan :public AutoFather
{
public:
	void kill(void)
	{
		cout << "JackAutoMan kill !" << endl;
	}
};

int main(void)
{
	AutoFather* autoFather = new TaiLuoAutoMan;
	autoFather->kill();
	autoFather->taiLuoLight();
	delete autoFather;
	return 0;
}