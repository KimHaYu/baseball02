package dao;
import model.Player;
import model.Team;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//선수
public class PlayerDAO {
    private Connection connection;
    public PlayerDAO(Connection connection) {
        this.connection = connection;
    }
    // 선수 넣기
    public void playerInsert(Team team) {
        // sql문 작성
        String sql = "INSERT INTO team (name, position, created_at) VALUES (?, ?, NOW());";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, team.getName());
            ps.setString(2, team.getPlayerPosition());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 선수 업데이트
    public void playerUpdate(Player player) {
        // sql문 작성
        String sql = "UPDATE player SET name = ?, position = ? WHERE player_id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, player.getName());
            ps.setString(2, player.getPosition());
            ps.setInt(3, player.getPlayerId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 선수 없애기
    public void delete(int playerId) {
        // sql문 작성
        String sql = "DELETE FROM player WHERE player_id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, playerId);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 선수 한명 찾기
    public void selectOne() {
        String sql = " ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


// 선수 전체 찾기
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
