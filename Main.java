public class Main {

    private String name;
    private int age;
    private String gender;
    private String[] interests;


    public void setInterests(String[] interests) {
        this.interests = interests;
    }


    public String[] getInterests() {
        return interests;
    }


    public String hello() {
        StringBuilder greeting = new StringBuilder("Hello, my name is " + name + ", my gender is " + gender + " and I am " + age + " years old. My interests are ");

        
        for (int i = 0; i < interests.length; i++) {
            greeting.append(interests[i]);
            if (i < interests.length - 1) {
                greeting.append(", ");
            }
        }

        greeting.append(".");
        return greeting.toString();
    }


    public static void main(String[] args) {
        // Creating an instance of Person
        Main person = new Main();

        // Setting attributes
        person.name = "Ryuk";
        person.age = 35;
        person.gender = "male";
        person.setInterests(new String[]{"being a hardarse", "agile", "SSD hard drives"});


        String greeting = person.hello();
        System.out.println(greeting);
    }
}
