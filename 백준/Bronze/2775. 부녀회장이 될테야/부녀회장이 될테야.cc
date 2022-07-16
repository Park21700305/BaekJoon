#include <iostream>
using namespace std;

int Solution(int k, int n){
    if(k==0) return n;

    if(n==1) return 1;

    else return Solution(k-1,n) + Solution(k,n-1);
}

int main(){
    int num,k,n;
    cin>>num;
    for(int i=0; i<num; i++){
        cin>>k;
        cin>>n;
        cout<<Solution(k,n)<<"\n";
    }
}