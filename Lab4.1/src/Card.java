/**Created by Kaitlyn Cao on 12/14/2017
 * Lab 4.1 Cards - Card Class 
 * */
public class Card {

	private String rank;
	private String suit; 
	private int pointValue;
	
	public Card(String rank, String suit, int pointValue)
	{
		this.rank = rank;
		this.suit = suit; 
		this.pointValue = pointValue;
	}
	
	public boolean equals(Card otherCard)
	{
		if(otherCard.rank.equals(this.rank))
		{
			if(otherCard.suit.equals(this.suit))
			{
				if(otherCard.pointValue == this.pointValue)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public String toString()
	{
		return "CARD RANK: " + this.rank + "CARD SUIT: " + this.suit + " CARD VALUE: " + this.pointValue;
	}
}
