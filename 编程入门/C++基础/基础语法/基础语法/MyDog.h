#include <iostream>
#include <string>
using namespace std;

class MyDog
{
public:
	MyDog(){};
	MyDog(const string& arg_breed, const string& arg_name, bool arg_master);
	// 狂叫能力
	void bark(void);
	// 跳跃能力
	void jump(void);
	// 拆家能力
	void demolition(void);
	void setName(const string& name);
	string getName(void);
	void setBreed(const string& breed);
	string getBreed(void);
	void setMaster(bool master);
	bool getMaster(void);

	~MyDog();

private:
	string breed; // 品种
	string name; // 名字
	bool master; // 是否有主人

};