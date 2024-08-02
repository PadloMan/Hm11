public class Person {
        private String name;
        private int age;
        private String profession;
        public Person(String name, int age, String profession) {
            this.name = name;
            this.age = age;
            this.profession = profession;
        }
        public void setProfession(String newProfession) {
            this.profession = newProfession;
        }
        public void printInfo() {
            System.out.println("Ім'я: " + name);
            System.out.println("Вік: " + age);
            System.out.println("Професія: " + profession);
        }
        public static void main(String[] args) {
            Person person1 = new Person("Alice", 30, "Інженер");
            Person person2 = new Person("Bob", 25, "Вчитель");
            Person person3 = new Person("John", 35, "Лікар");
            System.out.println("Інформація про осіб:");
            person1.printInfo();
            System.out.println();
            person2.printInfo();
            System.out.println();
            person3.printInfo();
            System.out.println();
            person2.setProfession("Архітектор");
            System.out.println("Оновлена інформація про особу:");
            person2.printInfo();
        }
    }

