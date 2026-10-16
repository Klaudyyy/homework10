public class Main {
    public static void main(String[] args) {
        String firstName = " Ivan";
        String middleName = " Ivanovich";
        String lastName = " Ivanov";
        String fullName = firstName + lastName + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        String fullName2 = " Иванов Семён Семёнович";
        String corrected = fullName2.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + corrected);

    }
}