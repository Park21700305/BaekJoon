#include <iostream>
#include <vector>
using namespace std;

vector<int> list[101];
bool check[101];
int answer = 0;

void dfs(int num){
	check[num] = true;
	for(int i=0; i<list[num].size(); i++){
		int tmp = list[num][i];
		if(check[tmp] == false){
			dfs(tmp);
			answer++;
		}
	}
}

int main(){
	int n, m;
	int num1, num2;
	cin>>n>>m;

	for(int i=0; i<m; i++){
		cin>>num1>>num2;
		list[num1].push_back(num2);
		list[num2].push_back(num1);
	}
	dfs(1);
	cout<<answer<<"\n";

	return 0;
}