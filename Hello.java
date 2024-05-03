import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;


public class Hello {
    private int age;
    private String name;
    private boolean activity;
    private boolean competitive;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String time = LocalDateTime.now().format(formatter);
    LocalDateTime time2 = LocalDateTime.now();
    Random rand = new Random();
    LocalTime time3 = LocalTime.of(0, rand.nextInt(1,3), rand.nextInt(60), (int) rand.nextDouble(100));
    DateTimeFormatter formattte = DateTimeFormatter.ofPattern("mm : ss : nnn");
    String time4 = time3.format(formattte);
    public Hello(int age, String name, boolean acticity, boolean competitive){
        this.age = age;
        this.name = name;
        this.activity = acticity;
        this.competitive = competitive;
    }
    public String toString(){
        return "age: " + age + " name: " + name + " activity: " + activity + " competitive: " + competitive +"\n";
    }
    public static void main(String[] args) throws FileNotFoundException {
        no no = new no();
        Hello hello = new Hello(1, "Hey", false, true);
        no.add();
        no.fileWrit();
        System.out.println(no.list.size());
        System.out.println(no.list);
        //System.out.println(hello.time);
        //System.out.println(hello.time2);
        System.out.println("      Min  Sec  Ns ");
        System.out.println("Time: " + hello.time4 + " Date: " + hello.time);

    }
}
