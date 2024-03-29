package Persistent;

import java.util.HashMap;

public class UserAccountModel {

    private HashMap<String, UserAccount> userMap;
    
    public UserAccountModel() {
        userMap = new HashMap<String, UserAccount>();
        UserAccount Isabelle = new UserAccount();
        UserAccount Jacky = new UserAccount();
        userMap.put("isabelle", Isabelle);
        userMap.put("jacky", Jacky);

        Isabelle.setAddress("121 McMahon Drive, Toronto, Ontario, Canada M2K0C1");
        Isabelle.setEmail("ckgs0942@gmail.com");
        Isabelle.setIntroduction("Red Dead Remption 2 / Call of Duty");
        Isabelle.setPassword("test1234");
        Isabelle.setStatus("online");
        Isabelle.setUserId("isabelle");
        Isabelle.setUserName("Isabelle");

        Jacky.setAddress("123 York University, North YOork, Ontario, Canada");
        Jacky.setEmail("jacky@gmail.com");
        Jacky.setUserName("jacky");
        Jacky.setUserId("jacky ");
        Jacky.setStatus("online");
        Jacky.setIntroduction("Red Dead RE2 / Zelda BoW");
        Jacky.setPassword("test1234");

    }

    public class UserAccount{
        private String userName;
        private String userId;
        private String password;
        private String status;
        private String address;
        private String email;
        private String introduction;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getIntroduction() {
            return introduction;
        }

        public void setIntroduction(String introduction) {
            this.introduction = introduction;
        }

    }

    public HashMap<String, UserAccount> getUserMap() {
        return userMap;
    }

}
