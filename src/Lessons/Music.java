package Lessons;

import Student.StudentClass;

import java.util.ArrayList;

public class Music extends LessonClass {
    public Music(StudentClass StudentClass) {
        super(StudentClass);
    }

    @Override
    public ArrayList<String> topics() {
        topicList.add("Peacemaking Skills for Little Kids");
        topicList.add("Learning Through Literature");
        topicList.add("Creative Conflict Solving");
        topicList.add("Creating Peace, Building Community");
        topicList.add("WinWin!");
        return topicList;
    }

    /*
    This class child of the LessonClass

    Create a private String Arraylist name is topicList

    Music class is the child of the LessonClass

     add following values to arrayList(topicList) in the override method that comes from the abstract class
     Peacemaking Skills for Little Kids
     Learning Through Literature
     Creative Conflict Solving
     Creating Peace, Building Community
     WinWin!
return topicList
     */

    private ArrayList<String> topicList;
}


