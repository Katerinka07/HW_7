package Observer;

public class Student extends Applicant{


    private int salary = 2000;

    public Student(String name, String surName, VacancyType vacancyType) {
        super(name, surName, vacancyType);
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (vacancyType == vacancy.getVacancyType()) {
            if (salary <= vacancy.getSalary()) {
                System.out.printf("Студент %s %s: Мне нужна эта работа! (компания: %s; вакансия %s; заработная плата: %d)\n",
                        name, surName, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
                salary = vacancy.getSalary();
            } else {
                System.out.printf("Студент %s %s: Я найду работу получше! (компания: %s; вакансия %s; заработная плата: %d)\n",
                        name, surName, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
            }
        }
        else {
            System.out.printf("Студент %s %s: Эта работа мне не подходит, не соответствует квалификации (компания: %s; вакансия %s; заработная плата: %d)\n",
                    name, surName, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
        }
    }
}

