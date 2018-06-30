import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Lista que contendra todos los alumnos registrados
        List<Alumno> alumnos = new ArrayList<>();

        String options = "\n\t[1] Agregar Alumno.\n\t[2] Mostrar Alumnos\n\t[3] Salir";

        int opc = -1;

        do {
            System.out.println(options);
            System.out.print("\n\tSeleccione una opcion: ");
            opc = Integer.valueOf(in.nextLine());
            switch (opc) {
            case 1:
                // Pedir datos del alumno
                Alumno al = new Alumno();
                System.out.print("\n\n\tNUEVO ALUMNO");
                System.out.print("\n\tNombre: ");
                al.setNombre(in.nextLine());
                System.out.print("\tMatricula: ");
                al.setMatricula(in.nextLine());
                System.out.print("\tNumero de asignaturas: ");
                al.setNumAsignaturas(Integer.valueOf(in.nextLine()));
                // Pedir todas los datos de las asignaturas
                System.out.print("\n\tINFORMACION DE ASIGNATURAS");
                for (int i = 0; i < al.getNumAsignaturas(); i++) {
                    Asignatura as = new Asignatura();
                    System.out.print("\n\tNombre de asignatura " + (i + 1) + ": ");
                    as.setNombre(in.nextLine());
                    System.out.print("\n\tCALIFICACIONES");
                    for (int j = 0; j < 3; j++) {
                        System.out.print("\n\tCalificacion del corte " + (j + 1) + ": ");
                        as.setCalificacion(Double.valueOf(in.nextLine()), j);
                    }
                    al.setAsignatura(as, i);
                }

                // Agregamos el alumno
                alumnos.add(al);
                System.out.println("\n\tALUMNO AGREGADO CORRECTAMENTE");
                in.nextLine();
                break;
            case 2:
                System.out.println("\n\n\n");
                System.out.println("\n\tALUMNOS");
                for (Alumno c : alumnos) {
                    System.out.println("\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    System.out.println("\t==============================");
                    System.out.println("\tNombre:      |" + c.getNombre());
                    System.out.println("\tMatricula:   |" + c.getMatricula());
                    System.out.println("\tAsiganturas: |" + c.getNumAsignaturas());
                    System.out.println("\t------------------------------");
                    for (int i = 0; i < c.getNumAsignaturas(); i++) {
                        System.out.println("\tNombre:         |" + c.getAsignaturas()[i].getNombre());
                        System.out.println("\tCalificaciones: |");
                        for (int j = 0; j < 3; j++) {
                            System.out.println(
                                    "\tCorte:" + (j + 1) + " |" + c.getAsignaturas()[i].getCalificaciones()[j]);
                        }
                    }
                    System.out.println("\t==============================");
                }
                break;
            default:
                break;
            }
        } while (opc < 3);

        in.close();
    }
}