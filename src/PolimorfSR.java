class Pass {
    private String fullName; // Фамилия, имя, отчество

    /**
     * Конструктор для создания объекта пропуска.
     *
     * @param fullName Фамилия, имя, отчество владельца пропуска.
     */
    public Pass(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Возвращает фамилию, имя, отчество владельца пропуска.
     *
     * @return Фамилия, имя, отчество.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Устанавливает фамилию, имя, отчество владельца пропуска.
     *
     * @param fullName Фамилия, имя, отчество.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    /**
     * Выводит информацию о пропуске.
     */
    public void printInfo() {
        System.out.println("ФИО: " + fullName);
    }

    @Override
    public String toString() {
        return "Пропуск{" +
                "Полное имя:'" + fullName + '\'' +
                '}';
    }
}
/**
 * Класс, представляющий пропуск преподавателя, наследуется от базового класса Pass.
 * Содержит информацию о факультете и кафедре преподавателя.
 */
class TeacherPass extends Pass {
    private String faculty; // Факультет
    private String department; // Кафедра

    /**
     * Конструктор для создания объекта пропуска преподавателя.
     *
     * @param fullName  Фамилия, имя, отчество преподавателя.
     * @param faculty   Факультет преподавателя.
     * @param department Кафедра преподавателя.
     */
    public TeacherPass(String fullName, String faculty, String department) {
        super(fullName);
        this.faculty = faculty;
        this.department = department;
    }

    /**
     * Возвращает факультет преподавателя.
     *
     * @return Факультет.
     */
    public String getFaculty() {
        return faculty;
    }
    /**
     * Устанавливает факультет преподавателя.
     *
     * @param faculty Факультет.
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * Возвращает кафедру преподавателя.
     *
     * @return Кафедра.
     */
    public String getDepartment() {
        return department;
    }
    /**
     * запись кафедры преподавателя в переменную
     *
     * @param department Кафедра.
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    /**
     * Вывод информацию о пропуске преподавателя.
     * Переопределяет метод printInfo() базового класса.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Факультет: " + faculty);
        System.out.println("Кафедра: " + department);
    }

    @Override
    public String toString() {
        return "Пропуск преподавателя{" +
                "Полное имя:'" + getFullName() + '\'' +
                "Факультет:'" + faculty + '\'' +
                ", Кафедра'" + department + '\'' +
                '}';
    }
}

/**
 * Класс, представляющий пропуск студента, наследуется от базового класса Pass.
 * Содержит информацию о факультете и годе поступления студента.
 */
class StudentPass extends Pass {
    private String faculty; // Факультет
    private int yearOfAdmission; // Год поступления

    /**
     * Конструктор для создания объекта пропуска студента.
     *
     * @param fullName       Фамилия, имя, отчество студента.
     * @param faculty        Факультет студента.
     * @param yearOfAdmission Год поступления студента.
     */
    public StudentPass(String fullName, String faculty, int yearOfAdmission) {
        super(fullName);
        this.faculty = faculty;
        this.yearOfAdmission = yearOfAdmission;
    }

    /**
     * Возвращает факультет студента.
     *
     * @return Факультет.
     */
    public String getFaculty() {
        return faculty;
    }
    /**
     * Устанавливает факультет студента.
     *
     * @param faculty Факультет.
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * Возвращает год поступления студента.
     *
     * @return Год поступления.
     */
    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    /**
     * Устанавливает год поступления студента.
     *
     * @param yearOfAdmission Год поступления.
     */
    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }
    /**
     * Выводит информацию о пропуске студента.
     * Переопределяет метод printInfo() базового класса.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Факультет: " + faculty);
        System.out.println("Год поступления: " + yearOfAdmission);
    }

    @Override
    public String toString() {
        return "Студенческй пропуск{" +
                "Полное имя:'" + getFullName() + '\'' +
                "Факультет'" + faculty + '\'' +
                ", Год поступления='" + yearOfAdmission +
                '}';
    }
}


