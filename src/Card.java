
public class Card {

	private String CardFace = "";
	private int CardValue = 0;
	private int cardID = 0;	
	
	public Card(String face, int value, int ID){
		this.CardFace = face;
		this.CardValue = value;
		this.cardID = ID;
	}
	
	// getters for each variable
	public String GetCardDesc(){
		
		return CardFace;
	}
	
	public int GetCardValue(){
		
		return CardValue;
	}
	
	public int GetCardID(){
		
		return cardID;
	}
	
	//setters for each variable
	public String SetCardDesc(String identity){
		this.CardFace = identity;
		return CardFace;
	}
	
	public int SetCardValue(int num){
		this.CardValue = num;
		return CardValue;
	}
	
	public int SetCardID(int ID){
		this.cardID = ID;
		return cardID;
	}
}
