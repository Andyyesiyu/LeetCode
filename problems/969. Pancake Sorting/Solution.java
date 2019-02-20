class Solution {
    public List<Integer> pancakeSort(int[] A) {
        if (A == null) {
            return null;
        }
        return pancakeSortHelper(A, A.length - 1, new LinkedList<Integer>());
    }

    private List<Integer> pancakeSortHelper(int[] A, int to, List<Integer> result) {
        if (to == 0) {
            return result;
        }
        if (A[to] == to + 1) {
            return pancakeSortHelper(A, to - 1, result);
        }
        // Make A[to] == to + 1
        for (int i = 0; i < to; i++) {
            if (A[i] == to + 1) {
                flip(A, i + 1);
                result.add(i + 1);
                break;
            }
        }
        flip(A, to + 1);
        result.add(to + 1);
        return pancakeSortHelper(A, to - 1, result);
    }

    private void flip(int[] A, int k) {
        int p = 0;
        int q = k - 1;
        while (p < q) {
            int temp = A[p];
            A[p] = A[q];
            A[q] = temp;
            p++;
            q--;
        }
    }
}