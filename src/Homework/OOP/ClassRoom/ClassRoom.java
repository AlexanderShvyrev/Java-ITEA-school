package Homework.OOP.ClassRoom;

public class ClassRoom {
    private Pupil[] pupils;

    public ClassRoom(Pupil... pupils) {
        if(pupils.length > 4){
            System.out.println("Classroom can only hold 4 students. This is a very small classroom");
        }
        this.pupils = pupils;
    }

    public void teach(){
        for (Pupil pupil : pupils){
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
            System.out.println("=======================");
        }
    }
}
