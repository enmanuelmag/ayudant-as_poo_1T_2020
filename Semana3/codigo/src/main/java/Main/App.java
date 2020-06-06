package Main;

import java.util.Scanner;

public class App {

    public static void main(String... args) {
        System.out.println("Iniciando sistema...");
        Scanner sc = new Scanner(System.in);
        AsistenteTurnos sistema = new AsistenteTurnos(sc);

        String accion = "";

        while (!accion.equals("4")) {
            sistema.mostrarMenu();
            System.out.print("Ingrese: ");
            accion = sc.nextLine();

            switch (accion) {
                case "1":
                    sistema.mostrarClientes();
                    break;
                case "2":
                    sistema.registrarTurno();
                    break;
                case "3":
                    sistema.terminarTurno();
                    break;
            }
        }
        sc.close();
    }
}
