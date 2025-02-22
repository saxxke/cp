#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        
        vector<int> digits(s.size());
        for(int i=0; i<s.size(); i++) digits[i] = s[i] - '0';
        
        
        for(int i=1; i<digits.size(); i++){
            
            while(i >=1 && digits[i] > digits[i-1] +1 && digits[i] >0){
                
                int temp = digits[i];
                digits[i] = digits[i-1];
                digits[i-1] = temp -1;
                
                if(i >1) i--;
                else break;
            }
        }
        
        string res = "";
        for(int d : digits) res += to_string(d);
        cout << res << "\n";
    }
}