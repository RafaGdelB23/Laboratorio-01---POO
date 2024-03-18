
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//        System.out.println("Hello world");
//
//        int n = 10;


        System.out.print("Your name: ");
        String foo = sc.nextLine();

        System.out.print("Your age: ");
        int edad = sc.nextInt();

        System.out.println(foo + " " + edad);

        if (edad < 18){
            System.out.println("Es menor de edad");
        }else if (edad > 60){
            System.out.println("Es de la tercera edad");
        }else {
            System.out.println("No es ni menor de edad, ni de la tercera edad");
        }

//        System.out.println("El numero es: "+ n );
    }
}