package pt.c40task.l05wumpus;

public class Componente {
	protected char caracter; 
	protected boolean vida;
	protected boolean artefato;
	protected int l, c;
	Caverna caverna;
	
	public Componente(char caracter, int l, int c, Caverna caverna) {
		this.caracter = caracter;
		this.l = l;
		this.c = c;
		this.vida = true;
		this.artefato = false;
		this.caverna = caverna;
	}
	
	public void instanciarSecundarios() {
		
	}
	
	public void conectarCaverna(Caverna caverna) {
		this.caverna = caverna;
	}
	
	public void setPosicao(int l, int c) {
		this.l = l;
		this.c = c;
	}
	
	public int getLinha() { return this.l; };
	
	public int getColuna() { return this.c; };
	
	public boolean temArtefato() {
		return artefato;
	}
	
	public void setArtefato(boolean artefato) {
		this.artefato = artefato;
	}
	
	public boolean getVida() {
		return vida;
	}
	
	public void setVida(boolean vida) {
		this.vida = vida;
	}
	
	public char getCaracter() {
		return caracter;
	}
 
}
