/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Este paquete contiene las clases que pertenecen al mismo directorio "poo11"
package poo11;

// Importaciones necesarias para la lectura y escritura de archivos, manejo de excepciones, listas y tokenización de cadenas
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author poo01alu08
 */
public class POO11 {

    /**
     * @param args the command line arguments
     */
    
    // La clase principal POO11 que contiene el método main
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            /*
            System.out.println("###########File Writer###########");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe texto");
            String texto= br.readLine();
            System.out.println(texto);*/
            
            // Creación de un FileWriter para escribir en el archivo "alumnos.csv"
            FileWriter fw =new FileWriter("alumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            /*salida.println("Hola Mundo desde POO");
            //salida.println(texto);
            for (int i = 0; i < 10; i++) {
                salida.println("Ruben Alberto,Ortega,Macias,Computacion,314125109,25");
            }
            Alumno alu1 = new Alumno("Ruben Alberto","Ortega","Macias","Computacion","CU CU PUMAS",314125109,25);
            salida.println(alu1.toString());*/
            Alumno alu1 = new Alumno("Ruben Alberto","Ortega","Macias","Computacion","CU CU PUMAS",314125109,25);
            // Creación de una lista de alumnos
            ArrayList<Alumno> listaAlumnos= new ArrayList<Alumno>();
            listaAlumnos.add(alu1);
            
            // Agregando alumnos a la lista
            listaAlumnos.add(new Alumno("Isaac","Mendoza","Sosa","Computacion","dede",317179211,22));
            listaAlumnos.add(new Alumno("Jocelyn","Cruz","Herrera","Computacion","df",320202238,20));
            //hacer 10 alumnos
            listaAlumnos.add(new Alumno("Carlos","Perez","Gomez","Matematicas","Direccion4",314125110,26));
            listaAlumnos.add(new Alumno("Ana","Lopez","Martinez","Fisica","Direccion5",314125111,27));
            listaAlumnos.add(new Alumno("Pedro","Sanchez","Rodriguez","Quimica","Direccion6",314125112,28));
            listaAlumnos.add(new Alumno("Maria","Gonzalez","Ramirez","Biologia","Direccion7",314125113,29));
            listaAlumnos.add(new Alumno("Jose","Morales","Castillo","Historia","Direccion8",314125114,30));
            listaAlumnos.add(new Alumno("Laura","Torres","Hernandez","Arte","Direccion9",314125115,31));
            listaAlumnos.add(new Alumno("Fernando","Aguilar","Pena","Musica","Direccion10",314125116,32));
            
            // Escribiendo los datos de cada alumno en el archivo "alumnos.csv"
            for (Alumno alumno : listaAlumnos){
                salida.println(alumno.toString());
            }
            //salida.println(listaAlumnos.get(0).toString()); sin el fore
            //salida.println(listaAlumnos.get(1).toString());
            salida.close();       
        } catch (IOException ex) {
            // Manejo de excepciones en caso de que ocurra un error de entrada/salida
            Logger.getLogger(POO11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         // Inicio de la sección de lectura de archivos
        System.out.println("#######File Reader######");
        try {
            // Creación de un FileReader para leer el archivo "alumnos.csv"
            FileReader fr = new FileReader("alumnos.csv");
            BufferedReader br= new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            
            // Leer el archivo de texto creado.
            // Creación de una lista para almacenar los alumnos leídos desde el archivo
            List<Alumno> alumnosDesdeArchivo = new ArrayList<>();
            
            // Leyendo cada línea del archivo hasta que no haya más líneas
            while (linea!=null) {
                // Tokenizar cada elemento.
                StringTokenizer tokenizer = new StringTokenizer(linea, ",");
                String nombre = tokenizer.nextToken();
                String apellidoP = tokenizer.nextToken();
                String apellidoM = tokenizer.nextToken();
                String carrera = tokenizer.nextToken();
                String direccion = tokenizer.nextToken();
                int numCuenta = Integer.parseInt(tokenizer.nextToken());
                int edad = Integer.parseInt(tokenizer.nextToken());

                // Crear un nuevo objeto de alumno con la información del archivo de texto.
                Alumno alumno = new Alumno(nombre, apellidoP, apellidoM, carrera, direccion, numCuenta, edad);
                
                // Agregando el nuevo alumno a la lista
                alumnosDesdeArchivo.add(alumno);
                
                // Imprimiendo la línea leída
                System.out.println(linea);
                // Leyendo la siguiente línea
                linea=br.readLine();
            }
            br.close(); // Cerrando el BufferedReader
        } catch (FileNotFoundException ex) {
            // Manejo de excepciones en caso de que el archivo "alumnos.csv" no se encuentre
            Logger.getLogger(POO11.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            // Manejo de excepciones en caso de que ocurra un error de entrada/salida
            Logger.getLogger(POO11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Inicio de la sección de tokenización de cadenas
        System.out.println("###########String Tokenizer#########");
        String texto = "Ruben Alberto,Ortega,Macias,Computacion,314125109,25";
        //tokenizar todos los alumnos martes
        StringTokenizer tokenizador = new StringTokenizer(texto,",");
        while (tokenizador.hasMoreTokens()) {
            System.out.println(tokenizador.nextToken());
        }
    }
}
