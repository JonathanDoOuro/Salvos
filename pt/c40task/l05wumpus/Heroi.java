package pt.c40task.l05wumpus;

public class Heroi extends Componente{
	Heroi (int l, int c, Caverna caverna) {
		super('P', l, c, caverna);
		this.artefato = true;
	}
	private Caverna caverna;
	private int qtdFlexas = 1;
	
	private boolean flexaEquipada = false;
	public void equiparFlexa() {
		this.flexaEquipada = true;
	}
	public boolean isFlexaEquipada() {
		return this.flexaEquipada;
	}
	
	private boolean ouroCapturado = false;
	public void capturarOuro() {
		this.ouroCapturado = true;
	}
	public boolean isOuroCapturado() {
		return this.ouroCapturado;
	}
	
	public int getQtdFlexas() { return this.qtdFlexas; };
	
	public void mover(char mov) {
		caverna.movimentar(mov, this.l, this.c);
	}
	
	
	
}
