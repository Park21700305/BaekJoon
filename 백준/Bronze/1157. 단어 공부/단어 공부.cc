#include <iostream>
//#include <algorithm>
using namespace std;

// string solution(string word){
//     int count = 0;
//     int max = 0;
//     int idx;
//     string answer = "";
//     transform(word.begin(), word.end(), word.begin(), ::toupper);
//     for(int i=0; i<word.length(); i++){
//         for(int j=i; j<word.length(); j++){
//             if(word[i] == word[j]) count++;
//         }
//         if(count > max){
//             max = count;
//             idx = i;
//         }
//         else if(count == max){
//             answer = "?";
//             return answer;
//             }
//         count = 0;
//     }
//     answer = word[idx];
//     return answer;
// }

void solution(string word){
    int arr[26]={0};
    int count = 0;
    int max = 0;
    int idx;
    for(int i=0; i<word.length(); i++){
        if(word[i] > 90) arr[word[i]-97]++;
        else arr[word[i]-65]++;
    }
    for(int i=0; i<26; i++){
        if(max < arr[i]){
            max = arr[i];
            idx = i;
        }
    }
    for(int i=0; i<26; i++) if(max == arr[i]) count++;
    if(count > 1) cout<<"?\n";
    else cout<<(char)(idx+65)<<"\n";
}

int main(){
    string word;
    cin>>word;
    solution(word);
    return 0;
}