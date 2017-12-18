public class Play {
    public static void main(String[] args) {
        Character c1 = new  CharacterFactory().createCharacter();
        Character c2 = new  CharacterFactory().createCharacter();
        GameManager game = new GameManager();
        game.fight(c1,c2);

    }
}
