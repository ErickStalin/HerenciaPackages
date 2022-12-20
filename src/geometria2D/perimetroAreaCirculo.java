package geometria2D;

import geometria2D.*;
import java.lang.*;
import java.util.Scanner;

public class perimetroAreaCirculo {
    Scanner entrada = new Scanner(System.in);
    double pi = 3.1416;
    //Solicitud de datos mediante metodos
    public void mostrarCirculo(){
        //Atributos
        double radio, perimetro, area;
        System.out.print("Ingrese el radio del circulo:");
        radio = entrada.nextDouble();
        area = pi*(radio*radio);
        perimetro = 2*pi*radio;
        circulo miCirculo = new circulo(radio,perimetro,area);
        System.out.println("---DATOS DEL CIRCULO---");
        System.out.println("El perimetro del circulo es: " + miCirculo.getPerimetroCir());
        System.out.println("El area del circulo es: " + miCirculo.getAreaCir());
    }
}
