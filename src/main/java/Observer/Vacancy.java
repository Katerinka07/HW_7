package Observer;

public class Vacancy {
    private VacancyType vacancyType;
    private String nameVacancy;
    private int salary;


    public Vacancy(String nameVacancy, int salary, VacancyType vacancyType) {
        this.nameVacancy = nameVacancy;
        this.salary = salary;
        this.vacancyType = vacancyType;
    }

    @Override
    public String toString() {
        return String.format("Вакансия на позицию %s, заработная плата % d", nameVacancy, salary);
    }

    public String getNameVacancy() {
        return nameVacancy;
    }

    public void setNameVacancy(String nameVacancy) {
        this.nameVacancy = nameVacancy;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }

    public void setVacancyType(VacancyType vacancyType) {
        this.vacancyType = vacancyType;
    }
}

