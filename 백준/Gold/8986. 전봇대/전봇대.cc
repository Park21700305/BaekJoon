#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

vector<ll> v;

ll calc(ll k){
	ll ret = 0;
	for(int i=0; i<v.size(); i++){
		ret += abs(i*k - v[i]);
	}
	return ret;
}

int main(){
	int n; cin >> n;
	v.resize(n);
	for(int i=0; i<n; i++){
		cin >> v[i];
	}

	ll s = 1, e = 1e9;
	while(s+3 <= e){
		int l = (2*s + e) / 3;
		int r = (s + 2*e) / 3;
		ll costL = calc(l);
		ll costR = calc(r);
		if(costL < costR){
			e = r;
		}else{
			s = l;
		}
	}

	ll ans = 1e18;
	for(int i=s; i<=e; i++){
		ans = min(ans, calc(i));
	}
	cout << ans;
}