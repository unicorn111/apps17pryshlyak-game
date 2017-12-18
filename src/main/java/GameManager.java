public class GameManager {
    public GameManager(){}
    void fight(Character c1, Character c2){
        while (true){
            System.out.println(c1.getClass().getSimpleName());
            System.out.println("c1.kick()");
            c1.kick(c2);
            if (c2.isAlive() == false){
                break;
            }
            if (c1.isAlive() == false){
                break;
            }
            System.out.println(c2.getClass().getSimpleName());
            System.out.println("c2.kick()");
            c2.kick(c1);
            if (c2.isAlive() == false){
                break;
            }
            if (c1.isAlive() == false){
                break;
            }
        }
        System.out.println("Someone died... rest in peace...");
    }
}
