class Solution {
    // Always think about else after thinking about else if.
    public boolean validUtf8(int[] data) {
        if (data == null) {
            return false;
        }
        int i = 0;
        int n = data.length;
        
        while (i < n) {
            if (isLeadOne(data[i])) {
                i++;
            } else if (isLeadTwo(data[i])) {
                if (i + 1 >= n) {
                    return false;
                }
                if (isTrailing(data[i+1])) {
                    i += 2;
                    continue;
                }
                return false;
            } else if (isLeadThree(data[i])) {
                if (i + 2 >= n) {
                    return false;
                }
                if (isTrailing(data[i+1]) && isTrailing(data[i+2])) {
                    i += 3;
                    continue;
                }
                return false;
            } else if (isLeadFour(data[i])) {
                if (i + 3 >= n) {
                    return false;
                }
                if (isTrailing(data[i+1]) && isTrailing(data[i+2]) && isTrailing(data[i+3])) {
                    i += 4;
                    continue;
                }
                return false;
            } else {
                return false;
            }
        }
        return true;
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