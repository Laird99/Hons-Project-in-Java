import java.io.Serializable;

public class Player implements Serializable{

	private String username = "";
	private int chipcount = 0;
	public Player(String name, int chips){

		this.username = name;
		this.chipcount = chips;
	}
	
	// to String for user name and chip count
	public String toString(){
		
		return username + ". Available Funds: " + chipcount;
	}
		
	// getters for each variable
		public String GetUser(){
			
			return username;
		}
		
		public int GetChips(){
			
			return chipcount;
		}
		
		//setters for each variable
		public String SetUName(String identity){
			this.username = identity;
			return username;
		}
		
		public int SetChipCount(int chips){
			this.chipcount = chips;
			return chipcount;
		}

}
