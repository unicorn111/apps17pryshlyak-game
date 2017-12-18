public class Knight extends Character {
    int power;
    int hp;
    private boolean alive;
    int min = 2;
    int max = 12;
    int randomNum = min + (int) (Math.random() * (max - min));

    public Knight(int power, int hp) {
        super(power, hp);
        this.alive = true;
    }
    @Override
    public void kick(Character c){
        c.hp = c.power - randomNum;
    }
}
