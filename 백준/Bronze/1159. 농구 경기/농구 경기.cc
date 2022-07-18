#include <iostream>
using namespace std;

int main(){
    string word;
    int arr[26]={0};
    int num;
    int count = 0;
    cin>>num;
    for(int i=0; i<num; i++){
        cin>>word;
        arr[word[0]-97]++;
    }
    for(int i=0; i<26; i++){
        if(arr[i] > 4){
            cout<<(char)(i+97);
            count++;
        }
    }
    if(count == 0) cout<<"PREDAJA\n";
    return 0;
}