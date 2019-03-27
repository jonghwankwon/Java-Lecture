package sec08_02_StringTokenizer;

import java.util.StringTokenizer;

//Path파일에 StringTokenizer 응용
public class System_path_Example {
	public static void main(String[] args) {
		String path = System.getenv("PATH");
		StringTokenizer st = new StringTokenizer(path, ";");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}