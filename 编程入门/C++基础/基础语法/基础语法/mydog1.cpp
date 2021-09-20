#include <iostream>
#include <string>
using namespace std;

class MyDog
{
public:
	MyDog(){};
	MyDog(const string& arg_breed, const string& arg_name, bool arg_master) :breed(arg_breed), name(arg_name), master(arg_master)
	{
		cout << "我的品种是: " << breed << endl;
		cout << "我的名字是: " << name << endl;
		if (master)
			cout << "我有主人，不是流浪狗" << endl;
		else
			cout << "我没有主人，是一条流浪狗" << endl;
	}
	// 狂叫能力
	void bark(void)
	{
		cout << "无能狂怒..." << endl;
	}

	// 跳跃能力
	void jump(void)
	{
		cout << "跳跃..." << endl;
	}

	// 拆家能力
	void demolition(void)
	{
		cout << "拆家..." << endl;
	}

	void setName(const string& name)
	{
		this->name = name;
	}

	string getName(void)
	{
		return this->name;
	}

	void setBreed(const string& breed)
	{
		this->breed = breed;
	}

	string getBreed(void)
	{
		return this->breed;
	}

	void setMaster(bool master)
	{
		this->master = master;
	}

	bool getMaster(void)
	{
		return this->master;
	}

	~MyDog()
	{
		cout << "主人来世再见..." << endl;
	}

private:
	string breed; // 品种
	string name; // 名字
	bool master; // 是否有主人

};

int main(void)
{
	string breed = "哈士奇";
	string name = "拆家王";
	bool master = true;

	cout << "========================== 测试第一条狗 ==========================" << endl;

	{
		MyDog dog1(breed, name, master); // 调用有参构造函数
		dog1.bark();
		dog1.jump();
		dog1.demolition();
	}

	cout << "========================== 测试第二条狗 ==========================" << endl;

	{
		MyDog dog2; // 调用无参构造函数
		dog2.setName(name);
		dog2.setBreed(breed);
		dog2.setMaster(true);
		cout << "狗的名字是: " << dog2.getName() << endl;
		cout << "狗的品种是: " << dog2.getBreed() << endl;
		cout << "狗有主人: " << dog2.getMaster() << endl;
	}

	cout << "========================== 测试第三条狗 ==========================" << endl;

	{
		MyDog* dog3 = new MyDog(breed, name, master); // 调用有参构造函数
		dog3->bark();
		dog3->jump();
		dog3->demolition();
		delete dog3;
	}

	cout << "========================== 测试第四条狗 ==========================" << endl;

	{
		MyDog* dog4 = new MyDog; // 调用无参构造函数
		dog4->setName(name);
		dog4->setBreed(breed);
		dog4->setMaster(true);
		cout << "狗的名字是: " << dog4->getName() << endl;
		cout << "狗的品种是: " << dog4->getBreed() << endl;
		cout << "狗有主人: " << dog4->getMaster() << endl;
		delete dog4;
	}

	return 0;
}