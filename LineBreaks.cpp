
//https://codeforces.com/contest/2050/problem/A
#include <bits/stdc++.h>
using namespace std;

int main() {
   int t;  
    cin >> t;

    while (t--) {
        int n, m;  
        cin >> n >> m;

        vector<string> words(n);
        for (int i = 0; i < n; ++i) {
            cin >> words[i];  
        }

        int l = 0;  
        int x = 0;  

        for (int i = 0; i < n; ++i) {
            int w = words[i].length();

            if (l + w <= m) {
                l += w;  
                ++x; 
            } else {
                break; 
            }
        }

        cout << x << endl; 
    }  
    return 0;
}
