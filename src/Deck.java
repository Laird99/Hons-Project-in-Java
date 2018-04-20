
public class Deck {
	
	private String type, face, suit;
	private int num, cardID = 0;
	private Card[] deck = new Card[52];
	
	public Deck(){
	//constructor	
		for(int i = 0; i < 13; i++){
			
			switch(i){
			
				case 0: { face = "A"; num = 11; break;}
				case 1: { face = "2"; num = 2; break;}
				case 2: { face = "3"; num = 3; break;}
				case 3: { face = "4"; num = 4; break;}
				case 4: { face = "5"; num = 5; break;}
				case 5: { face = "6"; num = 6; break;}
				case 6: { face = "7"; num = 7; break;}
				case 7: { face = "8"; num = 8; break;}
				case 8: { face = "9"; num = 9; break;}
				case 9: { face = "10"; num = 10; break;}
				case 10: { face = "J"; num = 10; break;}
				case 11: { face = "Q"; num = 10; break;}
				case 12: { face = "K"; num = 10; break;}
			}		
				for(int j = 0; j < 4; j++){
					
					switch(j){
					
						case 0: { suit = "H"; break;}
						case 1: { suit = "D"; break;}
						case 2: { suit = "C"; break;}
						case 3: { suit = "S"; break;}
						
					}
					
					type = face+suit;
					
					deck[cardID] = new Card(type, num, cardID);
					// System.out.print(deck[cardID].GetCardDesc() + " "); testing purposes to check if deck initiated correctly
					// System.out.println(deck[cardID].GetCardID());	
					cardID++;		
					}
				
			}

	}
	
	public String DealCard(int x){
		
		return deck[x].GetCardDesc();
		
	}
	
	public int IssueValue(int x){
		
		return deck[x].GetCardValue();
	}
	
	public void RemoveCard(int x){
		int cardpos = x;
		
			for(int i = cardpos; i < deck.length; i++){
				// removes last card to compensate for array moving up one
				if(i == (deck.length - 1)){
					deck[i].SetCardDesc(null);
					deck[i].SetCardValue(0);
					deck[i].SetCardID(0);
				}
				// overwrites array from position card taken from
				else{
					String y = deck[i+1].GetCardDesc();
					int z = deck[i+1].GetCardValue();
					int a = deck[i+1].GetCardID();
			
					deck[i].SetCardDesc(y);
					deck[i].SetCardValue(z);
					deck[i].SetCardID(a);		
					}	
				
			}
							
	}
	
	
	
}
