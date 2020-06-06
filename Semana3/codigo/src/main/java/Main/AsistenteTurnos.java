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

    System.out.print("Ingrese su cédula: ");
    String cedula = sc.nextLine();

    System.out.print("Ingrese su nombre: ");
    String nombre = sc.nextLine();

    Cliente cliente = new Cliente(cedula, nombre);
    if (!this.clientes.contains(cliente)) {

      return cliente;
    }

    // Tambien se puede usar el siguiente codigo
    // Esto es el operador Ternario o Elvis

    // return !this.clientes.contains(cliente) ? cliente : null;

    // Su esctructura es:
    // condicion ? valor si se cumple : valor si no se cumple

    return null;
  }

  /**
   * Registrar al cliente en la fila
   * 
   * @return true si se registro al cliente, false si no
   */
  public boolean registrarTurno() {

    Cliente cliente = verificarCliente();

    if (cliente != null) {

      System.out.print("Ingrese su motivo: ");
      String motivo = sc.nextLine();

      cliente.setMotivo(motivo);
      cliente.setNumero(this.clientes.size());

      System.out.println("Cliente registrado en la fila correctamente");
      return this.clientes.add(cliente);
    }

    System.out.println("Cliente ya presente en la fila");
    return false;
  }

  /**
   * Quita al cliente que estaba primero en la fila
   */
  public void terminarTurno() {

    this.clientes.remove(0);
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

    for (Cliente cliente : this.clientes) {
      System.out.println(cliente);
    }

    /**
     * Usando nuesvas caracteristicas, o una manera mas PRO, sería asi. Puede
     * parecer mas codigo pero cuando se tiene que hacer mas cosas como filtrar,
     * ordenas y demas, es aconsejable usar los metodos que dispone .stream(),
     * debidoa que hace el codigo mas sencillo y legible
     */

    // this.clientes.stream().forEach(cliente -> {
    // System.out.println(cliente);
    // });
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
