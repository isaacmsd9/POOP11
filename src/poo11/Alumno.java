/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Este paquete contiene todas las clases relacionadas con el proyecto POO11
package poo11;

// La clase Alumno representa a un estudiante con varios atributos como nombre, apellidos, carrera, dirección, número de cuenta y edad.
public class Alumno {
    // Declaración de variables de instancia para la clase Alumno
    // nombre: El nombre del estudiante
    String nombre;
    // apellidoP: El apellido paterno del estudiante
    String apellidoP;
    // apellidoM: El apellido materno del estudiante
    String apellidoM;
    // carrera: La carrera o especialidad del estudiante
    String carrera;
    // direccion: La dirección del estudiante
    String direccion;
    // numCuenta: El número de cuenta o identificación del estudiante
    int numCuenta;
    // edad: La edad del estudiante
    int edad;

    // Constructor vacío de la clase Alumno. Este constructor no inicializa ninguna de las variables de instancia.
    public Alumno(String ruben_Alberto, String ortega, String macias, String computacion, String string, String string1) {
    }

    // Constructor de la clase Alumno que inicializa todas las variables de instancia.
    public Alumno(String nombre, String apellidoP, String apellidoM, String carrera, String direccion, int numCuenta, int edad) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.carrera = carrera;
        this.direccion = direccion;
        this.numCuenta = numCuenta;
        this.edad = edad;
    }

    // Métodos getter y setter para cada variable de instancia. Estos métodos permiten obtener y establecer los valores de las variables de instancia.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método toString que devuelve una representación de cadena del objeto Alumno. Este método se utiliza para imprimir los detalles del alumno en un formato específico.
    @Override
    public String toString() {
        return nombre+ ","+ apellidoP + "," + apellidoM + "," + carrera + ","+ direccion + "," + numCuenta + "," + edad ;
    }
}
