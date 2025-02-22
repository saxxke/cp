//https://codeforces.com/contest/337/problem/A
#include <iostream>
#include<algorithm>
using namespace std;

int main() {
	int n,m;
	cin>>n>>m;
	int ans=100000;
	int arr[m];
	for(int i=0;i<m;i++){
		cin>>arr[i];
	}  
sort(arr,arr+m);
	for(int i=n;i<=m;i++){
		ans=min(ans,abs(arr[i-1]-arr[i-n]));
	}
	cout<<ans;
 	return 0;
}