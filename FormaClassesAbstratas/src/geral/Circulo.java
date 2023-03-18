package geral;

public class Circulo extends FormaBidimensional {

    private double raio;
    private double area;
    private double perimetro;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public Circulo(double raio, String cor, String corBorda, double espBorda) {
        super(cor, corBorda, espBorda);
        setRaio(raio);
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimetro() {
        return perimetro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio >= 0) {
            this.raio = raio;
            this.area = Math.PI * raio * raio;
            this.perimetro = 2 * Math.PI * raio;
        }
    }

    @Override
    public String toString() {
        return "Círculo de raio " + raio;
    }
}
