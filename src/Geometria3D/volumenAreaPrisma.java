package Geometria3D;

import java.lang.*;
import java.util.Scanner;

public class volumenAreaPrisma extends prisma{
    Scanner entrada = new Scanner(System.in);
    double pi = 3.1416;

    public volumenAreaPrisma(double perimetroBase, double alturaPri, double areaBase, double areaPri, double volumenPri, double apotemaL) {
        super(perimetroBase, alturaPri, areaBase, areaPri, volumenPri, apotemaL);
        CalcularArea();
        CalcularVolumen();
    }
    @Override
    public void CalcularArea(){
        areaPri = ((perimetroBase *apotemaL)/2)+areaBase;
    }
    @Override
    public void CalcularVolumen(){
        volumenPri = (areaBase*alturaPri)/3;
    }
    //Solicitud de datos mediante metodos
    public void mostrarPrisma(){

        System.out.print("Ingrese el perimetro de la base del prisma:");
        perimetroBase = entrada.nextDouble();
        System.out.print("Ingrese la altura del prisma:");
        alturaPri = entrada.nextDouble();
        System.out.print("Ingrese el area de la base del prisma:");
        areaBase = entrada.nextDouble();
        System.out.print("Ingrese el apotema del lado del prisma:");
        apotemaL = entrada.nextDouble();
        CalcularArea();
        CalcularVolumen();
        System.out.println("---DATOS DEL PRISMA---");
        System.out.println("El volumen del prisma es: " + getVolumenPri());
        System.out.println("El area del prisma es: " + getAreaPri());
    }
}
