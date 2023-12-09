package Observer;

public class Company {
    private String name;

    private Publisher jobAgency;



    public Company(String name, Publisher jobAgency) {
        this.name = name;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(){
        Vacancy vacancy = GenerateVacancy.generateVacancy();
        jobAgency.sendOffer(name, vacancy);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
