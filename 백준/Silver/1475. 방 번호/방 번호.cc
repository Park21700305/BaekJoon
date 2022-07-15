#include<bits/stdc++.h>
using namespace std;
 
int main() {
	string s;
    int arr[10]={0};
	int tmp;
    
	cin >> s;
	for(int i=0; i<s.size();i++){
		tmp = s[i]-'0';
		if(tmp ==9) {
			arr[6]++;
		}
		else{
			arr[tmp]++;
		}
	}
 
	int max = 1;
	
	if(arr[6] % 2==0){
		arr[6] = ceil(arr[6]/2);	
	}else{
		arr[6] = ceil(arr[6]/2)+1;
	}
	
	for(int i=0; i<9; i++){
		if(max < arr[i]){
			max = arr[i];
		}
	}
 
	cout << max;
 
	return 0;
}