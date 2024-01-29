#include <iostream>
using namespace std;

int main(void) {
    int ways, first;
    cin >> ways >> first;
    if (ways > 5) cout << "Love is open door\n";
    else{
        for (int i = 0; i < ways - 1; i++) {
            first = !first;
            cout << first << '\n';
        }
    }
}
