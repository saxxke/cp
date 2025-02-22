#include <iostream>
#include <vector>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<long long> a(n);
        long long total_sum = 0;
        for (int i = 0; i < n; ++i) {
            cin >> a[i];
            total_sum += a[i];
        }
        if (total_sum % n != 0) {
            cout << "NO\n";
            continue;
        }
        long long k = total_sum / n;
        int count_odd = (n + 1) / 2;
        int count_even = n / 2;
        long long sum_odd = 0, sum_even = 0;
        for (int i = 0; i < n; ++i) {
            if ((i + 1) % 2 == 1) {
                sum_odd += a[i];
            } else {
                sum_even += a[i];
            }
        }
        if (sum_odd == k * count_odd && sum_even == k * count_even) {
            cout << "YES\n";
        } else {
            cout << "NO\n";
        }
    }
    return 0;
}