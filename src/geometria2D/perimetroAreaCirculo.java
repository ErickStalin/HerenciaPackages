package geometria2D;

import java.lang.*;
import java.util.Scanner;

public class perimetroAreaCirculo extends circulo {
    Scanner entrada = new Scanner(System.in);
    double pi ;

    public perimetroAreaCirculo(double radioCir, double perimetroCir, double areaCir, double pi) {
        super(radioCir, perimetroCir, areaCir);
        this.pi = pi ;
        CalcularArea();
        CalcularPerimetro();
    }
@Override
public void CalcularArea(){
    areaCir = pi*(radioCir*radioCir);
}
@Override
public void CalcularPerimetro(){
    perimetroCir = 2*pi*radioCir;
}
    //Solicitud de datos mediante metodos
    public void mostrarCirculo(){
        //Atributos
        System.out.print("Ingrese el radio del circulo:");
        radioCir = entrada.nextDouble();
        CalcularPerimetro();
        CalcularArea();
        System.out.println("---DATOS DEL CIRCULO---");
        System.out.println("El perimetro del circulo es: " +getPerimetroCir());
        System.out.println("El area del circulo es: " + getAreaCir());
    }
}
