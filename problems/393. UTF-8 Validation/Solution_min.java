class Solution {
    // Always think about else after thinking about else if.
    public boolean validUtf8(int[] data) {
        if (data == null) {
            return false;
        }

        // Expected number of trailing bytes.
        int expected = 0;
        
        for (int i = 0; i < data.length; i++) {
            if (isTrailing(data[i])) {
                if (expected > 0) {
                    expected--;
                    continue;
                }
                return false;
            } else if (expected > 0) {
                return false;
            }
            if (isLeadOne(data[i])) {
                expected = 0;
            } else if (isLeadTwo(data[i])) {
                expected = 1;
            } else if (isLeadThree(data[i])) {
                expected = 2;
            } else if (isLeadFour(data[i])) {
                expected = 3;
            } else {
                return false;
            }
        }
        return (expected == 0);
    }
    
    private boolean isLeadOne(int data) {
        return (data & 0x00000080) == 0;
    }
    
    private boolean isLeadTwo(int data) {
        return (data & 0x000000E0) == 0x000000C0;
    }
    
    private boolean isLeadThree(int data) {
        return (data & 0x000000F0) == 0x000000E0;
    }
    
    private boolean isLeadFour(int data) {
        return (data & 0x000000F8) == 0x000000F0;
    }
    
    private boolean isTrailing(int data) {
        return (data & 0x000000C0) == 0x00000080;
    }
}