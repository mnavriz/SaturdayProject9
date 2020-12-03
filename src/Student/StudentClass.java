package Student;


import java.util.LinkedHashMap;

public class StudentClass extends SchoolLocation {

  /*
    This class is child of the SchoolLocation

    Create 3 private instance variables

    String username and password

    LinkedHashMap whose key is String, value is Integer and name is classNameAndScore

     */
    private String username, password;

    LinkedHashMap <String,Integer> classNameAndScore = new LinkedHashMap<>();

     /*
        Create an constructor
        three parameter String username, String password and  String studentSchoolLocation

        Call the setUsernameAndPassword method in the constructor

     */
   // public StudentClass(String username, String password, studentSchoolLocation){

    //}

    /*
    Create a method name is  setUsernamePassword
    Parameter is String username and String  password
    no return type

    Check if given username and password pair exist in the StudentData class
    You will use AddUserNameAndPassword method to check it
    if the pair exists,  make instance variable username equal to parameter username, and make instance variable password equal to parameter password

    if it doesn't not exist then throw an RunTimeException which is "Not able to find a username and password. Please sign up to website"
     */

    public void setUsernamePassword(String username, String password){
//???
        if(username == AddUserNameAndPassword.username){
            this.username = username;
            if (password ==AddUserNameAndPassword.password){
                this.password = password;
            }else {
                throw new RuntimeException("Not able to find a username and password. Please sign up to website");
            }
        }

    }

    /*
        create a set method for the classNameAndScore
     */

    public void setClassNameAndScore(LinkedHashMap<String, Integer> classNameAndScore) {
        this.classNameAndScore = classNameAndScore;
    }
/*
        create a get method for the classNameAndScore
     */

    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }
    /*
    Create a toString method
    print username
          password
          Price
          schoolLocation
          ClassNameAndScore
     */

    @Override
    public String toString() {
        return "StudentClass{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", SchoolLocation='" + SchoolLocation + '\'' +
                ", price='" + price + '\'' +
                ", classNameAndScore=" + classNameAndScore +
                '}';
    }
}



