// 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
// 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
// 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
#include <iostream>
#include <string>
using namespace std;
 
int main(){
	bool vowel;	
	bool check;	
	bool flag;	
	bool result; 
	int count;	
	string pw;
	char pre;
	char v[5] = {'a', 'e', 'i', 'o', 'u'};
 
	while (1) {
		vowel = false;
		flag = false;
		check = false;
		count = 0;
 
		cin >> pw;
		if (pw == "end") {
			break;
		}
		for (int i=0; i<pw.length(); i++) {
			result = false;
			if (i != 0) {	// 3번 조건
				if (pw[i] == pw[i-1] && pw[i] != 'e' && pw[i] != 'o') {
					flag = true;
					break;
				}
			}
 
			for (int j=0; j<5; j++) {
				if (pw[i] == v[j]) {
					if (check == false) {
						count = 0;
					}
					vowel = true;
					check = true;
					result = true;
					count++;
				}
			}
 
			if (!result) {
				if (check == true) {
					count=0;
				}
				check = false;
				count++;
			}
 
			if (count == 3) {	
				flag=true;
				break;
			}
 
			if (flag) {
				break;
			}
		}
		if (!vowel) {	
			flag = true;
		}
 
		if (flag) {
			cout << "<" << pw << "> is not acceptable." << endl;
		}
		else {
			cout << "<" << pw << "> is acceptable." << endl;
		}
	}
}

