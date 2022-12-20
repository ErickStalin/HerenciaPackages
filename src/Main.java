import geometria2D.*;
import Geometria3D.*;
import java.lang.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        volumenAreaEsfera impEsfera = new volumenAreaEsfera(0,0,0);
        volumenAreaPrisma impPrisma = new volumenAreaPrisma(0,0,0,0,0,0);
        volumenAreaCilindro impCilindro = new volumenAreaCilindro(0,0,0,0);
        volumenAreaCubo impCubo = new volumenAreaCubo(0,0,0);
        volumenAreaCono impCono = new volumenAreaCono(0,0,0,0);
        perimetroAreaCirculo impCirculo = new perimetroAreaCirculo(0,0,0,3.1416);
        perimetroAreaCuadrado impCuadrado = new perimetroAreaCuadrado(0,0,0);
        perimetroAreaHexagono impHexagono = new perimetroAreaHexagono(0,0,0,0);
        perimetroAreaPentagono impPentagono = new perimetroAreaPentagono(0,0,0,0);
        perimetroAreaTriangulo impTriangulo = new perimetroAreaTriangulo(0,0,0,0,0,0);

        escritura es1 = new escritura();
        int op = -1, op2;
        while(op != 0){
            op = es1.menu();
            switch (op){
                case 1:
                {
                    op2 = es1.menu2();
                    switch (op2){
                        case 1:
                        {
                            impCirculo.mostrarCirculo();
                        }
                        break;
                        case 2:
                        {
                            impCuadrado.mostrarCuadrado();
                        }
                        break;
                        case 3:
                        {
                            impHexagono.mostrarHexagono();
                        }
                        break;
                        case 4:
                        {
                            impPentagono.mostrarPentagono();
                        }
                        break;
                        case 5:
                        {
                            impTriangulo.mostrarTriangulo();
                        }
                        break;
                    }
                }
                break;
                case 2:
                {
                    op2 = es1.menu3();
                    switch (op2){
                        case 1:
                        {
                            impCilindro.mostrarCilindro();
                        }
                        break;
                        case 2:
                        {
                            impCono.mostrarCono();
                        }
                        break;
                        case 3:
                        {
                            impCubo.mostrarCubo();
                        }
                        break;
                        case 4:
                        {
                            impEsfera.mostrarEsfera();
                        }
                        break;
                        case 5:
                        {
                            impPrisma.mostrarPrisma();
                        }
                        break;
                    }
                }
                break;
            }
        }

    }
}