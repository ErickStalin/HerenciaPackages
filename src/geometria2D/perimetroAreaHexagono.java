package geometria2D;

import geometria2D.*;
import java.lang.*;
import java.util.Scanner;

public class perimetroAreaHexagono {
    Scanner entrada = new Scanner(System.in);
    double pi = 3.1416;
    //Solicitud de datos mediante metodos
    public void mostrarHexagono(){
        double lado, area, perimetro, apotema;
        System.out.print("Ingrese el lado del hexagono:");
        lado = entrada.nextDouble();
        System.out.print("Ingrese la apotema del hexagono:");
        apotema = entrada.nextDouble();
        perimetro = 6*lado;
        area = (perimetro*apotema)/2;
        hexagono miHexagono = new hexagono(lado,perimetro,apotema,area);
        System.out.println("---DATOS DEL HEXAGONO---");
        System.out.println("El perimetro del hexagono es: " + miHexagono.getPerimetroHex());
        System.out.println("El area del hexagono es: " + miHexagono.getAreaHex());
    }
}
