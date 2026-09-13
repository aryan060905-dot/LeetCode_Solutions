class Solution {
    public int fib(int n) {

        int p = 0;
        int i = 1;
        int count = 2;

        if (n == 0) {
            return 0;
        }

        while (count <= n) {

            int temp = i;
            i = p + i;
            p = temp;

            count++;
        }

        return i;
    }
}