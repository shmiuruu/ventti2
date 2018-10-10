/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventti;

import java.awt.FlowLayout;
import java.util.Scanner;
import javax.swing.JPanel;

/**
 *
 * @author s1800573
 */
public class Ventti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //pitää tehdä korttipakka. Korttipakassa on 52 korttia (ei jokeri)
        //luodaan käsi
        //laitetaan myös skanner, jotta ohjelma voi kysyä
        Scanner lukija = new Scanner(System.in);
        int korttipakka = 52;
        String käsi;

        //tehdään aloitus: tervehdys pelaajalle, pelaaja voi valita kyllä/ei -> Käyttöohjeet
        System.out.println("Tervetuloa pelaamaan venttiä!");
        
        while (true) {
            System.out.println("Haluatko lukea käyttöohjeet? (K/E)");
            String komento = lukija.nextLine();

            if (komento.substring(0, 1).equalsIgnoreCase("k")) {
                System.out.println("Ventissä pelataan Jakajaa vastaan. Pelaajana voit valita, haluatko nostaa uuden kortin.");
                break;
            } else if (komento.substring(0, 1).equalsIgnoreCase("e")) {
                break;
            } else {
                System.out.println("Valinta ei kelpaa, yritä uudestaan.");

            }
        }

        // Pelaajana haluan päättää otanko uuden kortin. Tarvitaan scanner, jotta ohjelma kysyy, haluanko ottaa uuden kortin
        //Emäntänä haluan että voitan tasatilanteessa
        //Pelaajana haluan nähdä emännän käden kun emäntä pelaa
        
        
        //testi lopetus
        System.out.println("Päästiin ohjelman loppuun");
    }
}
