/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fonsterandrauppgifter;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author anton
 */
public class FonsterAndraUppgifter {
    
    private static InfDB idb; 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        try{
        
            idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW"); 
            new Inloggning(idb).setVisible(true);
            
        } catch(InfException ettUndantagsfel){
            System.out.println(ettUndantagsfel.getMessage()); 
        }
    
}
}
