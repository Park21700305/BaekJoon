#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(vector<int> cookie){
    int answer = 0;

    for(int i=0; i<cookie.size() - 1; i++){
        int suml = cookie[i];
        int sumr = cookie[i + 1];
        int l_idx = i;
        int r_idx = i + 1;

        while(1){

            if(suml == sumr)
                answer = max(answer, suml);

            if(suml > sumr){
                if(r_idx + 1 == cookie.size()) break;
                sumr += cookie[++r_idx];
            }
            else{
                if(l_idx - 1 < 0) break;
                suml += cookie[--l_idx];
            }            

        }
    }

    return answer;
}