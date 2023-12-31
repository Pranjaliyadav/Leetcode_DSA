class Solution {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        
        visited = new boolean[board.length][board[0].length];

        for(int i = 0 ; i < board.length; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(dfs(i,j,0,board,word)){
                    return true;
                }
            }
        }
        return false;

    }

    public boolean dfs(int row, int col, int index, char[][] board, String word){

        if((row == -1 || row == board.length || col == -1 || col == board[0].length) ||
            visited[row][col] ||
            word.charAt(index) != board[row][col]
        ){
            return false;
        }

        visited[row][col] = true;

        if(index == word.length() - 1){
            return true;
        }

        index++;

        //down right up left
        if(dfs(row + 1, col, index, board,word) ||
            dfs(row, col+1, index, board,word) ||
            dfs(row -1, col, index, board,word) ||
            dfs(row, col - 1, index, board,word)
        ){
            return true;
        }

        visited[row][col] = false;

        return false;

    }

    
}