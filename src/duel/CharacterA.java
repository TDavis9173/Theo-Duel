package duel;

public class CharacterA implements Dueler {
	private int hp;
	private boolean loaded=false;
	public CharacterA() {
	}
	public void taunt(){
		String taunt = "Reeeeeeeeee";
		System.out.println(taunt);
	}
	public String getName(){
		
		
		return "4 chan" ;
		
	}
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	public int getHP() {
		
		return this.hp;
		}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(d.getHP() == hp) {
			return true;
		}
		return false;
	}
	public int getAction(Object caller) {
		if(caller instanceof Duel) {
			if(loaded==false) {
				loaded=true;
				return 0;
			}
			else {
				double rng=Math.random();
				if(rng<50) {
					loaded=false;
					return 1;
				}
				else {
					return 2;
				}
			}
		}
		else {
			return 3;
		}
			
			
	}
	public void hit(Object caller) {
		if(caller instanceof Duel) {
			this.hp-=10;
		}
	}
}