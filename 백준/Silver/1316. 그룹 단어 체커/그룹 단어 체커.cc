#include <iostream>
using namespace std;

int main(){
    int num,j;
    int answer = 0;
    string word;
    int arr[26];
    
    cin>>num;
    for(int i=0; i<num; i++){
        fill_n(arr, 26, 0);
        cin>>word;
        if(word.length() == 1) answer++;
        else{
            arr[word[0]-97]=-1;
            for(j=1; j<word.length(); j++){
            if(word[j] != word[j-1]){
                if(arr[word[j]-97] == 0) arr[word[j]-97]--; 
                else break;
            }
        }
        if(j == word.length()) answer++;
    }
    }        
    cout<<answer;
}