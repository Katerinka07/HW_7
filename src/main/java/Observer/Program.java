package Observer;

public class Program {
    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher);
        Company yandex = new Company("Yandex", publisher);
        Company geekBrains = new Company("GeekBrains", publisher);

        Student student1 = new Student("Иван", "Михайлов", VacancyType.Courier);
        Master master1 = new Master( "Максим", "Иванов", VacancyType.Administrator);
        Master master2 = new Master("Илья", "Потапов", VacancyType.Consultant);

        Junior junior1 = new Junior("Юлия", "Петрова", VacancyType.Programmer);
        Junior junior2 = new Junior("Сергей", "Игнатьев", VacancyType.Programmer);
        Manager manager1 = new Manager("Анна", "Тихомирова", VacancyType.Marketing);


        publisher.registerObserver(student1);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(junior1);
        publisher.registerObserver(junior2);
        publisher.registerObserver(manager1);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
            System.out.println();
        }


    }
}
