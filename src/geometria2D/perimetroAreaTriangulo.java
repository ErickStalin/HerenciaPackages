package geometria2D;

import java.lang.*;
import java.util.Scanner;

public class perimetroAreaTriangulo extends triangulo {
    Scanner entrada = new Scanner(System.in);
    double pi = 3.1416;

    public perimetroAreaTriangulo(double lTri, double lTri2, double baseTri, double alturaTri, double areaTri, double periTri) {
        super(lTri, lTri2, baseTri, alturaTri, areaTri, periTri);
        CalcularArea();
        CalcularPerimetro();
    }
    @Override
    public void CalcularArea(){
        areaTri= (baseTri*alturaTri)/2;
    }
    @Override
    public void CalcularPerimetro(){
        periTri = baseTri+lTri+lTri2;
    }
    //Solicitud de datos mediante metodos
    public void mostrarTriangulo(){

        System.out.print("Ingrese el lado 1 del triangulo:");
        lTri = entrada.nextDouble();
        System.out.print("Ingrese el lado 2 del triangulo:");
        lTri2 = entrada.nextDouble();
        System.out.print("Ingrese la base del triangulo:");
        baseTri = entrada.nextDouble();
        System.out.print("Ingrese la altura del triangulo:");
        alturaTri = entrada.nextDouble();
        CalcularPerimetro();
        CalcularArea();
        System.out.println("---DATOS DEL TRIANGULO---");
        System.out.println("El perimetro del triangulo es: " + getPeriTri());
        System.out.println("El area del triangulo es: " + getAreaTri());
    }
}
