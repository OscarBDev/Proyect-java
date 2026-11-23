package proyectojava;

import java.util.Scanner;

public class Persona {
    protected String ci;
    protected String nombre;
    protected String paterno;
    protected String materno;
    protected String telefono;

    public void leer(Scanner sc) {
        System.out.print("CI: ");
        ci = sc.nextLine();
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Apellido paterno: ");
        paterno = sc.nextLine();
        System.out.print("Apellido materno: ");
        materno = sc.nextLine();
        System.out.print("Telefono: ");
        telefono = sc.nextLine();
    }

    public void mostrar() {
        System.out.println("CI: " + ci);
        System.out.println("Nombre: " + nombre + " " + paterno + " " + materno);
        System.out.println("Telefono: " + telefono);
    }
}