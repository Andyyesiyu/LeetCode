class Solution {
    public int search(int[] a, int target) {
        if (a.length == 0)
            return -1;
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if ((a[m] - a[a.length - 1]) * (target - a[a.length - 1]) > 0) {
                if (target == a[m]) {
                    return m;
                } else if (target > a[m]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            } else if (target > a[a.length - 1]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        if (a[l] == target)
            return l;
        return -1;
    }
}