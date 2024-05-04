/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ngo2024;

/**
 *
 * @author SSIRA
 */
import oru.inf.InfDB;
import oru.inf.InfException;

public class NGO2024 {

    private static InfDB idb;
//    private InfException ex;

    public static void main(String[] args) {

        try {
            idb = new InfDB("ngo_2024", "3306", "root", "masterkey");
            new Inloggning(idb).setVisible(true);
        } 
        catch(InfException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
    
}

