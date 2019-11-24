package Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Persistent.CommunicationModel;

public class CommunicationServiceImpl {

    private CommunicationModel communicationModel = new CommunicationModel();

    public String getResponse(String userInput){
        for(String keyReg: communicationModel.getResponseMap().keySet()){
            Pattern p = Pattern.compile(keyReg);
            Matcher m = p.matcher(userInput);

            if(m.find())
                return communicationModel.getResponseMap().get(keyReg);
        }
        return communicationModel.defaultMessageFromBot;
    }

}
