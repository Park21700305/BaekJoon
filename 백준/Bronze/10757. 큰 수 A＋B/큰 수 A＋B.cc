#include <iostream>
#include <algorithm> 
using namespace std;

int main(){

    string a, b;
    string tmp = "";
    string answer = "";
    cin >> a >> b;

    int la = a.length();
    int lb = b.length();

    if (lb > la) {
        swap(a, b);
        swap(la, lb);
    }

    if (la != lb){
        for (int i=0; i<(la-lb); i++)
            tmp += "0";
    }
    b = tmp+b;

    int carry = 0; 
    int x, y, digit; 
    for (int i=la-1; i>=0; i--){
        x = a[i] - '0';
        y = b[i] - '0';
        digit = x + y;
        if (carry == 1) {
            digit++;
            carry = 0;
        }
        if (digit > 9) 
            carry = 1;
        answer += digit%10 + '0'; 
    }

    if (carry == 1)
        answer += "1";

    for (int i=answer.length() - 1; i>=0; i--){
        cout << answer[i];
    }
}