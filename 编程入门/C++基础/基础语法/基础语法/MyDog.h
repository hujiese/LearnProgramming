#include <iostream>
#include <string>
using namespace std;

class MyDog
{
public:
	MyDog(){};
	MyDog(const string& arg_breed, const string& arg_name, bool arg_master);
	// �������
	void bark(void);
	// ��Ծ����
	void jump(void);
	// �������
	void demolition(void);
	void setName(const string& name);
	string getName(void);
	void setBreed(const string& breed);
	string getBreed(void);
	void setMaster(bool master);
	bool getMaster(void);

	~MyDog();

private:
	string breed; // Ʒ��
	string name; // ����
	bool master; // �Ƿ�������

};