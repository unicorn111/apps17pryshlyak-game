public class King extends Character {
    int power;
    int hp;
    private boolean alive;
    int min = 5;
    int max = 15;
    int randomNum = min + (int) (Math.random() * (max - min));

    public King(int power, int hp) {
        super(power, hp);
        this.alive = true;
    }
    @Override
    public void kick(Character c){
        c.hp = c.power - randomNum;
    }
}
