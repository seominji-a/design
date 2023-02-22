/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEAT;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 공용
 */
public class seatshiftdata {
    
    public void datashift1() throws FileNotFoundException, IOException{
        String myFile = "C:\\DB\\Seat.txt";
         String temp;
                String[] array ;
                String dummy = "";

                try {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(myFile)));

                    while ((temp = reader.readLine()) != null) {
                        array = temp.split(" ");
                    }

                    FileWriter fw = new FileWriter(myFile);
                    fw.write(dummy);

                    reader.close();
                    fw.close();
                } catch (IOException ex) {
                }
    }
    
    public void datashift2() throws FileNotFoundException, IOException{
        String filename = "C:\\DB\\Seat2.txt";
        
        File inputFile = new File(filename);
        FileReader fr = new FileReader(inputFile);
        BufferedReader bfread = new BufferedReader(fr);
        
        File outFile = new File(filename);
        FileWriter outwriter = new FileWriter(outFile);
        
        
        ArrayList<String> read = new ArrayList<>();
        String check= "";
        
        try{
            String temp;
            String dummy = "";
            String[] array ;
            
            while((temp = bfread.readLine()) != null){
                array = temp.split(" ");
                
                read.clear();
            }
            outwriter.write(dummy);
            
            bfread.close();
            outwriter.close();
         }
        
        catch(IOException ex){
             
         }
    }
    public void datashift3() throws FileNotFoundException, IOException{
        String filename = "C:\\DB\\Seat3.txt";
        
        File inputFile = new File(filename);
        FileReader fr = new FileReader(inputFile);
        BufferedReader bfread = new BufferedReader(fr);
        
        File outFile = new File(filename);
        FileWriter outwriter = new FileWriter(outFile);
        
     
        
        ArrayList<String> read = new ArrayList<>();
        String check= "";
        
        try{
            String line;
            String dummy = "";
            String[] array ;
            while((line = bfread.readLine()) != null){
                read.add(line);
                array = line.split(" ");
   
                read.clear();
            }
            
            outwriter.write(dummy);
            
            bfread.close();
            outwriter.close();
         }
        catch(IOException ex){
             
         }
    }
}