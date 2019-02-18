class Solution {
    // Time: O(NlogN) Space: O(logN) (Overhead of recursive by QuickSort)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m;
        for (int i = 0; i < n; i++) {
            nums1[index] = nums2[i];
            index++;
        }

        Arrays.sort(nums1);
    }
}