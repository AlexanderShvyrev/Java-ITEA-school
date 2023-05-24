package Homework.OOP.Documents;

public class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    public void saveDocument(){
        System.out.println("The document has been saved in the new format.");
    }
}
