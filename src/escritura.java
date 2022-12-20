import java.util.Scanner;
public class escritura {
    public int menu(){
        int op;
        Scanner entrada = new Scanner(System.in);
        System.out.println("---FIGURAS GEOMETRICAS---");
        System.out.println("1.- Figuras en 2D");
        System.out.println("2.- Figuras en 3D");
        System.out.println("0.- SALIR");
        System.out.print("Ingrese su respuesta: ");
        op = entrada.nextInt();
        return op;
    }
    //figuras en 2d
    public int menu2(){
        int op;
        Scanner entrada = new Scanner(System.in);
        System.out.println("---FIGURAS 2D---");
        System.out.println("1.- CIRCULO");
        System.out.println("2.- CUADRADO");
        System.out.println("3.- HEXAGONO");
        System.out.println("4.- PENTAGONO");
        System.out.println("5.- TRIANGULO");
        System.out.print("Ingrese su respuesta: ");
        op = entrada.nextInt();
        return op;
    }
    //figuras en 3d
    public int menu3(){
        int op;
        Scanner entrada = new Scanner(System.in);
        System.out.println("---FIGURAS 3D---");
        System.out.println("1.- CILINDRO");
        System.out.println("2.- CONO");
        System.out.println("3.- CUBO");
        System.out.println("4.- ESFERA");
        System.out.println("5.- PRISMA");
        System.out.print("Ingrese su respuesta: ");
        op = entrada.nextInt();
        return op;
    }
}
