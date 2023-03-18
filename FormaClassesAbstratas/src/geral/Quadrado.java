package geral;

public class Quadrado extends FormaBidimensional {
    private double lado;
    public double area;
    public double perimetro;

    public Quadrado(double lado) {
        this.lado = lado;
        this.area = lado * lado;
        this.perimetro = lado * 4;
    }

    public Quadrado(double lado, String cor, String corDaBorda, double espessuraDaBorda) {
        super(cor, corDaBorda, espessuraDaBorda);
        this.lado = lado;
        this.area = lado * lado;
        this.perimetro = lado * 4;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimetro() {
        return perimetro;
    }

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + ", area=" + area + ", perimetro=" + perimetro + ", getArea()=" + getArea()
				+ ", getPerimetro()=" + getPerimetro() + ", toString()=" + super.toString() + ", getCorDaBorda()="
				+ getCorDaBorda() + ", getEspessuraDaBorda()=" + getEspessuraDaBorda() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
    
}

