/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FILE;

import SEAT.Seatinfo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Free
 */
public class Seat3DB implements fileInterface {

    ArrayList<String> readInfo = new ArrayList<>();
    ArrayList<Seatinfo> Seat = new ArrayList<>();

    @Override
    public void DBWrite(String a) throws IOException {
        BufferedWriter BFW = new BufferedWriter(new FileWriter("C:\\DB\\Seat3.txt", true));
        PrintWriter pw = new PrintWriter(BFW, true);
        pw.write(a + "\n");
        pw.flush();
        pw.close();
    }

    @Override
    public void DB() {
        try {
            File text = new File("C:\\DB\\Seat3.txt");
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

    @Override
    public void Split() {
        String line;

        for (int i = 0; i < readInfo.size(); i++) {
            line = readInfo.get(i);
            String[] str = line.split(" ");
            Seat.add(new Seatinfo(str[0]));
        }
    }

    public ArrayList<Seatinfo> returnSeatDB() throws IOException {
        return Seat;
    }

}
