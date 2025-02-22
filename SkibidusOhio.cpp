#include <bits/stdc++.h>
using namespace std;
void solve()
{
    string s;
    cin >> s;
    bool a = false;
    for (int i = 1; i < s.size(); i++)
    {
        if (s[i] == s[i - 1])
        {
            a = true;
            break;
        }
    }
    if (a)
    {
        cout << 1 << endl;
    }
    else
    {
        cout << s.size() << endl;
    }
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