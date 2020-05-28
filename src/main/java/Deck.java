import java.util.ArrayList;


public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
    this.cards = new ArrayList<Card>();


    public int getSize(){
        return this.cards.size();
    }

//    public void populateDeck(SuitType[] suits, RankType[] ranks){
////        for (SuitType suit : suits..getAllTheSuits()){
////            for(RankType rank : ranks.getRanks()){
////                this.cards.add(new Card(suit,rank));
////            }
////        }
//        for (int i = 0; i < suits.length; i++){
//            for (int y =0; i< ranks.length; y++){
//                this.cards.add(new Card(suits[0], ranks[0]));
//            }
//        }
//    }
}
