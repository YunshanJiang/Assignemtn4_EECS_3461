package Persistent;

import java.util.HashMap;
import java.util.List;

public class ActivityHistoryLog {

    private HashMap<Integer, List<Communication>> activityHistoryLog = new HashMap<Integer, List<Communication>>();

    public HashMap<Integer, List<Communication>> getActivityHistoryLog() {
        return activityHistoryLog;
    }

    public void setActivityHistoryLog(HashMap<Integer, List<Communication>> activityHistoryLog) {
        this.activityHistoryLog = activityHistoryLog;
    }



}
