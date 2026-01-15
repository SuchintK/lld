package cricinfo.entities;

import cricinfo.observer.scorecard.BattingScoreCard;
import cricinfo.observer.scorecard.BowlingScoreCard;

import java.util.List;

public class Inning {
    private int id;
    private Team battingTeam;
    private Team bowlingTeam;
    private List<Over> overs;
    private int totalRuns;
    private int totalWickets;
    private BattingScoreCard battingScorecard;
    private BowlingScoreCard bowlingScorecard;
}
