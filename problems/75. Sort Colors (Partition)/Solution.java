class Solution {
    public void sortColors(int[] nums) {
        int nextZero = 0;
        int nextTwo = nums.length - 1;
        int ptr = 0;
        while (ptr <= nextTwo) {
            int num = nums[ptr];
            int temp;
            switch (num) {
            case 0:
                temp = nums[nextZero];
                nums[nextZero] = nums[ptr];
                nums[ptr] = temp;
                nextZero++;
                ptr++;
                break;
            case 1:
                ptr++;
                break;
            case 2:
                temp = nums[nextTwo];
                nums[nextTwo] = nums[ptr];
                nums[ptr] = temp;
                nextTwo--;
                break;
            }
        }
    }
}