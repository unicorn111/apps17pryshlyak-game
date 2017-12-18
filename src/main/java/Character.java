public class Character {
    int power;
    int hp;
    private boolean alive;
    public Character(){}
    public Character(int power, int hp){
        this.power = power;
        this.hp = hp;
        this.alive = true;
    }
    public void kick(Character c){
        c.alive = false;
    }

    boolean isAlive(){
        if (this.hp <= 0){
            return false;
        }
        return this.alive;
    }
}
