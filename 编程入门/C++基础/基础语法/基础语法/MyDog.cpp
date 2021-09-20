#include "MyDog.h"

MyDog::MyDog(const string& arg_breed, const string& arg_name, bool arg_master) :breed(arg_breed), name(arg_name), master(arg_master)
{
	cout << "�ҵ�Ʒ����: " << breed << endl;
	cout << "�ҵ�������: " << name << endl;
	if (master)
		cout << "�������ˣ��������˹�" << endl;
	else
		cout << "��û�����ˣ���һ�����˹�" << endl;
}
// �������
void MyDog::bark(void)
{
	cout << "���ܿ�ŭ..." << endl;
}

// ��Ծ����
void MyDog::jump(void)
{
	cout << "��Ծ..." << endl;
}

// �������
void MyDog::demolition(void)
{
	cout << "���..." << endl;
}

void MyDog::setName(const string& name)
{
	this->name = name;
}

string MyDog::getName(void)
{
	return this->name;
}

void MyDog::setBreed(const string& breed)
{
	this->breed = breed;
}

string MyDog::getBreed(void)
{
	return this->breed;
}

void MyDog::setMaster(bool master)
{
	this->master = master;
}

bool MyDog::getMaster(void)
{
	return this->master;
}

MyDog::~MyDog()
{
	cout << "���������ټ�..." << endl;
}