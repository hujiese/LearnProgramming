#include <iostream>

using namespace std;

class AutoFather
{
protected:
	virtual void kill(void) = 0;
};

class TaiLuoAutoMan:public AutoFather
{
public:
	void kill(void)
	{
		cout << "TaiLuoAutoMan kill !" << endl;
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
	TaiLuoAutoMan taiLuoAutoMan;
	JackAutoMan jackAutoMan;
	taiLuoAutoMan.kill();
	jackAutoMan.kill();

	return 0;
}