package cricinfo.entities;

import cricinfo.observer.scorecard.BattingScoreCard;
import cricinfo.observer.scorecard.BowlingScoreCard;

public class Inning {
    private int id;
    private Team battingTeam;
    private Team bowlingTeam;
    private BattingScoreCard battingScorecard;
    private BowlingScoreCard bowlingScorecard;
}
