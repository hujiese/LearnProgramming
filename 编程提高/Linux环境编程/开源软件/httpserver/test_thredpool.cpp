#include <iostream>
#include "threadpool.h"

using namespace std;


class Worker
{
public:
    void process()
    {
        cout << "This is WorkerA !" << endl;
    }
};

int main(void)
{
    threadpool< Worker > pool(2, 10);

    for(int i = 0; i < 10; ++i)
    {
        Worker worker;
        pool.append(&worker);
    }

    while(true);
    return 0;
}