#include "MyDog.h"
#include <iostream>

using namespace std;


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