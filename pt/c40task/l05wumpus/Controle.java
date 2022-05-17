package pt.c40task.l05wumpus;

public class Controle {
	//private Caverna caverna;
	private Heroi heroi;
	private int score = 0;
	private boolean estadoDoJogo = true;
	
	Controle(Heroi heroi) {
		this.heroi = heroi;
	}
	
	public boolean getEstadoDoJogo() {
		return estadoDoJogo;
	}
	
	public boolean movimentoValido(char mov, int l, int c) {
		if (mov == 'w' && c-1 <= 0) {
			return true;
		}else if (mov == 's' && c+1 <= 3) {
			return true;
		}else if (mov == 'a' && l-1 <= 0) {
			return true;
		}else if (mov == 'd' && l+1 <= 3) {
			return true;
		}else {
			return false;
		}
	}
	
	public void agir(char mov) {
		if (mov == 'k') {
			heroi.equiparFlexa();
		}else if (mov == 'c') {
			heroi.capturarOuro();
		}else if (mov == 'q') {
			this.estadoDoJogo = false;
		}
		else if (movimentoValido(mov, heroi.l, heroi.c)) { 
			heroi.mover(mov); 
		}
	}
}
