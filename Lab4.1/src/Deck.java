/**Created by Kaitlyn Cao on 12/14/2017
 * Lab 4.1 Cards - Deck Class 
 *      
 * */
import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	
	public Deck(String[] ranks, String[] suits, int[] pointValue)
	{
		ArrayList<String> card = new ArrayList<String>();
		for(int i = 0; i < ranks.length; i++)
		{
			card.add(ranks[i]);
			for(int j = 0; j < suits.length; j++)
			{
				card.add(suits[i]);
				for(int k = 0; k < pointValue.length; k++)
				{
					//card.add(pointValue[i]);
				}
			}
			
		}
	}
	

	public boolean isEmpty(int size)
	{
		if(size == 0)
		{
			return true;
		}
		return false;
	}
	
	public int size(ArrayList<Card> deck)
	{
		
		return unDealt.size();
		
	}
	
	public deal()
	{
		if(unDealt.size() == 0)
		{
			return null;
		}
	}
}
