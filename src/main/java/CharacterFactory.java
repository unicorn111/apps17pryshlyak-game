import java.util.Random;

public class CharacterFactory {
    int used;
    public CharacterFactory(){
        this.used = 0;
    }
    public int randomNum(int min, int max){
        //int randomn = min + (int) (Math.random() * (max - min));
        Random rand = new Random();
        int randomn = rand.nextInt(max - min) + 1 + min;
        return randomn;
    }
    public Character createCharacter(){
        Character[] characters = {new Elf(), new Hobbit(), new King(this.randomNum(5,15), this.randomNum(5,15)), new Knight(this.randomNum(2,12), this.randomNum(2,21))};
        return characters[this.randomNum(0, 3)];
    }
}
