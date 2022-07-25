#include <iostream>
using namespace std;
 
class Stack {
public:
	int stack[10000]; 
	int size; 
 
	Stack(){ 
        size = 0;
         }
 
	void push(int data){
		stack[size] = data;
		size += 1;
	}
 
	bool empty(){
		if (size == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
 
	int pop() {
		if (empty())
		{
			return -1;
		}
		else
		{
			stack[size - 1] = 0;
			size -= 1;
			return stack[size];
		}
	}
 
	int top() {
		if (empty())
		{
			return -1;
		}
		else
		{
			return stack[size - 1];
		}
	}
	
 
};
 
int main() {

	int N;
	cin >> N;
 
	Stack s;
 
	for (int i = 0; i < N; i++)
	{
		string cmd; 
		cin >> cmd; 
 
		if (cmd == "push")
		{
			int data;
			cin >> data;
			s.push(data);
		}
		else if (cmd == "pop")
		{
			cout << (s.empty() ? -1 : s.top()) << '\n';
			if (!s.empty())
			{
				s.pop();
			}
		}
		else if (cmd =="size")
		{
			cout << s.size << "\n";
		}
		else if (cmd =="empty")
		{
			cout << s.empty() << "\n";
		}
		else if (cmd == "top")
		{
			cout << s.top() << "\n";
		}
	}
 
	return 0;
 
}