#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    int t;
    cin >> t;
    while(t--){
        string n;
        cin >> n;
        long long initial_sum = 0;
        int c2 = 0, c3 = 0;
        for(char ch : n){
            int digit = ch - '0';
            initial_sum += digit;
            if(digit == 2) c2++;
            if(digit == 3) c3++;
        }
        long long target = (9 - (initial_sum %9)) %9;
        bool possible = false;
        
        for(int b=0; b<=c3; b++){
            
            long long temp = (target - 6LL * b) % 9;
            if(temp < 0) temp += 9;
            
            long long a = (temp * 5) % 9;
            
            if(a <= c2){
                possible = true;
                break;
            }
        }
        if(possible){
            cout << "YES\n";
        }
        else{
            cout << "NO\n";
        }
    }
}