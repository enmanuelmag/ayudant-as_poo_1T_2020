package Main;

import java.util.Objects;

public class Cliente {

  private String cedula;
  private String nombre;
  private String motivo;
  private int numero;

  public Cliente(String cedula, String nombre) {
    this.cedula = cedula;
    this.nombre = nombre;
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

  /**
   * Este metodo sirve par amsotrar la info del objeto por meddio d eun Stirng,
   * este metodo se llama automaticamente cuando se coloca a la varariable que
   * hace referencia a un objeto dentro de un System.out.println(). Ejemplo:
   * Cliente cliente = new Cliente(...); System.out.println(cliente);
   */
  @Override
  public String toString() {
    return "Num. Fila='" + this.numero + " cedula='" + getCedula() + "'" + ", nombre='" + getNombre() + "'"
        + ", motivo='" + getMotivo() + "'";
  }

  public void setNumero(int size) {
    this.numero = size;
  }

  public int getNumero() {
    return this.numero;
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
    return Objects.equals(cedula, cliente.cedula) && Objects.equals(nombre, cliente.nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cedula, nombre);
  }

}
