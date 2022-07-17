#include <iostream>
using namespace std;

int main() {
    int max = 0;
    int score = 0;
    int idx = 0;


    for (int i=1; i<=5; i++){
        int sum = 0;
        for (int j=0; j<4; j++) {
            cin>>score;
            sum += score;
        }
        if (sum > max) {
            max = sum;
            idx = i;
        }
    }
    cout << idx << " " << max;
}