class Solution {
public:
    bool isPalindrome(int x) {
        int sum=0;
        int m=x;
        int d;
        while(x>0){
            d=x%10;
            if ((sum > INT_MAX / 10) || (sum < INT_MIN / 10)){
                return false;
            }
            sum=sum*10+d;
            x=x/10;
        }
        if(m==sum){
            return true;
        }
        return false;
    }
};
