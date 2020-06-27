package boardgame;

public class Piece {
	
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
	
}
