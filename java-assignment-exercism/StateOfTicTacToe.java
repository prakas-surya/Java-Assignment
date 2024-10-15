class StateOfTicTacToe {
    public GameState determineState(String[] board) {
        boolean xWon = false;
        boolean oWon = false;
        int countX = 0, countO = 0;
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0)==board[i].charAt(1) && board[i].charAt(1)==board[i].charAt(2)) {
                if (board[i].charAt(0) == 'X') xWon = true;
                else if (board[i].charAt(0) == 'O') oWon = true;
            }
            if (board[0].charAt(i)==board[1].charAt(i) && board[1].charAt(i)==board[2].charAt(i)) {
                if (board[0].charAt(i) == 'X') xWon = true;
                else if (board[0].charAt(i) == 'O') oWon = true;
            }
            for (int j = 0; j < 3; j++) {
                if (board[i].charAt(j) == 'X') countX++;
                else if (board[i].charAt(j) == 'O') countO++;
            }
        }
        if (board[0].charAt(0) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(2)) {
            if (board[0].charAt(0) == 'X') xWon = true;
            else if (board[0].charAt(0) == 'O') oWon = true;
        }
        
        if (board[0].charAt(2) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(0)) {
            if (board[0].charAt(2) == 'X') xWon = true;
            else if (board[0].charAt(2) == 'O') oWon = true;
        }
        if (xWon && oWon) {
            throw new IllegalArgumentException("Impossible board: game should have ended after the game was won");
        }
        if (countO > countX) throw new IllegalArgumentException("Wrong turn order: O started");
        if ((xWon || oWon) && countX >= countO) return GameState.WIN;
        if (countX + countO == 9) return GameState.DRAW;
        if (countX > countO + 1) throw new IllegalArgumentException("Wrong turn order: X went twice");
        return GameState.ONGOING;
    }
}
