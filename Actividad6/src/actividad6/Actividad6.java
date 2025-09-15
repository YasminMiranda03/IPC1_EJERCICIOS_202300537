/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad6;

/**
 *
 * @author APROJUSA
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
public class Actividad6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String archivo = "paises.pdf";

        // Matriz estática con los datos
        String[][] paises = {
                {"Guatemala", "Ciudad de Guatemala", "17"},
                {"México", "Ciudad de México", "126"},
                {"España", "Madrid", "47"},
                {"Japón", "Tokio", "125"}
        };

        try {
            // Inicializamos el PDF
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(archivo));
            document.open();

            // Creamos una tabla con 3 columnas
            PdfPTable tabla = new PdfPTable(3);

            // Encabezados
            tabla.addCell("País");
            tabla.addCell("Capital");
            tabla.addCell("Población (millones)");

            // Agregar datos de la matriz
            for (String[] fila : paises) {
                tabla.addCell(fila[0]);
                tabla.addCell(fila[1]);
                tabla.addCell(fila[2]);
            }

            // Añadir la tabla al documento
            document.add(tabla);

            // Cerrar el documento
            document.close();

            System.out.println("PDF generado exitosamente: " + archivo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
