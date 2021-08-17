package day43_OOP_Encapsulation.Credentials;

public class Credentials {

    /*
       1. Password MUST be at least have 8 characters long, and should not contain space
	   2. PassWord should at least contain one letter
	   3. Password should at least contain one special characters
	   4. Password should at least contain a digit
     */

/*
requirements:
    username:
            1. MUST start with a letter
            2. Must have 5 character at least
    password:
            1. MUST be a Strong password
 */

    private String userName;
    private String password;

    public Credentials(String userName, String password) {
        setUserName(userName);
        setPassword(password);
    }

    public boolean isStrongPassword(String password){
        boolean r1 = false;
        boolean r2  = false;
        boolean r3 = false;


        if(password.length()>=8 && !password.contains(" ")) {

            for (char each : password.toCharArray()) {
                if(Character.isLetter(each)){
                    r1=true;
                }
                else if(!Character.isLetterOrDigit(each)){
                    r2=true;
                }
                else{
                    r3=true;
                }
            }
        }
        return r1 && r2 && r3;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public void setUserName(String userName){
        boolean startsWithLetter = Character.isLetter(userName.charAt(0));
        if(!startsWithLetter){
            return;
        }
        if(userName.length()<5){
            return;
        }
        this.userName=userName;
    }

    public void setPassword(String password){
        if(!isStrongPassword(password)){
            return;
        }
        this.password=password;
    }


    public String toString() {
        return "Credentials{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
