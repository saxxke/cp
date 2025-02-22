#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n, k;
        cin >> n >> k;
        vector<int> ans(n, -1);
        int c = 1;
        int i = k - 1;
        while (i <= n - 1)
        {
            ans[i] = c;
            c++;
            i += k;
        }
        i = 0;
        while (i< n)
        {
            if (ans[i] == -1)
            {
                ans[i] = c;
                c++;
            }
            i++;
        }
        for (int j = 0; j < n; j++)
        {
            cout << ans[j] << " ";
        }
        cout << endl;
    }
    return 0;
}
