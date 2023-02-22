/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BOOK;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hun24
 */
public class ReadA implements Bookinter {

    Bookinter a;

    @Override
    public String[] resulta() {
        File stayfile = new File("C:\\DB\\AirLine.txt");
        FileInputStream opinion;
        try {
            opinion = new FileInputStream(stayfile);//텍스트 파일로 연결되는 문자를 위한 연결 스트림 
            InputStreamReader isr = new InputStreamReader(opinion);
            BufferedReader stayreader = new BufferedReader(isr); //읽기 작업의 효유를 향상시키위함
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadA.class.getName()).log(Level.SEVERE, null, ex);
        }
        a = new BookService();
        return a.resulta();
    }
}
