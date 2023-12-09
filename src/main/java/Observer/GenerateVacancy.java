package Observer;

import java.util.Random;

public class GenerateVacancy {
    private static Random random = new Random();
    public static Vacancy vacancyAdministrator() {
        String nameVacancy = "Администратор";
        int salary = random.nextInt(30000,90000);
        VacancyType vacancyType = VacancyType.Administrator;
        return new Vacancy(nameVacancy, salary, vacancyType);
    }
    public static Vacancy vacancyMarketing() {
        String nameVacancy = "Маркетолог";
        int salary = random.nextInt(40000,100000);
        VacancyType vacancyType = VacancyType.Marketing;
        return new Vacancy(nameVacancy, salary, vacancyType);
    }
    public static Vacancy vacancyProgrammer() {
        String nameVacancy = "Программист";
        int salary = random.nextInt(40000,120000);
        VacancyType vacancyType = VacancyType.Programmer;
        return new Vacancy(nameVacancy, salary, vacancyType);
    }
    public static Vacancy vacancyConsultant() {
        String nameVacancy = "Консультант";
        int salary = random.nextInt(30000,75000);
        VacancyType vacancyType = VacancyType.Consultant;
        return new Vacancy(nameVacancy, salary, vacancyType);
    }
    public static Vacancy vacancyCourier() {
        String nameVacancy = "Курьер";
        int salary = random.nextInt(5000,20000);
        VacancyType vacancyType = VacancyType.Courier;
        return new Vacancy(nameVacancy, salary, vacancyType);
    }
    public static Vacancy generateVacancy() {
        int typeIndex = random.nextInt(5);
//        if (typeIndex == 0) {
//            Vacancy vacancy = vacancyMarketing();
//            return vacancy;
//        }
//        else if (typeIndex == 1) {
//            Vacancy vacancy = vacancyAdministrator();
//            return vacancy;
//        }
//        else if (typeIndex == 2) {
//            Vacancy vacancy = vacancyProgrammer();
//            return vacancy;
//        }
//        else if (typeIndex == 3) {
//            Vacancy vacancy = vacancyConsultant();
//            return vacancy;
//        }
//        else {
//            Vacancy vacancy = vacancyCourier();
//            return vacancy;
//        }
        return switch (typeIndex) {
            case 0 -> vacancyConsultant();
            case 1 -> vacancyCourier();
            case 2 -> vacancyAdministrator();
            case 3 -> vacancyMarketing();
            case 4 -> vacancyProgrammer();
            default -> null;
        };
    }
}
