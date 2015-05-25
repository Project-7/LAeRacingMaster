package adress.model;


import java.io.Serializable;

/**
 *
 * @author MarkusH und RobertK
 * @version 1.0
 */
public class Team implements Serializable{

    private String team;

    public Team() {
    }

    public Team(String team) {
        this.team = team;
    }
    

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
