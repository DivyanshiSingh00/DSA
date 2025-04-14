Link- https://leetcode.com/problems/reverse-integer/
class Solution {
public:
    int reverse(int x) {
        int sum = 0;
        int d;
        while (x != 0) {
            d = x % 10;
            if ((sum > INT_MAX / 10) || (sum < INT_MIN / 10)){
                return 0;
                }
            sum = sum * 10 + d;
            x = x / 10;
            
        }
        return sum;
    }
};
