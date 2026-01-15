package cricinfo.entities;

import cricinfo.factory.matchtype.MatchType;

import java.util.Date;
import java.util.List;

public class Match {
    private int id;
    private Date date;
    private Inning inning1;
    private Inning inning2;
    private Team teamA;
    private List<Player> teamAPlaying11;
    private Team teamB;
    private List<Player> teamBPlaying11;
    private List<User> subscribers;
    private MatchType matchType;
}
