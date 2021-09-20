#include <iostream>

using namespace std;

class animal
{
public:
	void eat(void)
	{
		cout << "animal eat !" << endl;
	}
};

class bear :virtual public animal
{
public:
	// 熊的技能是站立
	void standup()
	{
		cout << "bear stand up !" << endl;
	}
};

class cat :virtual public animal
{
public:
	// 猫的技能是伸爪子
	void scratch()
	{
		cout << "cat scratch !" << endl;
	}
};

class panda : public cat, public bear
{
	// 熊猫同时具备熊和猫的技能
};

int main(void)
{
	panda pda;
	pda.scratch();
	pda.standup();
	pda.eat();
	return 0;
}