//https://codeforces.com/contest/2026/problem/A
#include <bits/stdc++.h>
int main()
{
    int t;
    std::cin >> t;
    while (t--)
    {
        int X, Y, K;
        std::cin >> X >> Y >> K;

        int a = std::min(X, Y);
        assert(a * a * 2 >= K * K);
        std::cout << 0 << " " << 0 << " " << a << " " << a << "\n";
        std::cout << 0 << " " << a << " " << a << " " << 0 << "\n";
    }

    return 0;
}