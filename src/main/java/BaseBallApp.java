import dao.OutPlayerDAO;
import dao.PlayerDAO;
import dao.StadiumDAO;
import dao.TeamDAO;
import db.DBconnection;
import service.StadiumService;

import java.sql.Connection;
import java.util.Scanner;

public class BaseBallApp {
    public static void main(String[] args) {
        Connection connection = DBconnection.getInstance();

        // 퇴출선수
        OutPlayerDAO outPlayerDao = new OutPlayerDAO(connection);

        // 선수
        PlayerDAO playerDao = new PlayerDAO(connection);

        // 야구장
        StadiumDAO stadiumDao = new StadiumDAO(connection);

        // 팀
        TeamDAO teamDao = new TeamDAO(connection);

        StadiumService stadiumService = new StadiumService(stadiumDao);


        // TODO while (true) 이용해서 무한 반복시키기.
        // 사용자 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 기능을 요청하시겠습니끼?");
        System.out.println("1. 야구장 등록\n 2. ......");
        int command = sc.nextInt();

        switch (command) {
            case 1:
                System.out.println("야구장 이름을 입력하세요.");
                String stadiumName = sc.next();
                stadiumService.createStadium(stadiumName);
                System.out.println("성공!");
                break;
//            case 2:
//                System.out.println("야구장 목록을 출력합니다.");
//                List<StadiumDto> list = stadiumService.getStadiumList();
        }
    }
}