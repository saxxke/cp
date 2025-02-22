#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    int t;
    cin >> t;
    while(t--){
    long long n;
    cin>>n;
    long long c=1;
    while(n>3){
        c*=2;
        n/=4;
    }
    cout<<c<<endl;
}  
    return 0;
    }
