public class Hobbit extends Character {
    int power;
    int hp;
    private boolean alive;

    public Hobbit(){
        super(0, 3);
        this.alive = true;
    }
    public void toCry(){
        System.out.println("Tears... Hobbit is a week guy, he couldn`t kill anyone ");
    }
    public void kick(Character c1){
        this.toCry();
    }
}
