#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
 
int main() {
	int n;
	vector<int> arr;
 
	cin >> n;
	int input;
	for (int i = 0; i < n; i++)
	{
		cin >> input;
		arr.push_back(input);
	}
 
	sort(arr.begin(), arr.end());
	arr.erase(unique(arr.begin(), arr.end()), arr.end());
 
	for (auto i : arr)
	{
		cout << i << " ";
	}
	return 0;
}