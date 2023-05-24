package Homework.OOP.ClassRoom;

public class Main {
    public static void main(String[] args) {
        Pupil excellentPupil = new ExcellentPupil();
        Pupil goodPupil = new GoodPupil();
        Pupil badPupil = new BadPupil();
        Pupil regularPupil = new Pupil();

        ClassRoom classRoomA = new ClassRoom(excellentPupil, goodPupil, badPupil, regularPupil);
        classRoomA.teach();
        ClassRoom classRoomB = new ClassRoom(excellentPupil, goodPupil);
        classRoomB.teach();
        ClassRoom classRoomC = new ClassRoom(badPupil, badPupil, excellentPupil);
        classRoomC.teach();
        ClassRoom classRoomD = new ClassRoom(excellentPupil, goodPupil, badPupil,regularPupil,regularPupil);
        classRoomD.teach();
    }
}
