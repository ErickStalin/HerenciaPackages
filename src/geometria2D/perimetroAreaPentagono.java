package geometria2D;

import geometria2D.*;
import java.lang.*;
import java.util.Scanner;

public class perimetroAreaPentagono {
    Scanner entrada = new Scanner(System.in);
    double pi = 3.1416;
    //Solicitud de datos mediante metodos
    public void mostrarPentagono(){
        double lado, perimetro, area, apotema;
        System.out.print("Ingrese el lado del pentagono:");
        lado = entrada.nextDouble();
        System.out.print("Ingrese la apotema del pentagono:");
        apotema = entrada.nextDouble();
        perimetro = lado * 5 * lado;
        area = (perimetro*apotema)/2;
        pentagono miPentagono = new pentagono(lado,perimetro,area,apotema);
        System.out.println("---DATOS DEL PENTAGONO---");
        System.out.println("El perimetro del pentagono es: " + miPentagono.getPerimetroPen());
        System.out.println("El area de la esfera es: " + miPentagono.getAreaPen());
    }
}
