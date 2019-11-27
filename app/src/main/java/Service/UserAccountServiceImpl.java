package Service;

import Persistent.UserAccountModel;

public class UserAccountServiceImpl {

    private UserAccountModel userAccountModel = new UserAccountModel();

    public UserAccountModel.UserAccount retrieveUserAccountByUserId(String userId){
        return userAccountModel.getUserMap().get(userId);
    }
}
