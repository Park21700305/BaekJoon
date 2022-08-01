#include <iostream>
#include <algorithm>
using namespace std;

class Problem {
public :
	int score; 
	int num;       
};

bool cmp(Problem a, Problem b) {
	return a.score > b.score;
}

int main() {
	Problem* p = new Problem[8];
	int sum = 0;
	int arr[8]; 

	for (int i = 0; i < 8; i++) {
		cin >> p[i].score;
		p[i].num = i + 1;
	}

	stable_sort(p, p + 8, cmp);

	for (int i = 0; i < 5; i++) {
		sum += p[i].score;
		arr[i] = p[i].num;
	}

	sort(arr, arr + 5);

	cout << sum << "\n";
	for (int i = 0; i < 5; i++) {
		cout << arr[i] << " ";
	}
	
	return 0;
}
