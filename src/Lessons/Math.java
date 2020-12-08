package Lessons;


import Student.StudentClass;

import java.util.ArrayList;

public class Math extends LessonClass{


    @Override
    public ArrayList<String> topics() {
        topicList.add("Place Value");
        topicList.add("Compare Whole Numbers");
        topicList.add("Represent Decimals");
        topicList.add("Place Value through Thousandths");
        topicList.add("Multiplication Patterns");
        return null;
    }

    public Math(StudentClass StudentClass) {
        super(StudentClass);
    }


   /*
    This class child of the LessonClass

    Create a private String Arraylist name is topicList

    Math class is the child of the LessonClass

     add following values to arrayList(topicList) in the override method that comes from the abstract class
     Place Value
     Compare Whole Numbers
     Represent Decimals
     Place Value through Thousandths
     Multiplication Patterns

     */
   private ArrayList<String> topicList;
}




