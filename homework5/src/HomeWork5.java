public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Adassov Zhanay", "teacher", "adassov@mail.ru", "000000001",60000,42);
        empCorp[1] = new Employee("Assan Rauan", "student", "assan@mail.ru", "000000002",52000,32);
        empCorp[2] = new Employee("Zhumabek Nurzhanar", "enginer", "zhumabek@mail.ru", "000000003",11000,19);
        empCorp[3] = new Employee("Pak Su", "hacker", "pak@mail.ru", "000000004",2200,28);
        empCorp[4] = new Employee("Lavrov Artem", "football man", "lavrov@mail.ru", "000000005",1000,43);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}