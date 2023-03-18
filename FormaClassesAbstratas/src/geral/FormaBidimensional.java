package geral;
public abstract class FormaBidimensional {
	
	private String cor;
    private String corDaBorda;
    private double espessuraDaBorda;
        
    public FormaBidimensional() {
    	this.setCor("preto");
    }
    
    public FormaBidimensional(String cor, String corDaBorda, double espessuraDaBorda) {
        this.corDaBorda = corDaBorda;
        this.espessuraDaBorda = espessuraDaBorda;
    }
    
    public String toString() {
        return "Forma bidimensional";
    }
    
    public abstract double getArea();
    
    public abstract double getPerimetro();
    
    public String getCorDaBorda() {
        return corDaBorda;
    }
    
    public void setCorDaBorda(String corDaBorda) {
        this.corDaBorda = corDaBorda;
    }
    
    public double getEspessuraDaBorda() {
        return espessuraDaBorda;
    }
    
    public void setEspessuraDaBorda(double espessuraDaBorda) {
        this.espessuraDaBorda = espessuraDaBorda;
    }

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
	

