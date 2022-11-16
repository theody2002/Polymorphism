public class Miniboss extends Boss {

    Miniboss() {
        name = "Thor";
        hp = 800;
    }

    void checkStatus() {
        System.out.println("Boss Name :" + name);
        System.out.println("Current HP:" + hp);

    }

}
