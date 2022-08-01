#include <iostream>
#include <algorithm>
#include <string>
#include <vector>
using namespace std;

int main(){
	ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n;
    int tmp_n;
    vector<string> v[210];
     
    cin >> n;

    for(int i=1;i<=n;i++){
        string tmp_str;
        cin >> tmp_n;
        cin >> tmp_str;
        v[tmp_n].push_back(tmp_str);  
    }
    
    for(int i=1;i<=200;i++){
        for(int j=0;j<v[i].size();j++){
            cout << i << ' ' << v[i][j] << '\n';
        }
    }
	return 0;
}