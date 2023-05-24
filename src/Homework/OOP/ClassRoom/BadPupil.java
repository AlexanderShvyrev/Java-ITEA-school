package Homework.OOP.ClassRoom;

public class BadPupil extends Pupil{
    @Override
    public void study(){
        System.out.println("This student's studying is bad");
    }
    @Override
    public void read(){
        System.out.println("This student's reading is bad");
    }
    @Override
    public void write(){
        System.out.println("This student's writing is bad");
    }
    @Override
    public void relax(){
        System.out.println("Bad student is relaxing");
    }
}
