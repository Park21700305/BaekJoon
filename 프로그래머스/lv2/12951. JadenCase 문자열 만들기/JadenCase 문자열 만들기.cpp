#include <iostream>
#include <string>
#include <cctype>
#include <algorithm>
using namespace std;

string solution(string s) {
    transform(s.begin(), s.end(), s.begin(), ::tolower);
    if(s[0] >= 97 && s[0] <= 122) s[0] = toupper(s[0]);
    for(int i=1; i<s.length(); i++){
        if(s[i-1] == 32){
            if(s[i] >= 97 && s[i] <= 122) s[i] = toupper(s[i]);  
        }
    }
    return s;
}