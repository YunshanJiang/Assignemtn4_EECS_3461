import Persistent.CommunicationModel;

import org.junit.Test;

public class ModelTest {
    @Test
    public void communicationModelTest(){
        CommunicationModel communicationModel = new CommunicationModel();
        System.out.println("hi!\n" + communicationModel.getResponse("hi?"));
        System.out.println("how are you?\n" + communicationModel.getResponse("how are you?"));
        System.out.println("I have some information for gold bar.\n" + communicationModel.getResponse("I have some info for gold bar"));
        System.out.println("do you want the information?\n" + communicationModel.getResponse("do you want the info?"));
        System.out.println(communicationModel.getResponse("https://something youtube"));
        System.out.println(communicationModel.getResponse("give me a second"));
        System.out.println(communicationModel.getResponse("this is the map"));
        System.out.println(communicationModel.getResponse("do you want to download the file?"));
        System.out.println(communicationModel.getResponse("how's the game?"));
        System.out.println(communicationModel.getResponse("ok~ see you"));
    }
}
