public class Mainboss extends Boss {

    Mainboss() {
        name = "Odin";
        hp = 1000;
    }

    void checkStatus() {
        System.out.println("Boss Name :" + name);
        System.out.println("Current HP :" + hp);

    }

}
