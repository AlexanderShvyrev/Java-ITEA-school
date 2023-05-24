package Homework.OOP.ClassRoom;

public class GoodPupil extends Pupil {
    @Override
    public void study(){
        System.out.println("This student's studying is good");
    }
    @Override
    public void read(){
        System.out.println("This student's reading is good");
    }
    @Override
    public void write(){
        System.out.println("This student's writing is good");
    }
    @Override
    public void relax(){
        System.out.println("Good student is relaxing");
    }
}
