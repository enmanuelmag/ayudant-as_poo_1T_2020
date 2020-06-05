package Main;

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

  // Como el atributo edad es privado, se tiene que crear un metodo para poder
  // acceder a el desde otra clase
  /**
   * 
   * @return edad de la persona
   */
  public int getEdad() {
    return this.edad;
  }

  /**
   * Dice la edad de la persona
   */
  public void getInfo() {
    System.err.println("Nombre: " + this.nombre);

  }

  // Sobrecarga de métodos
  public void getInfo(boolean b) {

    getInfo();
    System.out.println("Edad: " + this.edad);
    if (b)
      System.err.println("Es mayor de edad: " + (this.edad >= 18));
  }

  public void getInfo(boolean b, String correo) {
    getInfo(b);
    if (!correo.equals(""))
      System.out.println("Enviando email a: " + correo);
  }
}