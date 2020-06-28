package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //se nao colocasse o java ja ia deixar null de qualquer jeito
	}

	//somente classes do mesmo pacote e subclasses podem acessar o tabuleiro
	protected Board getBoard() {
		return board;
	}
	
	// abstrato pq eu nao sei o movimento de uma peça generica só sei das peças especificas
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
