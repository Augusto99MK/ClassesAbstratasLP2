package geral;

abstract class Forma {
	
	private String cor;

	@SuppressWarnings("unused")
	private String getCor() {
		return cor;
	}
	
	@SuppressWarnings("unused")
	private void setCor(String cor) {
		this.cor = cor;
	}
}