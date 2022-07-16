#include <iostream>
#include <vector>
using namespace std;

int main(){
 
    vector<double> good,bad;
    double gg, gb, bg, bb;
    int now, day;

    cin>>day>>now;
    cin>>gg>>gb>>bg>>bb;
    if(now == 0){
        good.push_back(gg);
        bad.push_back(gb);
    }
    else{
        good.push_back(bg);
        bad.push_back(bb);
    }
    for(int i=1; i<day; i++){
        good.push_back(good[i-1]*gg + bad[i-1]*bg);
        bad.push_back(bad[i-1]*bb + good[i-1]*gb);
    }
    cout << fixed;
    cout.precision(0);

    cout<<good[day-1]*1000<<"\n";
    cout<<bad[day-1]*1000<<"\n";

return 0;
}


