package ust.Serialization;

public class StudyDemo {
    //serialization interface is known as an marker or tag interface
    //because the interface dosn't have any methods to implementing it is , well serializable


    //its sole purpose is to announce that the class implementing it is well serializable
    //in other words ovbject to that type are savable thorugh the serialization mehanism
    //if any superclass implements is serializable , the subclass is automatically becomes serializable even if the subclass doesn't explicitly declare implement serialization.

    //serialization is all or nothing!

    //Marks the instance variable as transient , if it can't be saved or don't want to be saved
    //if you have an instance variable that can't be saved because it isn't be serializabel, you can mark that variable with the transient keyword and the serialization process will skip over it

    //why a variable not be serialized?
//    1) it could be that the class designer simply forgot to make class serializable
//    2) it might be because the object rely on runtime-specific information that simply can't be saved'
//    Although many of the things in java class libraries are serializabe, but you can't save things like networkd threads or file objects
//    they all are dependent on a particular run time instance
//    they all are dependent on a particular run time experience
//    in other words , they are instantiated in a way that's unique to a particular run of your program , on a particular JVM platform
    //once the program shuts down ,there is no way to bring those things back to life in a meaningful way
    //they have to created from scratch
}
