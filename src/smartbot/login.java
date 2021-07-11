package smartbot;

class login {
    public static String getPassWord() {
        return PassWord;
    }

    public static void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public static String getUserName() {
        return UserName;
    }

    private static String PassWord="noel305!";
    private  static String UserName="noel";






    public  login(){

    }

    public login(String userName, String passWord) {

        this();
        UserName = userName;
        PassWord = passWord;
    }



//Gte password
    public static void SetPassWord(String text) {
        PassWord=text;
    }



// Get username
    public static void setUserName(String userName) {
        UserName = userName;
    }




}
