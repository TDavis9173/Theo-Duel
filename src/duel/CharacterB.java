package duel;

public class CharacterB implements Dueler  {
	public int hitpoints;
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
			double rng=Math.random();
			if(rng<.33) {
				return 1;
			}
			else if(rng>.33 && rng<.66){
				return 2;
			}
			else{
				return 0;
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