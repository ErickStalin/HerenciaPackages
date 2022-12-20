package geometria2D;

import java.lang.*;
import java.util.Scanner;

public class perimetroAreaPentagono extends pentagono{
    Scanner entrada = new Scanner(System.in);
    double pi = 3.1416;

    public perimetroAreaPentagono(double lPen, double perimetroPen, double areaPen, double apotemaPen) {
        super(lPen, perimetroPen, areaPen, apotemaPen);
        CalcularArea();
        CalcularPerimetro();
    }
    @Override
    public void CalcularArea(){
         AreaPen= (perimetroPen*apotemaPen)/2;
    }
    @Override
    public void CalcularPerimetro(){
        perimetroPen = 5 * lPen;
    }
    //Solicitud de datos mediante metodos
    public void mostrarPentagono(){

        System.out.print("Ingrese el lado del pentagono:");
        lPen = entrada.nextDouble();
        System.out.print("Ingrese la apotema del pentagono:");
        apotemaPen = entrada.nextDouble();
        CalcularPerimetro();
        CalcularArea();
        System.out.println("---DATOS DEL PENTAGONO---");
        System.out.println("El perimetro del pentagono es: " + getPerimetroPen());
        System.out.println("El area de la esfera es: " + getAreaPen());
    }
}
