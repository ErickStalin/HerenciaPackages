package geometria2D;

import geometria2D.*;
import java.lang.*;
import java.util.Scanner;

public class perimetroAreaTriangulo {
    Scanner entrada = new Scanner(System.in);
    double pi = 3.1416;
    //Solicitud de datos mediante metodos
    public void mostrarTriangulo(){
        double lado, lado2, base, altura, area ,perimetro;
        System.out.print("Ingrese el lado 1 del triangulo:");
        lado = entrada.nextDouble();
        System.out.print("Ingrese el lado 2 del triangulo:");
        lado2 = entrada.nextDouble();
        System.out.print("Ingrese la base del triangulo:");
        base = entrada.nextDouble();
        System.out.print("Ingrese la altura del triangulo:");
        altura = entrada.nextDouble();
        area = base*altura;
        perimetro = base+lado+lado2;
        triangulo miTriangulo = new triangulo(lado,lado2,base,altura,area,perimetro);
        System.out.println("---DATOS DEL TRIANGULO---");
        System.out.println("El perimetro del triangulo es: " + miTriangulo.getPeriTri());
        System.out.println("El area del triangulo es: " + miTriangulo.getAreaTri());
    }
}
