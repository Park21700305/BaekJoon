#include <iostream>
using namespace std;
int main() {
    int time[21];
    int n;
    int m = 0, y = 0;
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        cin >> time[i];
        m += (time[i] / 60 + 1) * 15;
        y += (time[i] / 30 + 1) * 10;
    }
    if (m < y)
        cout << "M " << m;
    else if (m > y)
        cout << "Y " << y << '\n';
    else
        cout << "Y M " << y << '\n';
}