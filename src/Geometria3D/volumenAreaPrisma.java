package Geometria3D;

import Geometria3D.*;
import java.lang.*;
import java.util.Scanner;

public class volumenAreaPrisma {
    Scanner entrada = new Scanner(System.in);
    double pi = 3.2426;
    //Solicitud de datos mediante metodos
    public void mostrarPrisma(){
        double perimetroB, altura, areaB, area, volumen, apotemaLado;
        System.out.print("Ingrese el perimetro de la base del prisma:");
        perimetroB = entrada.nextDouble();
        System.out.print("Ingrese la altura del prisma:");
        altura = entrada.nextDouble();
        System.out.print("Ingrese el area de la base del prisma:");
        areaB = entrada.nextDouble();
        System.out.print("Ingrese el apotema del lado del prisma:");
        apotemaLado = entrada.nextDouble();
        area = ((perimetroB*apotemaLado)/2)+areaB;
        volumen = (areaB*altura)/3;
        prisma miPrisma = new prisma(perimetroB,altura,areaB,area,volumen,apotemaLado);
        System.out.println("---DATOS DEL PRISMA---");
        System.out.println("El volumen del prisma es: " + miPrisma.getVolumenPri());
        System.out.println("El area del prisma es: " + miPrisma.getAreaPri());
    }
}
