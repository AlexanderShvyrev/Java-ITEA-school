package Homework.OOP.ClassRoom;

public class Main {
    public static void main(String[] args) {
        Pupil excellentPupil = new ExcellentPupil();
        Pupil goodPupil = new GoodPupil();
        Pupil badPupil = new BadPupil();
        Pupil regularPupil = new Pupil();

        ClassRoom classRoom = new ClassRoom(excellentPupil, goodPupil, badPupil, regularPupil);
        classRoom.teach();
    }
}
