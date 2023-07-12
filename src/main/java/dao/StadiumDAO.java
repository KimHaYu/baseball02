package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//야구장 테이블
public class StadiumDAO {
    private Connection connection;

    public StadiumDAO(Connection connection) {
        this.connection = connection;
    }

    // 야구장 삽입
    public void stadiumInsert(String name) {
        // sql문 작성
        String sql = "INSERT INTO stadium (name, created_at) VALUES (?, NOW());";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // 야구장 수정
    public void update() {
        //      sql문 작성
        String sql = "";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // 야구장 삭제
    public void delete() {
        // sql문 작성
        String sql = "DELETE FROM stadium";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    // 야구장 하나 찾기
    public void selectOne() {
        String sql = " ";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // 코드 추가 작성
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectALl() {
    }

    public void insert(String stadiumName) {
    }


    // 야구장 전체 찾기
      // (안에 안 적어놔서 오류납니다, 안에 작성할 때 주석 푸시면 됩니다)
//    public List<OutPlayer> findAll() {
//        list<OutPlayer> OutplayerDaoAll = new ArrayList<>();
//
//        String sql = "";
//
//        try {
//            PreparedStatement pstmt = connection.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();
//            while(rs.next()){
//
//                );
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        return OutplayerDaoAll;
//    }



}
