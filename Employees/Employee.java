import java.util.Scanner;

/**
 * Employee
 */
public class Employee {

    // Numero de empleados
    static final int EM = 5;

    // Datos del empleado
    private String name;
    private double salary;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Arreglo de empleados
        Employee employees[] = new Employee[EM];
        double higher = 0.0, index = -1;
        for (int i = 0; i < EM; i++) {
            Employee employee = new Employee();
            System.out.print("Ingresa el nombre del empleado " + (i + 1) + ": ");
            employee.name = in.nextLine();
            System.out.print("Ingresa el sueldo de " + employee.name + ": ");
            employee.salary = Double.valueOf(in.nextLine());
            if (employee.salary > higher) {
                higher = employee.salary;
                index = i;
            }
            employees[i] = employee;
        }
        System.out.println("\nEl empleado con mayor sueldo:\n" + employees[(int) index]);
        in.close();
    }

    @Override
    public String toString() {
        return this.name + " " + this.salary;
    }
}