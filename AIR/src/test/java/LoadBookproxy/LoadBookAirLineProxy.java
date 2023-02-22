package LoadBookproxy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
//Proxy 구현체
public class LoadBookAirLineProxy implements LoadBookAirLineProxyImpl {

	// file 경로를 입력 받아, 해당 파일 내용을 읽어 list 타입<String []>으로 반환
	@Override
	public List<String []> loadBookAirLine(String path) {
		// TODO Auto-generated method stub
		
		List<String [] > list = new ArrayList<String[]>();
		FileInputStream fileInputStream = null;
		InputStreamReader isr = null;
		BufferedReader stayreader = null;
		try {
			String temps = ""; //행을 읽어올 때마다 각 행을 저장하기 위한 String 변수를 만듬
			
			File file= new File(path); 
			fileInputStream = new FileInputStream(file);
			
			isr = new InputStreamReader(fileInputStream);
            stayreader = new BufferedReader(isr); 
            String[] resulta;
            while ((temps = stayreader.readLine()) != null) {
            	 resulta = temps.split(" ");
            	 list.add(resulta);
            }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				fileInputStream.close();
				isr.close();
				stayreader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return list;
	}


	

}
