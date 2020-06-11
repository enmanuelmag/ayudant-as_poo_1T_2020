package Main;

import java.util.Objects;

public class Persona {

  // Seccion de atributos

  // Los atributos pueden tener modificares de acceso (retriccion de acceso)
  // private, default, protected, public
  private String nombre;
  private int edad;

  // Seccion de métodos

  // Contructor
  /**
   * Crear el constructor de la clase, que recibe el string con el nombre y un int
   * con la edad
   * 
   * @param nombre de la persona
   * @param edad   de la persona
   */

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  //
  /**
   * Implementar el método showInfo, que NO recibe parámetros y solo muestra por
   * pantalla el nombre de la persona y lo retorna
   */

  public void showInfo() {
    System.out.println(this.nombre);
  }

  //
  // Sobrecarga de métodos
  /**
   * Implementar otro método showInfo pero esta ve recibe un parámetro y sera un
   * boolean. El método debe llamar al metodo showInfo anterior (el que no tenia
   * parámetros). Luego muestra por pantalla la edad de la persona. Y finalmente
   * si el parametros boolean recibido como parámetro es TRUE muestra un mensaje
   * diciendo si la persona ES o NO mayor de edad (18 años)
   */

  public void showInfo(boolean b) {
    showInfo();

    System.out.println(this.edad);

    if (b) {

      boolean mayor = this.edad >= 18;
      System.out.println("Es mayor de edad: " + mayor);
    }

  }

  /**
   * Implementar otro metodo showInfo que esta vez recibe un boolean y un string
   * (correo ficticio). Este showInfo deberá llamar al showInfo anterior (el que
   * recibe el parametro boolean) y mandarle como parámetro el boolean que le
   * estmaos mandando ahora. Adicionalmente SOLO SI el parametro correo (String)
   * es diferente de cadena vacia, es decir "", se mostrará por pantalla un
   * mensaje dicienod que se estan enviando la informacion al correo pasado por
   * parametro
   * 
   */

  public void showInfo(boolean b, String correo, int a, Object o, Persona p2) {
    showInfo(b);

    if (!correo.equals("")) {
      System.out.println("Enciando correo a: " + correo);
    }
  }

  public void showInfo(String correo) {
    if (!correo.equals("")) {
      System.out.println("Enciando correo a: " + correo);
    }
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

  @Override
  public int hashCode() {
    return Objects.hash(nombre, edad);

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
