/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author APROJUSA
 */
import java.io.*;
import java.util.ArrayList;

class Libro implements Serializable {
    private String titulo;
    private String autor;
    private int anio;

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año: " + anio;
    }
}

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967));
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605));
        libros.add(new Libro("El Principito", "Antoine de Saint-Exupéry", 1943));

        // Serializar
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("libros.ser"))) {
            oos.writeObject(libros);
            System.out.println("Lista serializada en libros.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserializar
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("libros.ser"))) {
            ArrayList<Libro> librosDeserializados = (ArrayList<Libro>) ois.readObject();
            System.out.println("Libros deserializados:");
            for (Libro libro : librosDeserializados) {
                System.out.println(libro);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
