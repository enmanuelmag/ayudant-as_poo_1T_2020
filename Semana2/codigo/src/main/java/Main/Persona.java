package Main;

import java.util.Objects;

public class Persona {

  // Seccion de atributos

  // Los atributos pueden tener modificares de acceso (retriccion de acceso)
  // private, default, protected, public
  int att1;
  public String nombre;
  private int edad;

  // Seccion de métodos

  // Contructor
  /**
   * Crea un Objeto (instancia) Persona con los parametros pasados
   * 
   * @param nombre de la persona
   * @param edad   de la persona
   */
  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  /**
   * Dice la edad de la persona
   */
  public void showInfo() {
    System.err.println("Nombre: " + this.nombre);

  }

  // Sobrecarga de métodos
  public void showInfo(boolean b) {

    showInfo();
    System.out.println("Edad: " + this.edad);
    if (b)
      System.err.println("Es mayor de edad: " + (this.edad >= 18));
  }

  public void showInfo(boolean b, String correo) {
    showInfo(b);
    if (!correo.equals(""))
      System.out.println("Enviando email a: " + correo);
  }

  @Override
  public String toString() {

    return this.nombre;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Persona)) {
      return false;
    }
    Persona persona = (Persona) o;
    return Objects.equals(nombre, persona.nombre) && edad == persona.edad;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }
}