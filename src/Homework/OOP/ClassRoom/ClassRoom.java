package Homework.OOP.ClassRoom;

public class ClassRoom {
    private Pupil[] pupils;

    public ClassRoom(Pupil... pupils) {

        this.pupils = pupils;
    }

    public Pupil[] getPupils() {
        return pupils;
    }

    public void teach(){
        if(this.getPupils().length > 4){
            System.out.println("Classroom can only hold 4 students. This is a very small classroom");
        }else{
            for (Pupil pupil : this.getPupils()){
                pupil.study();
                pupil.read();
                pupil.write();
                pupil.relax();
                System.out.println("=======================");
            }
        }
    }
}
