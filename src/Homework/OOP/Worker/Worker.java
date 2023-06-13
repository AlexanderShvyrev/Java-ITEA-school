package Homework.OOP.Worker;

public class Worker {
    private String lastname;
    private String initials;
    private String jobTitle;
    private int employedSince;

    @Override
    public String toString(){
        return "Last name: " + lastname + "\n" + "Initials: " + initials + "\n" + "Position: " + jobTitle + "\n" + "Employed since: " + employedSince;
    }

    public Worker(String lastname, String initials, String jobTitle, int employedSince) {
        this.lastname = lastname;
        this.initials = initials;
        this.jobTitle = jobTitle;
        this.employedSince = employedSince;
    }

    public String getLastname() {
        return lastname;
    }

    public Worker setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getInitials() {
        return initials;
    }

    public Worker setInitials(String initials) {
        this.initials = initials;
        return this;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Worker setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public int getEmployedSince() {
        return employedSince;
    }

    public Worker setEmployedSince(int employedSince) {
        this.employedSince = employedSince;
        return this;
    }

    public int getYearsOfExperience(int currentYear){
        return currentYear - employedSince;
    }
}
