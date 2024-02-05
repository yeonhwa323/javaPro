package days19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;

public class Ex01 {

	public static void main(String[] args) {
		/* "SS20_Team.txt"  파일을 읽어서 본인의 팀원들만의 이름을 teamMember 배열에 
		저장한 후 팀장명을 제외한 나머지 팀원들의 이름을  
		내림차순으로 정렬해서 아래와 같이 출력하는 코딩을 하세요.
		 */
		String fileName = "SS20_Team.txt";
		String [] teamMember = null;	// 나의 팀원들을 저장할 배열
		
		String key = "user.dir";
		String userDir = System.getProperty(key);
		//E:\Class\Workspace\JavaClass\javaPro
		//System.out.println(userDir);
		String path = String.format("%s\\src\\days19\\%s", userDir, fileName);
		//E:\Class\Workspace\JavaClass\javaPro\src\days19\SS20_Team.txt
		//System.out.println( path );

		String myName = "조연화";
		String teamline = null; // teamline 읽어오는 변수
		String teamMemberLine = null;
		String teamLeader = null;
		String regex = "\\s*,\\s*";		//정규표현식
		
		try (FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);) {
			
			while ((teamline = br.readLine()) != null) {
				teamMemberLine = br.readLine();
				// System.out.printf("[%s]: [%s]\n", teamline, teamMemberLine);
				if( teamMemberLine.contains(myName) ) {
					System.out.printf("[%s]: [%s]\n", teamline, teamMemberLine);
					
					teamMember = teamMemberLine.split(regex);
					// 이시은(팀장)
					teamLeader = teamMember[0].replace("(팀장)", "");
					
					// 나머지 팀원들 내림차순으로 정렬
					String [] temp = new String[teamMember.length-1]; //팀장빼기
					System.arraycopy(teamMember, 1, temp, 0, teamMember.length-1);
					//System.out.println( "temp: " + Arrays.toString(temp));
					Arrays.sort(temp, Collections.reverseOrder());
					//System.out.println( "temp: " + Arrays.toString(temp));
					System.arraycopy(temp, 0, teamMember, 1, temp.length);
					//System.out.println(Arrays.toString(teamMember));
					break; // 제어문 빠져나감(다른팀원 이제 체크안함)
				}// if
			}//while
			
			// 출력
			String output = "<ul>\n"
					+"<li class=\"leader\">";
			System.out.printf("[%s]\n", teamline);
			output += String.join("</li>\n <li>", teamMember);
			output += "</li>\n"
						+"</ul>";
			System.out.println( output );
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}// try














	}//main

}//class


/*
String key = "user.dir";
String userDir = System.getProperty(key);

String readpath = userDir.concat("\\src\\days19\\SS20_Team.txt");
String writepath = userDir.concat("teamMember[][]");

String [][] names = new String[6][5];
String name = null;
int index = 0;

try (FileReader fr = new FileReader(readpath);
	BufferedReader br =  new BufferedReader(fr);
		FileWriter fw = new FileWriter(writepath)){
	while ( (name = br.readLine()) != "3조" ) {
		names[index++] = name;
	}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
*/
