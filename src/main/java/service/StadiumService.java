package service;

import dao.StadiumDAO;

//야구장 비즈니스 로직
public class StadiumService {

    private final StadiumDAO stadiumDAO;

    public StadiumService(StadiumDAO stadiumDAO) {
        this.stadiumDAO = stadiumDAO;
    }

    public void createStadium(String stadiumName) {
        stadiumDAO.insert(stadiumName);
    }

//    public List<StadiumDto> getStadiumList() {
//        stadiumDAO.selectAll();
//        return null;
//    }

}

