package duel;

public class CharacterB implements Dueler  {
	private int hitpoints;
	private boolean loaded=false;
	public CharacterB(){
		
	}
	public void taunt() {
		String taunt = "hai";
		System.out.println(taunt);
	}
	public String getName() {
		return "Namer";
	}
	public void setStartingHP(int hp) {
		this.hitpoints = hp;
		}

	public int getHP() {
		return this.hitpoints;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		while (d.getHP() == hp) {
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
				if(rng<.90) {
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
			this.hitpoints-=10;
		}
	}
	
}