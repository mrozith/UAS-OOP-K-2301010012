/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasigym;


/**
 * Kelas utama untuk menjalankan aplikasi.
 * Package: com.gym
 */
public class MainApp {
    public static void main(String[] args) {
        // Menjalankan form di dalam Event Dispatch Thread (praktik terbaik untuk Swing)
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMembership().setVisible(true);
            }
        });
    }
}

