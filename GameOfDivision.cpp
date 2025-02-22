#include <bits/stdc++.h>
using namespace std;
void solve()
{
    int n, k;
    cin >> n >> k;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    for(int i = 0 ; i < n ; i++){ 
        bool ok =true; 
 
        for(int j = 0 ; j < n ; j++){ 
            if(i==j){continue;} 
 
            int abval = abs(a[i] - a[j]); 
            if(abval % k  == 0){ 
                ok = false; 
                break; 
            } 
 
        } 
 
        if(ok){ 
            cout<< "YES"<< endl; 
            cout << i+1 << endl; 
            return; 
             
        } 
    } 
 
    cout  << "NO"<< endl;
}
main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    long long t;
    cin >> t;

    while (t--)
    {
        solve();
    }
    return 0;
}
