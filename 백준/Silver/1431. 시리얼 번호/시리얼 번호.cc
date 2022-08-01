#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

bool compare(string a, string b){
	if (a.size() != b.size())
        return a.size() < b.size();
	else{ 
		int asum = 0;
        for (int i = 0; i < a.size(); ++i){
			if (a[i] - '0' <= 9 && a[i] - '0' >= 0)
				asum += a[i] - '0';
		}
		int bsum = 0;
		for (int i = 0; i < b.size(); ++i){
			if (b[i] - '0' <= 9 && b[i] - '0' >= 0)
			    bsum += b[i] - '0';
		}

		if (asum != bsum) 
			return asum < bsum;

		else return a < b;
	}
}

int main(){
    int N;
	vector<string> v;
	cin >> N;

	for(int i=0; i<N; i++){
		string s;
		cin >> s;
		v.push_back(s);
	}

	sort(v.begin(), v.end(), compare);
	for (int i=0; i<v.size(); i++) cout << v[i] << endl;

	return 0;
}