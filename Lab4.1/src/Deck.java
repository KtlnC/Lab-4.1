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
		for(int i = 0; i < card.size(); i++)
		{
			card.add(ranks[i]);
		}
	}
	

	public boolean isEmpty()
	{
		return false;
	}
	
}
