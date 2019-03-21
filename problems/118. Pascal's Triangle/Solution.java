class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();
        if (numRows <= 0) {
            return result;
        }

        List<Integer> lastRow = new ArrayList<>();
        lastRow.add(1);
        result.add(lastRow);
        for (int numRow = 1; numRow < numRows; numRow++) {
            int numEle = numRow + 1;
            List<Integer> thisRow = new ArrayList<>();
            thisRow.add(1);
            for (int i = 1; i < numEle - 1; i++) {
                thisRow.add(lastRow.get(i - 1) + lastRow.get(i));
            }
            thisRow.add(1);
            result.add(thisRow);
            lastRow = thisRow;
        }
        return result;
    }
}