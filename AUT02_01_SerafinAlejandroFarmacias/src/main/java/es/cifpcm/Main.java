package es.cifpcm;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printMainMenu();
    }
    private static void printMainMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        List<String> farmacias = new ArrayList<>();

        System.out.println("-- Necesito Paracetamol Ya!");
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Opción 1. Buscar por nombre");
            System.out.println("Opción 2. Lista de farmacias disponibles");
            System.out.println("Opción 0. Salir");
            System.out.println("---------------------------------------------");
            System.out.println("Opción 9. Admin");
            System.out.print("Introduzca una opción: ");

            // Leer la opción ingresada por el usuario
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Buscar por nombre");
                    buscarFarmacia();
                    break;
                case 2:
                    System.out.println("Lista de farmacias disponibles");
                    listarFarmacias();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                case 9:
                    goAdminMenu();
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);
        sc.close();
    }

    private static void goAdminMenu() {
        printAdminMenu();
    }

    private static void printAdminMenu() {
        int opcionAdmin;
        Scanner scAdmin = new Scanner(System.in);
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Opción 1. Añadir Farmacias");
            System.out.println("Opción 2. Borrar Farmacias");
            System.out.println("Opción 3. Listar Farmacias");
            System.out.println("Opción 0. Salir");
            System.out.println("---------------------------------------------");
            System.out.print("Introduzca una opción: ");

            // Leer la opción del menú de administrador
            opcionAdmin = scAdmin.nextInt();

            switch (opcionAdmin) {
                case 1:
                    System.out.println("Añadir Farmacias");
                    insertarFarmacia();
                    break;
                case 2:
                    System.out.println("Borrar Farmacias");
                    borrarFarmacia();
                    break;
                case 3:
                    System.out.println("Listar Farmacias");
                    listarFarmacias();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcionAdmin != 0);
    }

    private static void insertarFarmacia() {
    }

    private static void borrarFarmacia() {
    }

    private static void buscarFarmacia() {
    }
    private static ArrayList<Farmacia> listarFarmacias() {
        return null;
    }

}