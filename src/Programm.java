import java.util.ArrayList;
import java.util.List;
/**
 * Главный класс приложения, содержит метод main для запуска программы.
 */
public class Programm {
    /**
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки.
     */
    public static void main(String[] args) {
        // Создание массива объектов Pass, содержащего информацию о пропусках преподавателей и студентов
        List<Pass> passes = new ArrayList<>();
        passes.add(new TeacherPass("Иванов Иван Грозный", "Информационных технологий", "Информатика"));
        passes.add(new StudentPass("Петров Петр Анатольевич", "Математический", 2020));
        passes.add(new TeacherPass("Сидоров Сидор Геннадиевич", "Физический", "Общая физика"));
        passes.add(new StudentPass("Александров Александр Акакиевич", "Химический", 2019));
        passes.add(new StudentPass("Екатерина Судиславская", "Исторический", 2022));
        passes.add(new TeacherPass("Козлов Михаил Васильевич", "Философский", "Философия"));
        // Вывод информации, содержащейся в массиве passes
        System.out.println("Информация о пропусках всех сотрудников:");
        for (Pass pass : passes) {
            pass.printInfo();
            System.out.println("---------------------");
        }

        // Вывод информации о пропусках всех студентов
        System.out.println("\nИнформация о пропусках студентов:");
        for (Pass pass : passes) {
            if (pass instanceof StudentPass) {
                pass.printInfo();
                System.out.println("---------------------");
            }
        }

        // Определение, сколько пропусков студентов должно быть аннулировано
        int currentYear = 2024; // Текущий год
        int annulledPassesCount = 0;
        for (Pass pass : passes) {
            if (pass instanceof StudentPass) {
                StudentPass studentPass = (StudentPass) pass;
                if (currentYear - studentPass.getYearOfAdmission() >= 4) { // Предполагаем, что обучение длится 4 года
                    annulledPassesCount++;
                }
            }
        }
        System.out.println("\nКоличество пропусков, которые должны быть аннулированы: " + annulledPassesCount);

        System.out.println("\nВсе объекты массива");
        for(Pass pass : passes){
            System.out.println(pass);
        }
    }
}
