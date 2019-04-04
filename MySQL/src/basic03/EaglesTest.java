package basic03;

import java.util.List;

public class EaglesTest {
	public static void main(String[] args) {
		EaglesDAO eDao = new EaglesDAO();
		//데이터 추가
		/*eDao.insertPlayer(new EaglesDTO(11, 6,"김민하","외야수","대전고","우투우타",1997,100000));
		EaglesDTO player = eDao.selectOne(11);
		System.out.println(player.toString() + "\n");
		
		//데이터 수정
		/*player.setHand("우투좌타");
		player.setSalary(200000);
		eDao.updatePlayer(player);
		player = eDao.selectOne(11);
		System.out.println(player.toString());
		
		//데이터 삭제
		eDao.deletePlayer(11);
		
		List<EaglesDTO> playerList = eDao.selectAll();*/
		/*List<EaglesDTO> playerList = eDao.selectPlayers();
		System.out.println("연봉 3억원 이상 선수 명단");*/
		String positions[] = {"투수", "포수", "내야수", "외야수"};
		for (String position: positions) {
			List<EaglesDTO> playerList = eDao.selectPlayersByPosition(position);
			System.out.println("포지션이 " + position + "인 선수 명단");
			for (EaglesDTO eagle: playerList)
				System.out.println(eagle.toString());
			System.out.println();
		}
		
		eDao.close();
	}
}