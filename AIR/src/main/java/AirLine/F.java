/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirLine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hun24
 */
public class F {

    public List<String> air;
    ArrayList<String> readInfo = new ArrayList<>();
    public AirLine aa;

    public F(AirLine aa) {
        this.air = new ArrayList<String>();
        this.aa = aa;
    }

    public F() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(String num, String airplane, String grade, String start,
            String arrive, String year, String month, String day) {
        air.add(aa.getNum(num) + aa.getAirPlane(airplane) + aa.getGrade(grade) + aa.getStart(start) + aa.getArrive(arrive)
                + aa.getYear(year) + aa.getMonth(month) + aa.getDay(day));
    }

    public void Read() {
        try {
            File text = new File("C:\\DB\\AirLine.txt");
            FileReader textRead = new FileReader(text);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Write(String a) throws IOException {
        BufferedWriter BFW = new BufferedWriter(new FileWriter("C:\\DB\\AirLine.txt", true));
        PrintWriter pw = new PrintWriter(BFW, true);
        pw.write(a + "\n");
        pw.flush();
        pw.close();
    }

    public List<String> returnAirInfo() throws IOException {
        return air;
    }
}
