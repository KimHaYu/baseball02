package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
public class Team {
    private Integer teamId;
    private Integer stadiumId;
    private String teamName;
    private Timestamp teamCreatedAt;

    public String getName() {
        return null;
    }

    public String getPlayerPosition() {
        return null;
    }
}
