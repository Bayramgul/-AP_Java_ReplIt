package certificate.oca;

public class Udemy_20 {

    String name;
    int age;

    void Udemy_20() {
    	Udemy_20("James", 25);
    }

    void Udemy_20(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

 class Tests {
    public static void main(String[] args) {
    	Udemy_20 s = new Udemy_20();
        System.out.println(s.name + ":" + s.age);
    }

}
