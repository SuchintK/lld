package cricinfo.entities;

import cricinfo.enums.BallType;

public class Ball {
    private int id;
    private int runs;
    private Wicket wicket;
    private Player batsman;
    private Player bowler;
    private BallType ballType;
    private String commentary;
}
