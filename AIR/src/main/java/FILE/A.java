package FILE;

import USER.LogInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hun24
 */
public class A implements fileInterface {

    ArrayList<String> readInfo = new ArrayList();
    ArrayList<LogInfo> logInfo = new ArrayList();

    @Override
    public void DB() {
        try {
            File Admin = new File("C:\\DB\\admin.txt");
            FileReader txtRead = new FileReader(Admin);
            BufferedReader bfReader = new BufferedReader(txtRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지 않습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File User = new File("C:\\DB\\User.txt");
            FileReader txtRead = new FileReader(User);
            BufferedReader bfReader = new BufferedReader(txtRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지 않습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void DBWrite(String a) throws IOException {
    }

    @Override
    public void Split() {
        String line;

        for (int i = 0; i < readInfo.size(); i++) {
            line = readInfo.get(i);
            String[] str = line.split(" ");
            logInfo.add(new LogInfo(str[0], str[1]));
        }

    }

    public ArrayList<LogInfo> returnLogInfo() throws IOException {
        return logInfo;
    }
}
