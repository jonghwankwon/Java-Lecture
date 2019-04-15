package Openchallenge18_04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class MemberApp {
	public static void main(String[] args) throws IOException {
		String FileName =("C:/Temp/addrInput.txt");
		try {
			FileReader fr = new FileReader(FileName);
			BufferedReader br = new BufferedReader(fr);
			String memInfo;
			String[] memData = new String[3];
			TreeSet<Member> member = new TreeSet<Member>();
			
			while((memInfo = br.readLine())!=null) {
				memData = memInfo.split(",", 3);
				Member mem = Member.getInstance();
				mem.setName(memData[0]);
				mem.setEmail(memData[1]);
				mem.setTel(memData[2]);
				
				member.add(mem);
			}
			br.close();
			
			for(Member nMem: member) {
				System.out.println(nMem);
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
			e.printStackTrace();
		}catch (IOException e) {
		    System.out.println("해당 파일의 읽기를 수행할 수 없습니다.");
		    e.printStackTrace();
		}
	}
}	