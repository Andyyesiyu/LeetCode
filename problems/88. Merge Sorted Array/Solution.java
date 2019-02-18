class Solution {
    // Time: O(N), Space: O(N)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[nums1.length];
        int index = 0;
        int p = 0;
        int q = 0;
        while (p < m && q < n) {
            if (nums1[p] <= nums2[q]) {
                result[index] = nums1[p];
                p++;
            } else {
                result[index] = nums2[q];
                q++;
            }
            index++;
        }
        if (p >= m) {
            for (; q < n; q++) {
                result[index] = nums2[q];
                index++;
            }
        } else {
            for (; p < m; p++) {
                result[index] = nums1[p];
                index++;
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = result[i];
        }
    }
}