package collection.compare.test;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void drawCard(Deck deck) {
        hand.add(deck.drawCard());
    }

    public int rankSum(){
        int sum = 0;
        for (Card card : hand) {
            sum += card.getRank();
        }
        return sum;
    }

    public void showHand(){
        hand.sort(null);
        System.out.println(name + "의 카드: " + hand + ", 합계: " + rankSum());
    }

    public void Winner( Player player) {
        int sum1 = this.rankSum();
        int sum2 = player.rankSum();

        if (sum1 > sum2) {
            System.out.println(this.name + " 승리");
        } else if (sum1 == sum2) {
            System.out.println("무승부");
        } else {
            System.out.println(player.name + " 승리");
        }
    }
}
