
public class Player {
	private String name;
	private int score;

	

	public int getScore() { return score;}
	public  String getName() { return name;}
	

	public void setScore (int score) {
				this.score = score;
	}
	
	public void setName( String name) {
				this.name = name;
	}
	
	
	
	public Player(String name, int score) {
				setName(name);
				setScore(score);
			
	}
	
	/** no-args constructor, for use as in Person p = new Person()
	 *  to create a default Person
	 */
	public Player() {
				this("Not Given",0);
	}
	
		
	/* Every object should have one of these, to give a quick
	 * String summary of the values of all the object'Strategy attributes
	 */
	public String toString() {
				return getName() + " " + getScore();
	}
}