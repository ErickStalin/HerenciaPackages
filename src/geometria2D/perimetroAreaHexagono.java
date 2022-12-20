package geometria2D;

import java.lang.*;
import java.util.Scanner;

public class perimetroAreaHexagono extends hexagono{
    Scanner entrada = new Scanner(System.in);
    double pi = 3.1416;

    public perimetroAreaHexagono(double lHex, double perimetroHex, double apotemaHex, double areaHex) {
        super(lHex, perimetroHex, apotemaHex, areaHex);
    }
    @Override
    public void CalcularArea(){
        areaHex= (perimetroHex*apotemaHex)/2;
    }
    @Override
    public void CalcularPerimetro(){
        perimetroHex=6*lHex;
    }
    //Solicitud de datos mediante metodos
    public void mostrarHexagono(){
        System.out.print("Ingrese el lado del hexagono:");
        lHex = entrada.nextDouble();
        System.out.print("Ingrese la apotema del hexagono:");
        apotemaHex = entrada.nextDouble();
        CalcularPerimetro();
        CalcularArea();
        System.out.println("---DATOS DEL HEXAGONO---");
        System.out.println("El perimetro del hexagono es: " + getPerimetroHex());
        System.out.println("El area del hexagono es: " + getAreaHex());
    }
}
