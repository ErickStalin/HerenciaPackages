package Geometria3D;

import java.lang.*;
import java.util.Scanner;

public class volumenAreaEsfera extends esfera{
    Scanner entrada = new Scanner(System.in);
    double pi = 3.1416;

    public volumenAreaEsfera(double radioEs, double areaEs, double volumenEs) {
        super(radioEs, areaEs, volumenEs);
        CalcularVolumen();
        CalcularArea();
    }
    @Override
    public void CalcularArea(){
        areaEs = 4*pi*(radioEs*radioEs);
    }
    @Override
    public void CalcularVolumen(){
        volumenEs = (1.33)*pi*(radioEs*radioEs*radioEs);
    }
    //Solicitud de datos mediante metodos
    public void mostrarEsfera(){
        double radio, area , volumen;
        System.out.print("Ingrese el radio de la esfera:");
        radioEs = entrada.nextDouble();
        CalcularVolumen();
        CalcularArea();
        System.out.println("---DATOS DEL ESFERA---");
        System.out.println("El volumen de la esfera es es: " + getVolumenEs());
        System.out.println("El area de la esfera es: " + getAreaEs());
    }
}
