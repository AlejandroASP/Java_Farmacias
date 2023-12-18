package es.cifpcm;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        List<String> farmacias = new ArrayList<>();

        // Mensaje al iniciar el programa
        System.out.println("-- Necesito Paracetamol Ya!");
        do {
            // Mostrar el menú principal
            System.out.println("---------------------------------------------");
            System.out.println("Opción 1. Buscar por nombre");
            System.out.println("Opción 2. Lista de farmacias disponibles");
            System.out.println("Opción 0. Salir");
            System.out.println("---------------------------------------------");
            System.out.println("Opción 9. Admin");
            System.out.print("Introduzca una opción: ");

            // Leer la opción ingresada por el usuario
            opcion = sc.nextInt();

            // Procesar la opción del menú principal
            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la opción 1. Buscar por nombre");
                    // Agrega aquí el código correspondiente a la opción 1
                    break;
                case 2:
                    System.out.println("Seleccionaste la opción 2. Lista de farmacias disponibles");
                    // Agrega aquí el código correspondiente a la opción 2
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                case 4:
                    // Menú de administrador
                    int opcionAdmin;
                    do {
                        // Mostrar el menú de administrador
                        System.out.println("---------------------------------------------");
                        System.out.println("Opción 1. Añadir Farmacias");
                        System.out.println("Opción 2. Borrar Farmacias");
                        System.out.println("Opción 3. Listar Farmacias");
                        System.out.println("Opción 0. Salir");
                        System.out.println("---------------------------------------------");
                        System.out.print("Introduzca una opción: ");

                        // Leer la opción del menú de administrador
                        opcionAdmin = sc.nextInt();

                        // Procesar la opción del menú de administrador
                        switch (opcionAdmin) {
                            case 1:
                                System.out.println("Seleccionaste la opción 1. Añadir Farmacias");
                                // Agrega aquí el código correspondiente a la opción 1 del menú de admin
                                break;
                            case 2:
                                System.out.println("Seleccionaste la opción 2. Borrar Farmacias");
                                // Agrega aquí el código correspondiente a la opción 2 del menú de admin
                                break;
                            case 3:
                                System.out.println("Seleccionaste la opción 3. Listar Farmacias");
                                // Agrega aquí el código correspondiente a la opción 3 del menú de admin
                                break;
                            case 0:
                                System.out.println("Volviendo al menú principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                        }
                    } while (opcionAdmin != 0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);

        // Cerrar el scanner al salir del programa
        sc.close();
    }
}