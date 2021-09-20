#include <iostream>
#include <string>
using namespace std;

class MyDog
{
public:
	MyDog(){};
	MyDog(const string& arg_breed, const string& arg_name, bool arg_master) :breed(arg_breed), name(arg_name), master(arg_master)
	{
		cout << "�ҵ�Ʒ����: " << breed << endl;
		cout << "�ҵ�������: " << name << endl;
		if (master)
			cout << "�������ˣ��������˹�" << endl;
		else
			cout << "��û�����ˣ���һ�����˹�" << endl;
	}
	// �������
	void bark(void)
	{
		cout << "���ܿ�ŭ..." << endl;
	}

	// ��Ծ����
	void jump(void)
	{
		cout << "��Ծ..." << endl;
	}

	// �������
	void demolition(void)
	{
		cout << "���..." << endl;
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
		cout << "���������ټ�..." << endl;
	}

private:
	string breed; // Ʒ��
	string name; // ����
	bool master; // �Ƿ�������

};

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