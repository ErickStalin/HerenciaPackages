package geometria2D;

import java.lang.*;
import java.util.Scanner;

public class perimetroAreaCuadrado extends cuadrado{
    Scanner entrada = new Scanner(System.in);

    public perimetroAreaCuadrado(double lCua, double areaCua, double perimetroCua) {
        super(lCua, areaCua, perimetroCua);
        CalcularArea();
        CalcularPerimetro();
    }
    @Override
    public void CalcularArea(){
        areaCua= lCua*lCua;
    }
    @Override
    public void CalcularPerimetro(){
        perimetroCua=4*lCua;
    }

    //Solicitud de datos mediante metodos
    public void mostrarCuadrado(){

        System.out.print("Ingrese el lado del cuadrado:");
        lCua = entrada.nextDouble();
        CalcularPerimetro();
        CalcularArea();
        System.out.println("---DATOS DEL CUADRADO---");
        System.out.println("El perimetro del cuadrado es: " + getPerimetroCua());
        System.out.println("El area del cuadrado es: " + getAreaCua());
    }
}
