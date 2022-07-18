#include <iostream>
using namespace std;

int main(){
    string word;
    int count = 0;

    cin>>word;
        for(int i=0; i<word.length(); i++){
            cout<<word[i];
            count++;
            if(count%10 == 0) cout<<"\n";
        }
}