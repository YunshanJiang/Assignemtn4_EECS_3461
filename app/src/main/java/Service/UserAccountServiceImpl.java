package Service;

import Persistent.UserAccountModel;

public class UserAccountServiceImpl {

    private UserAccountModel userAccountModel = new UserAccountModel();

    public UserAccountModel.UserAccount retrieveUserAccount(String userName){
        if(userName.equals("Isabelle")){
            userAccountModel.getIsabelle();
        } else if(userName.equals("Jacky")){
            userAccountModel.getJacky();
        }
        return new UserAccountModel.UserAccount();
    }



}
