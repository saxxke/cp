#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        string s;
        cin >> s;
        string a;
        pair<int, int> p1, p2;
        for (int i = 0; i < s.length(); i++)
        {
            if (s[i] == '1')
            {
                a = s.substr(i);
                p1 = {i, s.length() - 1};
                break;
            }
        }
        if (a.empty())
        {
            cout << "1 1 1 1\n";
        }
        else
        {
            int m = 0, n = 0;
            for (int i = 0; i < a.length(); i++)
            {
                if (a[i] == '0')
                {
                    n = i;
                    m = a.length() - i;
                    break;
                }
            }
            if (m == 0)
            {
                for (int i = 0; i < s.length(); i++)
                {
                    if (s[i] == '0')
                    {
                        p2 = {i, i};
                        break;
                    }
                }
            }
            else
            {
                p2 = {0, 0};
                string ans1 = a;

                for (int i = 0; i + m <= s.length(); i++)
                {
                    string ans2 = a;

                    for (int j = i; j < i + m; j++)
                    {
                        ans2[j - i + n] = ((ans2[j - i + n] - '0') ^ (s[j] - '0')) + '0';
                    }

                    if (ans2 > ans1)
                    {
                        ans1 = ans2;
                        p2 = {i, i + m - 1};
                    }
                }
            }
            cout << p1.first + 1 << ' ' << p1.second + 1 << ' ' << p2.first + 1 << ' ' << p2.second + 1 << endl;
        }
    }

    return 0;
}
