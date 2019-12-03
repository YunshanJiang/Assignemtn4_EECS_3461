package Service;

import java.util.ArrayList;
import java.util.List;

import Persistent.ActivityHistoryLog;
import Persistent.Communication;

public class ActivityHistoryServiceImpl {

    private ActivityHistoryLog activtyHistory = new ActivityHistoryLog();

    public List<Communication> retrieveCommunicationListByRoomId(int roomId){
        return activtyHistory.getActivityHistoryLog().get(roomId);
    }

    public void insertLogToActivityHistory(Communication communicationInfo){
        int roomId = communicationInfo.getRoomId();
        if(activtyHistory.getActivityHistoryLog().get(roomId)==null){
            //creation required
            createLog(communicationInfo);
        } else {
            //update required
            updateLog(communicationInfo);
        }
    }

    private void createLog(Communication communicationInfo){
        ArrayList<Communication> communicationList = new ArrayList<Communication>();
        communicationList.add(communicationInfo);
        activtyHistory.getActivityHistoryLog().put(communicationInfo.getRoomId(), communicationList);
    }

    private void updateLog(Communication communicationInfo){
        List<Communication> tempList = activtyHistory.getActivityHistoryLog().get(communicationInfo.getRoomId());
        tempList.add(communicationInfo);
        activtyHistory.getActivityHistoryLog().put(communicationInfo.getRoomId(), tempList);
    }

}
