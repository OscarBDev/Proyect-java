
package proyectojava;

/**
 *
 * @author oscarbdev
 */
import java.util.Scanner;

public class Pedagogo extends Empleado {
    private String especialidad;

    public void leer(Scanner sc) {
        super.leer(sc);
        System.out.print("Especialidad: ");
        especialidad = sc.nextLine();
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Especialidad: " + especialidad);
    }
}
