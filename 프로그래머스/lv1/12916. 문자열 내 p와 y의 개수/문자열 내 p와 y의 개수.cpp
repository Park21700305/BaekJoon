#include <string>
#include <iostream>
#include <cstring>
using namespace std;

bool solution(string s)
{
    bool answer = true;
    int countP =0;
    int countY =0;

    for(int i=0; i<s.length(); i++){
        s[i] = tolower(s[i]);
        if(s[i] == 'y') countY++;
        if(s[i] == 'p') countP++;
    }

    if(countY != countP){
        answer = false;
        return answer;
    }
    

    return answer;
}