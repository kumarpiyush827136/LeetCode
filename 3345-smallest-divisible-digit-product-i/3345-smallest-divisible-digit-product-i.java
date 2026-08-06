class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            if (isValid(n, t)) {
                return n;
            }
            n++;
        }
    }

    private boolean isValid(int num, int t) {
        int product = 1;
        int x = num;

        if (x == 0) return (0 % t == 0);

        while (x > 0) {
            product *= (x % 10);
            x /= 10;
            if (product == 0) return true;
        }

        return product % t == 0;
    }
}