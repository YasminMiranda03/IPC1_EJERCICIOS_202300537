/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author APROJUSA
 */
class MensajeThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Este es un mensaje desde un hilo");
                Thread.sleep(2000); // 2 segundos
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MensajeThread hilo = new MensajeThread();
        hilo.start();
    }
    
}
