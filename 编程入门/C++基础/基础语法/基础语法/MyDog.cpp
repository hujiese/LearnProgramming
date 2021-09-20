#include "MyDog.h"

MyDog::MyDog(const string& arg_breed, const string& arg_name, bool arg_master) :breed(arg_breed), name(arg_name), master(arg_master)
{
	cout << "我的品种是: " << breed << endl;
	cout << "我的名字是: " << name << endl;
	if (master)
		cout << "我有主人，不是流浪狗" << endl;
	else
		cout << "我没有主人，是一条流浪狗" << endl;
}
// 狂叫能力
void MyDog::bark(void)
{
	cout << "无能狂怒..." << endl;
}

// 跳跃能力
void MyDog::jump(void)
{
	cout << "跳跃..." << endl;
}

// 拆家能力
void MyDog::demolition(void)
{
	cout << "拆家..." << endl;
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
	cout << "主人来世再见..." << endl;
}