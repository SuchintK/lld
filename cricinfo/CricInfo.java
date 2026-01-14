package cricinfo;

public class CricInfo {
    private volatile CricInfo instance;

    private CricInfo() {

    }

    public synchronized CricInfo getInstance() {
        if (instance == null)
            instance = new CricInfo();
        return instance;
    }
}
