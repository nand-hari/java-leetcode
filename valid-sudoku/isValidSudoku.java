class Solution {
    public boolean isValidSudoku(char[][] board) {

        // check rows
        for (int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[row][j] == '.')
                    continue;
                if (!seen.add(board[row][j]))
                    return false;
            }
        }

        // check column
        for (int col = 0; col < 9; col++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][col] == '.')
                    continue;
                if (!seen.add(board[i][col]))
                    return false;
            }
        }

        // check box
        for (int sq = 0; sq < 9; sq++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (sq / 3) * 3 + i;
                    int col = (sq % 3) * 3 + j;
                    if (board[row][col] == '.')
                        continue;
                    if (!seen.add(board[row][col]))
                        return false;
                }
            }
        }
        return true;

    }
}
// time - O(n)
