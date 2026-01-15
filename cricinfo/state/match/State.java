package cricinfo.state.match;

import cricinfo.entities.Match;

public interface State {
    public void inProgress(Match match);

    public void putBreak(Match match);

    public void finish(Match match);
}
