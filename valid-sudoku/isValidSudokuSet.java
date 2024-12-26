class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch == '.')
                    continue;
                if (!seen.add(ch + "r" + i) || (!seen.add(ch + "c" + j)) || (!seen.add(ch + "b" + (i / 3) + (j / 3))))
                    return false;
            }
        }
        return true;

    }
}
