#include <string>
#include <vector>

using namespace std;

bool solution(int x) {
    int result;
    if(x <= 10){
        return true;
    }
    else if(x > 10 && x < 100){
        if(x % (x/10 + x%10) == 0) return true;
        else return false;
    }
     else if(x >= 100 && x < 1000){
          if(x % (x/100 + (x%100)/10 + (x%100)%10) == 0) return true;
        else return false;
    }
     else if(x >= 1000 && x < 10000){
        if(x % (x/1000 + (x%1000)/100 + ((x%1000)%100)/10 + ((x%1000)%100)%10) == 0) return true;
        else return false;
    }
    else return true;
}