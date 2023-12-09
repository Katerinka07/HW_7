package Observer;

public abstract class Applicant implements Observer {
    protected String name;
    protected String surName;
    protected VacancyType vacancyType;


    public Applicant(String name, String surName, VacancyType vacancyType) {
        this.name = name;
        this.surName = surName;
        this.vacancyType = vacancyType;
    }
}
