package com.practise.systemdesign;

import java.util.Random;
import java.util.Stack;
/**
 * Created by Dhatchana Moorthy.
 * Date: Aug 19, 2016
 * Time: 9:46:51 AM
 */
 class Card {
    //0 for spade, 1 for heart, 2 for diamond and 3 for club
    int cardsymbol;
    int cardnumber;

    public Card(int cardsymbol, int cardnumber)
    {
        this.cardsymbol = cardsymbol;
        this.cardnumber = cardnumber;
    }
}



/**
 * Created by Dhatchana Moorthy.
 * Date: Aug 19, 2016
 * Time: 9:49:50 AM
 */
 class Deck {
    Stack<Card> cardstack = new Stack<Card>();

    private static Random rand = new Random();

    public Deck()
    {
        populateDeckWithCards();
        shuffle();
    }

    public void populateDeckWithCards()
    {
        for(int i=0; i < 4; i++)
        {
            for(int j=1; j < 14; j++)
            {
                cardstack.push(new Card(i, j));
            }
        }
    }

    public void shuffle()
    {
        //fisher yates shuffle algorithm
        for(int i=cardstack.size()-1; i > 0; i--)
        {
            int swapindex = rand.nextInt(i);
            
            Card temp = cardstack.get(i);
            cardstack.set(i, cardstack.get(swapindex));
            cardstack.set(swapindex, temp);
        }
    }

    public void deal(String dealtype, int numberofpersons)
    {
        //Seperate dealtype classes can be created
        if(dealtype.equals("ace"))
        {
            int i=1;
            while(!cardstack.isEmpty())
            {
                //Seperate person classes can be created
                Card card = cardstack.pop();

                System.out.println();
                int person = i%numberofpersons;
                if(person == 0)
                {
                    person = 4;
                }

                System.out.print("Person: "+person+" cardsymbol: ");
                if(card.cardsymbol == 0)
                {
                    System.out.print("Spade");
                }
                else if(card.cardsymbol == 1)
                {
                    System.out.print("heart");
                }
                else if(card.cardsymbol == 2)
                {
                    System.out.print("diamond");
                }
                else
                {
                    System.out.print("club");
                }

                if(card.cardnumber == 1)
                {
                    System.out.print(" cardnumber: ace");
                }
                else if(card.cardnumber == 11)
                {
                    System.out.print("cardnumber: Jack");
                }
                else if(card.cardnumber == 12)
                {
                    System.out.print("cardnumber: Queen");
                }
                else if(card.cardnumber == 13)
                {
                    System.out.print("cardnumber: King");                    
                }
                else
                {
                    System.out.print("cardnumber: "+card.cardnumber);
                }

                i++;
            }
        }
    }
}

/**
 * Created by Dhatchana Moorthy.
 * Date: Aug 21, 2016
 * Time: 6:45:21 PM
 */
public class CardGame {

    public static void main(String[] args)
    {
        Deck deck = new Deck();

        deck.deal("ace", 4);
    }
}
