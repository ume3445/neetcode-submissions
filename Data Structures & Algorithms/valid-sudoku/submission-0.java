class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    continue;
                } else {
                    if (set.contains(board[i][j])) {
                        return false;
                    } else {
                        set.add(board[i][j]);
                    }
                }
            }
            set.clear();
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == '.') {
                    continue;
                } else {
                    if (set.contains(board[j][i])) {
                        return false;
                    } else {
                        set.add(board[j][i]);
                    }
                }
            }
            set.clear();
        }

        for (int u = 0; u < 9; u++) {
            int startRow = (u / 3) * 3;
            int startCol = (u % 3) * 3;
            for (int i = startRow; i < 3; i++) {
                for (int j = startCol; j < 3; j++) {
                    if(board[i][j] == '.') {
                        continue;
                    } else {
                        if (set.contains(board[i][j])) {
                            return false;
                        } else {
                            set.add(board[i][j]);
                        }
                    }
                }
            }
            set.clear();
        }
        return true;
    }
}
