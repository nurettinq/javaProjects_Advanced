package hashmap;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class GestionTareas {

    // Declaramos variables para la creación de una tarea.
    private static int prioridad;
    private static String descripcion;
    private static int key;
    private static int valor;

    public static void main(String[] args) throws Exception {
        // Creamos 3 empleados.
        Empleado empleadoAnton = new Empleado("Anton", "Lopez", "Jefe");
        Empleado empleadoJose = new Empleado("Jose", "Idalgo", "Encargado");
        Empleado empleadoSergi = new Empleado("Sergi", "Catala", "Empleado");

        // Creamos el HashMap de empleados, le añadimos una "Clave" y los tres empleados
        // creados.
        HashMap<Integer, Empleado> empleados = new HashMap<Integer, Empleado>();
        empleados.put(1, empleadoAnton);
        empleados.put(2, empleadoJose);
        empleados.put(3, empleadoSergi);

        // Creamos 3 tareas.
        Tarea tareaAnton = new Tarea(3, "Buscar Café", empleadoAnton);
        Tarea tareaJose = new Tarea(10, "Contrar a personal de HHRR", empleadoJose);
        Tarea tareaSergi = new Tarea(8, "Arreglar error línea 20", empleadoSergi);

        // Creamos el arraylist de las tareas y le añadimos las tareas creadas..
        ArrayList<Tarea> tareas = new ArrayList<Tarea>();
        tareas.add(tareaAnton);
        tareas.add(tareaJose);
        tareas.add(tareaSergi);

        // Menú do/switch con diferentes opciones.
        try {
            boolean salir = false;
            System.out.println("¿Que operación deseas realizar?");
            do {
                System.out.println(
                        "1: Empleados disponibles." + "\n2: Mostrar tareas creadas." + "\n3: Crear una nueva tarea."
                                + "\n4: Editar una tarea." + "\n5:Borrar una tarea." + "\n0: Finalizar.");
                int opciones = pideEntero();
                if (0 > opciones || opciones > 5) {
                    System.out.println("Introduzca una opcion: ");
                }
                switch (opciones) {
                    case 1: // Recorremos con un forEach, los empleados disponibles.
                        empleados.forEach((indice, empleado) -> {
                            System.out.println("Indice: " + indice + " --#-- Empleado: " + empleado.nombre
                                    + "\r ·Apellido: " + empleado.apellido + "\r ·Cargo: " + empleado.cargo + "\n");
                        });
                        break;
                    case 2: // Reccorremos con un forEach, todos las tareas creadas.
                        tareas.forEach(tarea -> {
                            System.out.println("Empleado: " + tarea.getEmpleado().nombre + " "
                                    + tarea.getEmpleado().apellido + "\r ·Tarea: " + tarea.getDescripcion()
                                    + "\r ·Prioridad: " + tarea.getPrioridad() + "\n");
                        });
                        break;
                    case 3: // Creamos una nueva tarea, pedimos por teclado los datos.
                        empleados.forEach((indice, empleado) -> {
                            System.out.println("Indice: " + indice + " --#-- Empleado: " + empleado.nombre + " Apellido: "
                                    + empleado.apellido);
                        });
                        System.out.println("Inserte el indice del empleado deseado: ");
                        key = pideEntero();
                        if (key > empleados.size() + 1 || key < 0) {
                            System.err.println("¡Error el indice que ha insertado, no esta asociado a ningún empleado!");
                            System.err.println("Inserte de nuevo un indice valido: ");
                            key = pideEntero();
                        }
                        Empleado getEmpleado = (Empleado) empleados.get(key);

                        System.out.println("Inserte la prioridad de la tarea: ");
                        prioridad = pideEntero();
                        if (prioridad > 10 || prioridad < 0) {
                            System.err.println("La prioridad no puede ser menor de 0 ni mayor a 10.");
                            System.err.println("Inserte de nueva el número: ");
                            prioridad = pideEntero();
                        }

                        System.out.println("Inserte la descripción de la tarea: ");
                        descripcion = pideString();

                        tareas.add(addTarea(prioridad, descripcion, getEmpleado));
                        System.out.println("\n");

                        break;
                    case 4: // Modificar una tarea, dependiendo de lo que eliga el usuario.
                        System.out.println("¿Que tarea desea modificar?");
                        valor = 0;
                        tareas.forEach(tarea -> {
                            System.out.println("Indice tarea: " + valor++ + " Empleado: " + tarea.getEmpleado().nombre + " "
                                    + tarea.getEmpleado().apellido + "\r ·Tarea: " + tarea.getDescripcion()
                                    + "\r ·Prioridad: " + tarea.getPrioridad() + "\n");
                        });

                        System.out.println("\nSeleccione el indice de la tarea: ");
                        key = pideEntero();
                        if (key < 0 || key > tareas.size()) {
                            System.err.println("¡Error el indice que ha insertado, no esta asociado a ninguna tarea!");
                            System.err.println("Inserte de nuevo un indice valido: ");
                            key = pideEntero();
                        }

                        System.out.println(
                                "¿Que desea hacer? \n1. Editar la prioridad \n2. Editar la descripción \n3. Cambiar de empleado \n");
                        int opcion = pideEntero();
                        if (opcion == 1) {
                            System.out.println("Inserta la nueva prioridad deseada: ");
                            tareas.get(key).setPrioridad(pideEntero());
                        } else if (opcion == 2) {
                            System.out.println("Inserta la nueva descripción deseada: ");
                            tareas.get(key).setDescripcion(pideString());
                        } else if (opcion == 3) {
                            empleados.forEach((indice, empleado) -> {
                                System.out.println("Indice: " + indice + " --#-- Empleado: " + empleado.nombre + " "
                                        + empleado.apellido);
                            });
                            System.out.println("Inserte el indice del empleado deseado: ");
                            int setEmpledo = pideEntero();
                            if (setEmpledo > empleados.size() + 1 || setEmpledo < 0) {
                                System.err
                                        .println("¡Error el indice que ha insertado, no esta asociado a ningún empleado!");
                                System.err.println("Inserte de nuevo un indice valido: ");
                                setEmpledo = pideEntero();
                            }
                            Empleado getEmpleado1 = (Empleado) empleados.get(setEmpledo);
                            tareas.get(key).setEmpleado(getEmpleado1);
                        }
                        System.out.println("No ha seleccionado ningúna opción, no se efectuara ningún cambio!");
                        break;
                    case 5: // Borrar una tarea
                        System.out.println("¿Que tarea desea borrar?");
                        valor = 0;
                        tareas.forEach(tarea -> {
                            System.out.println("Indice tarea: " + valor++ + " Empleado: " + tarea.getEmpleado().nombre + " "
                                    + tarea.getEmpleado().apellido + "\r ·Tarea: " + tarea.getDescripcion()
                                    + "\r ·Prioridad: " + tarea.getPrioridad() + "\n");
                        });

                        key = pideEntero();
                        if (key < 0 || key > tareas.size()) {
                            System.err.println("¡Error el indice que ha insertado, no esta asociado a ninguna tarea!");
                            System.err.println("Inserte de nuevo un indice valido: ");
                            key = pideEntero();
                        }

                        tareas.remove(key);

                        break;
                    case 0: // Salir = True
                        System.out.println("¡Nos vemos en la próxima, que quiera almacenar más tareas!");
                        salir = true;
                }
            } while (!salir);
        } catch (Exception e) {
            System.err.print("Exception: " + e);
            e.printStackTrace();
        }
    }

    // Metodo para añadir una nueva tarea.
    public static Tarea addTarea(int prioridad, String descripcion, Empleado empleado) {
        Tarea nuevaTarea = new Tarea(prioridad, descripcion, empleado);
        return nuevaTarea;
    }

    // Metodo por la cual el usuario introduce una frase.
    public static String pideString() throws Exception {
        String fraseEntrada;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        fraseEntrada = br.readLine();
        return fraseEntrada;
    }

    // Metodo por el cual el usuario introduce un numero valido.
    public static int pideEntero() {
        String numeroIndicado;
        int numero = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                numeroIndicado = br.readLine();
                numero = Integer.parseInt(numeroIndicado);
            } catch (IOException e) {
                System.out.println("Error al intentar acceder al teclado");
            } catch (NumberFormatException e) {
                System.out.println("Debes intoducir un numero numerico correcto!");
            }
        } while (numero < -1);
        return numero;
    }
}