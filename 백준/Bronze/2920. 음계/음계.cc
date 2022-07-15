/*다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.*/

#include <string>
#include <iostream>
#include <cstring>
using namespace std;

int main(void){
    int s[8];
    int count = 0;

    for(int i=0; i<8; i++){
        cin>>s[i];
        if(s[i] == i+1) count++;
        if(s[i] == 8-i) count--;
    }
    if(count == 8) cout<<"ascending\n";
    else if(count == -8) cout<<"descending\n";
    else cout<<"mixed\n";
    return 0;
}