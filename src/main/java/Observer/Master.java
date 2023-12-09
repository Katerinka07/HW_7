package Observer;

public class Master extends Applicant{

    private int salary = 80000;

    public Master(String name, String surName, VacancyType vacancyType) {
        super(name, surName, vacancyType);
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (vacancyType == vacancy.getVacancyType()) {
            if (salary <= vacancy.getSalary()){
                System.out.printf("Специалист %s %s: Мне нужна эта работа! (компания: %s; вакансия %s; заработная плата: %d)\n",
                        name, surName, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
                salary = vacancy.getSalary();
            }else {
                System.out.printf("Специалист %s %s: Я найду работу получше! (компания: %s; вакансия %s; заработная плата: %d)\n",
                        name, surName, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
            }
        }
        else {
            System.out.printf("Специалист %s %s: Эта работа мне не подходит, не соответствует квалификации (компания: %s; вакансия %s; заработная плата: %d)\n",
                    name, surName, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
        }
    }


}
