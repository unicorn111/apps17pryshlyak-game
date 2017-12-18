import java.util.List;

public class Elf extends Character {
    int power;
    int hp;
    boolean alive;

    public Elf() {
        super(10, 10);
        this.alive = true;
    }

    public void kick(List<Character> characters) {
        for (int i = 0; i < characters.size(); i++) {
            if(characters.get(i).power < this.power) {
                characters.get(i).hp = 0;
                super.kick(characters.get(i));
            }
            else{
                characters.get(i).power = characters.get(i).power - 1;
            }
        }
    }
}

