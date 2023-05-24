package Homework.OOP.ClassRoom;

public class ExcellentPupil extends Pupil {
    @Override
    public void study(){
        System.out.println("This student's studying is excellent");
    }
    @Override
    public void read(){
        System.out.println("This student's reading is excellent");
    }
    @Override
    public void write(){
        System.out.println("This student's writing is excellent");
    }
    @Override
    public void relax(){
        System.out.println("Excellent student is relaxing");
    }
}
