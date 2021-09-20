#include "MyDog.h"
#include <iostream>

using namespace std;


int main(void)
{
	string breed = "��ʿ��";
	string name = "�����";
	bool master = true;

	cout << "========================== ���Ե�һ���� ==========================" << endl;

	{
		MyDog dog1(breed, name, master); // �����вι��캯��
		dog1.bark();
		dog1.jump();
		dog1.demolition();
	}

	cout << "========================== ���Եڶ����� ==========================" << endl;

	{
		MyDog dog2; // �����޲ι��캯��
		dog2.setName(name);
		dog2.setBreed(breed);
		dog2.setMaster(true);
		cout << "����������: " << dog2.getName() << endl;
		cout << "����Ʒ����: " << dog2.getBreed() << endl;
		cout << "��������: " << dog2.getMaster() << endl;
	}

	cout << "========================== ���Ե������� ==========================" << endl;

	{
		MyDog* dog3 = new MyDog(breed, name, master); // �����вι��캯��
		dog3->bark();
		dog3->jump();
		dog3->demolition();
		delete dog3;
	}

	cout << "========================== ���Ե������� ==========================" << endl;

	{
		MyDog* dog4 = new MyDog; // �����޲ι��캯��
		dog4->setName(name);
		dog4->setBreed(breed);
		dog4->setMaster(true);
		cout << "����������: " << dog4->getName() << endl;
		cout << "����Ʒ����: " << dog4->getBreed() << endl;
		cout << "��������: " << dog4->getMaster() << endl;
		delete dog4;
	}

	return 0;
}