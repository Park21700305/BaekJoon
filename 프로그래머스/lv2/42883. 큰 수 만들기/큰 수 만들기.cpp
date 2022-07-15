#include <string>
#include <vector>

using namespace std;

string solution(string number, int k) {
  string answer = "";  
  int length = number.size() - k;
  int startidx = 0; 

for(int i=0; i<length; i++){
    char max = number[startidx];
    int maxidx = startidx;
    for(int j=startidx; j<k+i+1; j++){
        if(number[j]>max){
            max=number[j];
            maxidx=j;
        }
    }
    answer += max;
    startidx = maxidx+1; 
}
    return answer;
  }