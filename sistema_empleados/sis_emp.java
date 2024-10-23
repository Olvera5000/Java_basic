package sistema_empleados;

import java.util.ArrayList;
import java.util.Scanner;

class Empleado {
    private String nombre;
    private int id;
    private String departamento;
    private double salario;

    public Empleado(String nombre, int id, String departamento, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Departamento: " + departamento + ", Salario: " + salario;
    }
}

public class sis_emp {
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {

        //Creo unos mensajes de pantalla
            System.out.println("\n---- Sistema de Gestión de Empleados ----");
            System.out.println("1. Añadir empleado");
            System.out.println("2. Mostrar lista de empleados");
            System.out.println("3. Buscar empleado por ID");
            System.out.println("4. Actualizar salario de empleado");
            System.out.println("5. Eliminar empleado");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    anadirEmpleado();
                    break;
                case 2:
                    mostrarEmpleados();
                    break;
                case 3:
                    buscarEmpleado();
                    break;
                case 4:
                    actualizarSalario();
                    break;
                case 5:
                    eliminarEmpleado();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        } while (opcion != 6);
    }

    public static void anadirEmpleado() {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el ID del empleado: ");
        int id = scanner.nextInt();
        System.out.print("Ingrese el departamento del empleado: ");
        String departamento = scanner.next();
        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();

        Empleado nuevoEmpleado = new Empleado(nombre, id, departamento, salario);
        empleados.add(nuevoEmpleado);
        System.out.println("Empleado añadido exitosamente.");
    }

    public static void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado emp : empleados) {
                System.out.println(emp);
            }
        }
    }

    public static void buscarEmpleado() {
        System.out.print("Ingrese el ID del empleado a buscar: ");
        int id = scanner.nextInt();

        for (Empleado emp : empleados) {
            if (emp.getId() == id) {
                System.out.println(emp);
                return;
            }
        }
        System.out.println("Empleado con ID " + id + " no encontrado.");
    }

    public static void actualizarSalario() {
        System.out.print("Ingrese el ID del empleado al que desea actualizar el salario: ");
        int id = scanner.nextInt();

        for (Empleado emp : empleados) {
            if (emp.getId() == id) {
                System.out.print("Ingrese el nuevo salario: ");
                double nuevoSalario = scanner.nextDouble();
                emp.setSalario(nuevoSalario);
                System.out.println("Salario actualizado exitosamente.");
                return;
            }
        }
        System.out.println("Empleado con ID " + id + " no encontrado.");
    }

    public static void eliminarEmpleado() {
        System.out.print("Ingrese el ID del empleado a eliminar: ");
        int id = scanner.nextInt();

        for (Empleado emp : empleados) {
            if (emp.getId() == id) {
                empleados.remove(emp);
                System.out.println("Empleado eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Empleado con ID " + id + " no encontrado.");
    }
}
