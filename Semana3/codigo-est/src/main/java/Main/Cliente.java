package Main;

import java.util.Objects;

public class Cliente {

  private String cedula;
  private String nombre;
  private String motivo;
  private int numero;

  /**
   * Constructor de la clase Cliente
   * 
   * @param cedula identificacion del cliente
   * @param nombre del cliente
   */
  public Cliente(String cedula, String nombre) {
    this.cedula = cedula;
    this.nombre = nombre;
  }

  /**
   * Este metodo sirve par amsotrar la info del objeto por meddio de un String,
   * este metodo se llama automaticamente cuando se coloca a la varariable que
   * hace referencia a un objeto dentro de un System.out.println(). Ejemplo:
   * Cliente cliente = new Cliente(...); System.out.println(cliente);
   */
  @Override
  public String toString() {
    // Este metodo debe retornar un string que contener la informacion de todos los
    // atributos de la clase
    return "";
  }

  /**
   * Este e sun metodo para saber si dos objetos son iguales o no Este metodo se
   * llama AUTOMATICAMENTE cuando se ejecutan metodos como .contais() ya que lo
   * usa para saber si dos objetos son iguales
   */
  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Cliente)) {
      return false;
    }
    Cliente cliente = (Cliente) o;
    return Objects.equals(cedula, cliente.cedula);
  }

  /**
   * Este metodo funciona como el equals, solo que este se usa cuando se desea
   * añadir uin objeto a una coleccion de tipo Hash. En esos casos este metodo
   * Java llama automaticamente a este metodo y también al equals()
   */
  @Override
  public int hashCode() {
    return Objects.hash(cedula);
  }

  // GETTERS Y SETTERS

  public void setNumero(int size) {
    this.numero = size;
  }

  public int getNumero() {
    return this.numero;
  }

  public String getCedula() {
    return this.cedula;
  }

  public void setCedula(String cedula) {
    this.cedula = cedula;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getMotivo() {
    return this.motivo;
  }

  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }

}
