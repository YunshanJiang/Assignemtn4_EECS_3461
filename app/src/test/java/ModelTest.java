import Persistent.CommunicationModel;
import Persistent.UserAccountModel;

import org.junit.Ignore;
import org.junit.Test;

public class ModelTest {

    @Ignore
    @Test
    public void communicationModelRetrievingTest(){
        System.out.println("=========================== test name ===========================");
        System.out.println("communicationModelRetrievingTest");
        System.out.println("=========================== test start ===========================");
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
        System.out.println("=========================== test end ===========================");
    }

    @Ignore
    @Test
    public void userAccountRetrievingTest(){
        System.out.println("=========================== test name ===========================");
        System.out.println("communicationModelRetrievingTest");
        System.out.println("=========================== test start ===========================");
        UserAccountModel uam = new UserAccountModel();
        UserAccountModel.UserAccount isabelle = uam.getIsabelle();
        UserAccountModel.UserAccount jacky = uam.getJacky();
        System.out.println(isabelle.getAddress() + ", " + isabelle.getEmail()+ ", " + isabelle.getUserName());
        System.out.println(jacky.getAddress() + ", " + jacky.getEmail()+ ", " + jacky.getUserName());
        System.out.println("=========================== test end ===========================");
    }
}
