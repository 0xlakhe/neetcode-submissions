class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(!rowCheck(board)||!columnCheck(board)||!boxCheck(board)){
            return false;
        }
        return true;
    }
    
    public boolean boxCheck(char[][] board){
        for(int row=0;row<9;row+=3){
            for(int col=0;col<9;col+=3){
                HashSet<Character> map=new HashSet<>();
                for(int i=row;i<row+3;i++){
                    for(int j=col;j<col+3;j++){
                        if(board[i][j]=='.'){
                            continue;
                        }
                        if (map.contains(board[i][j])){
                            return false;
                        }
                        map.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }

    public boolean rowCheck(char[][] board){
        for(int j=0;j<board.length;j++){
            HashSet<Character> map=new HashSet<>();
            for(int i=0;i<board[j].length;i++){
                if (board[j][i]=='.'){
                    continue;
                }
                if (map.contains(board[j][i])){
                    return false;
                }
                map.add(board[j][i]);
            }
        }
        return true;
    }
    public boolean columnCheck(char[][] board){
        for(int i=0;i<board[0].length;i++){
            HashSet<Character> map=new HashSet<>();
            for(int j=0;j<board.length;j++){
                if (board[j][i]=='.'){
                    continue;
                }
                if(map.contains(board[j][i])){
                    return false;
                }
                map.add(board[j][i]);
            }
        }
        return true;
    }
}
