package Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Persistent.CommunicationModel;

public class CommunicationServiceImpl {

    private CommunicationModel communicationModel = new CommunicationModel();

    /**
     * When the user message is typed, then App will respond according to the message
     * @param userInput is the message from the app user
     * @return is the message from the VM
     */
    public String getResponse(String userInput){
        for(String keyReg: communicationModel.getResponseMap().keySet()){
            Pattern p = Pattern.compile(keyReg);
            Matcher m = p.matcher(userInput);

            if(m.find())
                return responseDelay(communicationModel.getResponseMap().get(keyReg));
        }
        return communicationModel.defaultMessageFromBot;
    }

    private String responseDelay(String messageFromBot) {
        try {
            Thread.sleep(3000);//3 seconds delay...
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return messageFromBot;
    }
}
