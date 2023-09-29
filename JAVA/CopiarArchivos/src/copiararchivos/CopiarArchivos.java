/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copiararchivos;

/**
 *
 * @author thest
 */

import java.io.*;

/**
 *
 * @author theStrik
 */
public class CopiarArchivos {


    public static void main(String args[]) throws FileNotFoundException, IOException {
        
        BufferedReader fin;
        PrintWriter fout;
        
        String linia;
        
        if(args.length != 2){
            System.out.println("- Nombre d'arguments erroni.");
        }
        
        fin = new BufferedReader(new FileReader(args[0]));
        fout = new PrintWriter(new FileWriter(args[1]));
        
        do{
            
            linia = fin.readLine();
            
            if(linia != null){
                String [] parts = linia.split("\\.\\s",2);
  
                if(parts.length == 2){
                    fout.println(parts[1]);
                }
                else{
                    fout.println(linia);
                }
            }
        }
        while(linia != null);
         
        fin.close();
        fout.close(); 
    }
    
    
    
}
