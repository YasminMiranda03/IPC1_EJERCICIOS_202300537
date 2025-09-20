/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author APROJUSA
 */
class SumadorRunnable implements Runnable {
    @Override
    public void run() {
        int suma = 0;
        try {
            for (int i = 1; i <= 10; i++) {
                suma += i;
                System.out.println("Sumando: " + i);
                Thread.sleep(500); // medio segundo
            }
            System.out.println("Total: " + suma);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread hilo = new Thread(new SumadorRunnable());
        hilo.start();
    }
    
}
