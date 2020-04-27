package Lesson5_HW5;

public class PersonTest {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван, ", "Начальник Тех. отдела, ", "IvanIvan@person.ru, ", "8(912)3456789, ", 50000, 42);
        persArray[1] = new Person("Петров Петр, ", "Менеджер, ", "PetrovPetr@person.ru, ", "8(912)3456789, ", 35000, 33);
        persArray[2] = new Person("Сидоров Даниил, ", "Эксперт, ", "SidorovDaniil@person.ru, ", "8(912)3456789 ", 35000, 40);
        persArray[3] = new Person("Попов Алексей, ", "Специалист, ", "PopovAlex@person.ru, ", "8(912)3456789 ", 30000, 37);
        persArray[4] = new Person("Корнеев Дмитрий, ", "Мастер наладчик, ", "KornDmitr@person.ru, ", "8(912)3456789, ", 30000, 56);

        for (Person person : persArray){
            if (person.getAge() >= 40) {
                System.out.println(person);
            }
        }
    }
}