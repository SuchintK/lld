package cricinfo.entities;

import java.util.List;

public class Match {
    private int id;
    private Inning inning1;
    private Inning inning2;
    private Team teamA;
    private Team teamB;
    private List<User> subscribers;
}
