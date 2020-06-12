package Main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Enmanuel
 *
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        // Crear 3 objetos de la clase Perona y guardarlos en un ArrayList de tipo
        // Persona

        // Ahora crear un nuevo objeto persona que contenga la misma referecnia a uno de
        // los objetos anterioemnte guardados

        // Ahora crear un NUEVO objeto persona que contenga los mismo valores en los
        // atributos de alguno de los objetos presentes en el arreglo

    }

    public static void objetoParametro(Persona persona) {
        // modificar el nombre de la persona
        // no retornar nada

    }

    public static void variableParametro(int edad) {
        // modificar el parametro recibido por otro cualquier
        // No retornar nada

    }

    public static void tiposVariables() {

        // Tipos de datos primitivos
        short num_shot = 32767; // 16 bits
        int num_entero = 2147483647; // 32 bits

        long num_long = 536871066; // 64 bits
        float num_float = 24.12345678f; // 32 bits
        double num_double = 24.1234567891234;// 32 bits

        System.out.println(num_double - num_float - num_long + num_entero + num_shot);
        // Por defecto la division es entera
        System.out.println("División entera: " + 5 / 2);
        // Para decimales se hace lo siguiente
        float div = (float) 5 / 2;
        System.out.println("División decimal: " + div);

        boolean bool = !false;
        char letra = 'a';
        char letra_num = 5;

        // Nuevas caracteristicas
        var nombreVar = 5;
        var nombreVar2 = !true;
        var nombreVar3 = new Object();
    }

    public static void strcutControl(int num) {

        boolean b = true;
        // IF siempre evalua la condición
        if (b) {
            System.out.println("Es verdad!");
        }
        // Solo evalua la condición si no se ha cumplido ninguna de las anteriores
        else if (num != 10) {
            System.out.println("Diferente");
        }
        // Se ejecuta solo si no se ha cumplido niguna otra condicion
        else {
            System.out.println("Ni lo uno ni lo otro");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num = sc.nextInt();
        sc.next();
        sc.close();

        // Es mas eficiente que el IF pero solo pemrte comaprar un valor para la
        // variable
        switch (num) {
            case 10:
                System.out.println("Ingresaste 10!");
                break;
            case 20:
                System.out.println("Ingresante 20!");
            default:
                System.out.println("Ingresaste " + num);
        }

        while (num < 5) {
            System.out.println("Se repite hasta que se cumpla la función");
            num++;
        }

        do {
            System.out.println("Primero ejecuta, siempre ingresa al menos una vez!");
            num--;
        } while (num > 5);
    }
}
