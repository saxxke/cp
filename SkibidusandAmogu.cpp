#include <bits/stdc++.h>
using namespace std;
void solve()
{
   string s;
        cin >> s;
        s = s.substr(0, s.size() - 2) + "i";
        cout << s << endl;
}
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int t;
    cin >> t;
    while (t--)
        solve();
    return 0;
}
