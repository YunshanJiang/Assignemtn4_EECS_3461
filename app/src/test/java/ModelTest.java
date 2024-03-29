import Persistent.CommunicationModel;
import Persistent.UserAccountModel;
import Service.CommunicationServiceImpl;
import Service.UserAccountServiceImpl;


import org.junit.Test;

public class ModelTest {

    @Test
    public void communicationModelRetrievingTest(){
        System.out.println("=========================== test name ===========================");
        System.out.println("communicationModelRetrievingTest");
        System.out.println("=========================== test start ===========================");
        CommunicationServiceImpl communicationModel = new CommunicationServiceImpl();
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

    @Test
    public void userAccountRetrievingTest(){
        System.out.println("=========================== test name ===========================");
        System.out.println("userAccountRetrievingTest");
        System.out.println("=========================== test start ===========================");
        UserAccountServiceImpl uam = new UserAccountServiceImpl();
        UserAccountModel.UserAccount isabelle = uam.retrieveUserAccountByUserId("isabelle");
        UserAccountModel.UserAccount jacky = uam.retrieveUserAccountByUserId("jacky");
        System.out.println(isabelle.getAddress() + ", " + isabelle.getEmail()+ ", " + isabelle.getUserName());
        System.out.println(jacky.getAddress() + ", " + jacky.getEmail()+ ", " + jacky.getUserName());
        System.out.println("=========================== test end ===========================");
    }
}
