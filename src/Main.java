;
public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Меркулов Михаил Викторович", 1, 6000);
        employees[1] = new Employee("Меркулова Антонина Викторовна", 2, 3000);
        employees[2] = new Employee("Меркулов Дмитрий Викторович", 3, 2000);
        employees[3] = new Employee("Меркулова Людмила Викторовна", 4, 1000);
        employees[4] = new Employee("Меркулов Анатолий Викторович", 5, 4000);
        employees[5] = new Employee("Меркулова Лилия Викторовна", 5, 1500);
        employees[6] = new Employee("Меркулова Анна Викторовна", 4, 2500);
        employees[7] = new Employee("Меркулова Татьяна Викторовна", 3, 3500);
        employees[8] = new Employee("Меркулова Елена Викторовна", 2, 4500);
        employees[9] = new Employee("Меркулов Николай Викторович", 2, 5500);

        System.out.println(employees.length);

        for (int id = 0; id < employees.length; id++){
            System.out.println(employees[id].toString());
        }
        System.out.println("Сумма затрат на заработные платы за месяц равна " + calculateWage());
        System.out.println("Максимальная заработная плата составляет " + getMaxWage());
        System.out.println("Минимальная заработная плата составила " + getMinWage());
        System.out.println("Средняя заработная плата равна " + calculateAverageWage());
        System.out.println("Список сотрудников  " +displayListEmployees());
    }

    public static int calculateWage() {
        int sum = 0;
        for (Employee employee : employees) {
            assert employee != null;
            sum += employee.getWage();
        }
        return sum;
    }

    public static int getMaxWage() {
        int max = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getWage() > max)
                max = employee.getWage();
        }
        return max;

    }

    public static int getMinWage() {
        int min = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getWage() < min)
                min = employee.getWage();
        }
        return min;

    }


    public static int calculateAverageWage() {
        int sum = 0;
        for (Employee employee : employees) {
            assert employee != null;
            sum = calculateWage() / 10;
        }
        return sum;

    }

     public static String displayListEmployees() {   //Вывести список сотрудников
         String listEmployees = "";
         for (Employee employee : employees) {
            System.out.println(employee.getSurnameFirstnameLastname());
        }
       return listEmployees;
        }


}




