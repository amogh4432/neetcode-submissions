class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
    
    for(char[] row : board){
        for (char c : row) {
            if (c != '.' && set.contains(c)) {
                    return false;
                }
            if(c!='.'){
            set.add(c);
            }
        }
        set.clear();
    }

    for (int j = 0; j < 9; j++) {
    HashSet<Character> set2 = new HashSet<>();

    for (int i = 0; i < 9; i++) {
        char c = board[i][j];

        if (c != '.' && set2.contains(c)) {
            return false;
        }

        if (c != '.') {
            set2.add(c);
        }
    }
}
for (int boxRow = 0; boxRow < 9; boxRow += 3) {
    for (int boxCol = 0; boxCol < 9; boxCol += 3) {

        HashSet<Character> set3 = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                char c = board[boxRow + i][boxCol + j];

                if (c != '.' && set3.contains(c)) {
                    return false;
                }

                if (c != '.') {
                    set3.add(c);
                }
            }
        }
    }
}

    return true;
    }
}
