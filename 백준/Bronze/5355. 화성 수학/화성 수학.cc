#include <iostream>
#include <vector>
using namespace std;

int main(){
    char op;
    int rep;
    double answer;

    cin>>rep;
    for(int i=0; i<rep; i++){
     cin>>answer;
    while(1){
        op = cin.get();
        if(op == '\n') break;
        else{
              if(op == '@') answer *= 3;
              else if(op == '%') answer += 5;
              else if(op == '#') answer -= 7;
            }
    }
    cout.precision(2);
    cout<<fixed;
    cout<<answer;
    cout<<"\n";
    }
    
}