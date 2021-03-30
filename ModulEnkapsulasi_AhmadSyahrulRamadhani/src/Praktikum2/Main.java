/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola BolaVoli = new Bola();
        BolaVoli.setJariJari(18);
        System.out.println("Bola Voli");
        BolaVoli.showDiameter();
        BolaVoli.showLuasPermukaan();
        BolaVoli.showVolume();
  }
    
}
