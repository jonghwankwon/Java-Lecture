package sec02_02_Vector;

public class Board {
	String subject;
	String content;
	String writer;
	
	Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
}
