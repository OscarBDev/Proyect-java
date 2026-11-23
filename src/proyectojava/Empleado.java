
package proyectojava;

/**
 *
 * @author oscarbdev
 */
import java.util.Scanner;

public class Empleado extends Persona {
    private String item;
    private String cargo;

    public void leer(Scanner sc) {
        super.leer(sc);
        System.out.print("Item: ");
        item = sc.nextLine();
        System.out.print("Cargo: ");
        cargo = sc.nextLine();
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Item: " + item);
        System.out.println("Cargo: " + cargo);
    }
}