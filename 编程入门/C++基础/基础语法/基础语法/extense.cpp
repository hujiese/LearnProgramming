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
	// �ܵļ�����վ��
	void standup()
	{
		cout << "bear stand up !" << endl;
	}
};

class cat :virtual public animal
{
public:
	// è�ļ�������צ��
	void scratch()
	{
		cout << "cat scratch !" << endl;
	}
};

class panda : public cat, public bear
{
	// ��èͬʱ�߱��ܺ�è�ļ���
};

int main(void)
{
	panda pda;
	pda.scratch();
	pda.standup();
	pda.eat();
	return 0;
}