package sec02_02_Vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();		//Arraylist 대신 vector이 들어옴
		
		list.add(new Board("제목1", "내용1", "글쓴이1")); 
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));	//삭제
		list.add(new Board("제목4", "내용4", "글쓴이4"));	//2번으로 당겨짐
		list.add(new Board("제목5", "내용5", "글쓴이5"));	//3번으로 당겨짐
		
		list.remove(2);	//2번 인덱스 객체(제목3) 삭제 (뒤의 인덱스는 1씩 앞으로 당겨짐)
		list.remove(3);	//3번 인덱스 객체(제목5) 삭제
		
		for (Board board: list)
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
//			System.out.println(board.toString());	//Board클래스에서 toString 추가
		
		/*for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}*/
		
	}
}
