import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma, resta, multiplicacion, opcion;
        double division = 0;

        System.out.print("Escriba el primer numero: ");
        int n1 = sc.nextInt();

        System.out.print("Escriba el segundo numero: ");
        int n2 = sc.nextInt();

        System.out.println("--------------- CALCULADORA ---------------");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Salir");


        do{

            System.out.print("Digite una opcion del 1 al 5:");
            opcion = sc.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("Ha escogido la opcion de sumar los numeros ingresados");
                    suma = sumar(n1, n2);
                    System.out.println("El resultado es: " + suma);
                    break;

                case 2:
                    System.out.println("Ha escogido la opcion de restar los numeros ingresados");
                    resta = restar(n1, n2);
                    System.out.println("El resultado es: " + resta);
                    break;

                case 3:
                    System.out.println("Ha escogido la opcion de multiplicar los numeros ingresados");
                    multiplicacion = multiplicar(n1, n2);
                    System.out.println("El resultado es: " + multiplicacion);
                    break;

                case 4:
                    System.out.println("Ha escogido la opcion de dividir los numeros ingresados");
                    if (n2 == 0){
                        System.out.println("No se puede realizar la division");
                    }else{
                        division = dividir(n1, n2);
                    }
                    System.out.println("El resultado es: " + division);
                    break;

                case 5:
                    System.out.println("Ha escogido salir del programa");
                    break;

                default:
                    System.out.println("Opcion seleccionada no existe, por favor escoja otra");
                    break;
            }

        }while(opcion != 5);

    }
    
    public static int sumar(int n1, int n2){
        return n1 + n2;
    }

    public static int restar(int n1, int n2){
        return n1 - n2;
    }

    public static int multiplicar(int n1, int n2){
        return n1 * n2;
    }

    public static double dividir(int n1, int n2){
        return n1 / n2;
    }
    
}
