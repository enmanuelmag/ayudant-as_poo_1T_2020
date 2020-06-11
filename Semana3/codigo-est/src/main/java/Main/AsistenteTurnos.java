package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class AsistenteTurnos {

  private ArrayList<Cliente> clientes;
  private Scanner sc;

  /**
   * Constructor para la clase AsistenteTurnos
   * 
   * @param sc scanner para leer informacion desde el teclado
   */
  public AsistenteTurnos(Scanner sc) {
    this.clientes = new ArrayList<>();
    this.sc = sc;
  }

  /**
   * Funcion para validar que el cliente no sere pita en la fila
   * 
   * @return cliente validado
   */
  private Cliente verificarCliente() {
    // Con el atributo scanner pida por pantalla la cédula del cliente
    System.out.print("Ingrese su cédula: ");

    // Con el atributo scanner pida por pantalla el nombre del cliente
    System.out.print("Ingrese su nombre: ");

    // Crear un nuevo objeto cliente con esos datos

    // Evalaur si el objeto creado no esta presente ya en el arreglo de clientes
    // Si no esta presente retornar al cliente creado
    // Si ya esta presente retornar null

    return null;
  }

  /**
   * Registrar al cliente en la fila
   * 
   * @return true si se registro al cliente, false si no
   */
  public boolean registrarTurno() {

    // llamar a la funcion verificarCliente y almacenar su valor en la variable
    // cliente
    Cliente cliente = null;

    if (cliente != null) {
      // Pedir por el scanner el motivo del cliente (string)
      System.out.print("Ingrese su motivo: ");

      // Setear el motivo ingresado por teclado en el atributo motivo del cliente
      // Usando el metodo setMOtivo()
      // Setear el atributo numero del cliente
      // el numero debe ser la cantidad de elementos en el arreglo clientes

      System.out.println("Cliente registrado en la fila correctamente");
      // Añadir el cleinte al arreglo y retornar true (la funcion .add() de ArrayList
      // retorna true si se añade el elemento)
    }

    System.out.println("Cliente ya presente en la fila");
    return false;
  }

  /**
   * Quita al cliente que estaba primero en la fila
   */
  public void terminarTurno() {

    // Remover del arreglo cliente al que este en la primera posicion
  }

  /**
   * Imprime a los clientes y su información en el orden en el que se encunetran
   */
  public void mostrarClientes() {
    /**
     * Usando tecnicas de Java del 1998 sería asi
     */

    System.out.println("---------------------------------");

    if (this.clientes.isEmpty())
      System.out.println("La fila está vacía");

    // Iterar y mostrar por pantalla la informacion de los clientes

    System.out.println("---------------------------------");

  }

  /**
   * Muestra las opciones disponibles del sistema
   */
  public void mostrarMenu() {

    String texto = "1 -> Mostrar Fila\n2 -> Registrar Turno\n3 -> Terminar Turno\n4 ->Salir";
    System.out.println(texto);
  }

}
