class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int left = 0;

        while (top <= bottom) {
            int midCol = top + (bottom - top - 1) / 2;
            if (matrix[midCol][0] == target) {
                return true;
            } else {
                while (left <= right) {
                    int midRow = left + (right - left - 1) / 2;
                    if (matrix[midCol][midRow] == target) {
                        return true;
                    } else if (matrix[midCol][midRow] < target) {
                        right = midRow - 1;
                    } else {
                        left = midRow + 1;
                    }
                }
                if (matrix[midCol][0] < target) {
                    bottom = midCol - 1;
                } else {
                    top = midCol + 1;
                }
            } 
        }
        return false;
    }
}
