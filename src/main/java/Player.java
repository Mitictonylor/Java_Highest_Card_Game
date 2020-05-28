import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> card;

    public Player(String name){
        this.name = name;
        this.card = new ArrayList<Card>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getCard() {
        return this.card;
    }

    public void setCard(ArrayList<Card> card) {
        this.card = card;
    }

    public int countCard() {
        return this.card.size();
    }
}
