/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author user
 */
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bus Bus = new Bus(50);
        Bus.getPenumpang(48);
        Bus.getPenumpang(24);
        Bus.cetakpenumpang();
        //jarak
        System.out.println();
        
        
        //penambahan penumpang
        Bus.addPenumpang(30);
        Bus.getPenumpang(24);
        Bus.cetakpenumpang();
        //jarak
        System.out.println();
        
        
        //tambah lagi
        Bus.addPenumpang(10);
        Bus.cetakpenumpang();
        Bus.addPenumpang(5);
        Bus.cetakpenumpang();
        
        Bus.getPenumpang(24);
        Bus.cetakpenumpang();
        //jarak
        System.out.println();
        
        
        System.out.println("Rata-rata Berat Penumpang Bus Sekarang adalah = "+Bus.getAverage());
    }
    
}
