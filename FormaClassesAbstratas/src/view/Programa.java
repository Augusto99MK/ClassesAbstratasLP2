package view;

import geral.Circulo;
import geral.Quadrado;

public class Programa {

    public static void main(String[] args) {
       
        Quadrado quadrado = new Quadrado(5); // Instancia a Clase Quadrado e cria um quadrado com lado 5
    
        quadrado.setCorDaBorda("ciano");     // Seta uma cor da borda do quadrado como "ciano"
        
        quadrado.setEspessuraDaBorda(2.2); // Seta a espessura da borda do quadrado como 2.2
        
        System.out.println("Área do quadrado: " + quadrado.getArea()); // Imprime a área do quadrado
        
        System.out.println("Perímetro do quadrado: " + quadrado.getPerimetro()); // Imprime o perímetro do quadrado
        
        System.out.println("Cor da borda do quadrado: " + quadrado.getCorDaBorda()); // Imprime a cor da borda do quadrado
        
        System.out.println("Espessura da borda do quadrado: " + quadrado.getEspessuraDaBorda()); // Imprime a espessura da borda do quadrado
       
        System.out.println("Quadrado: " + quadrado.toString());  // Imprime tostring de quadrado
        
       
        Circulo circulo = new Circulo(3);  // Cria um círculo com raio 3
        
        circulo.setCorDaBorda("azul"); // Define a cor da borda do círculo como "azul"
        
        circulo.setEspessuraDaBorda(2.0); // Define a espessura da borda do círculo como 2.0
        
        System.out.println("Área do círculo: " + circulo.getArea()); // Imprime a área do círculo
        
        System.out.println("Perímetro do círculo: " + circulo.getPerimetro()); // Imprime o perímetro do círculo
        
        System.out.println("Cor da borda do círculo: " + circulo.getCorDaBorda()); // Imprime a cor da borda do círculo
        
        System.out.println("Espessura da borda do círculo: " + circulo.getEspessuraDaBorda()); // Imprime a espessura da borda do círculo
        
        System.out.println("Círculo: " + circulo.toString()); // Imprime tostring de círculo
    }

}
