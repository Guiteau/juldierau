package juldierau.characters;

import juldierau.utils.Die;

public abstract class Character {
	private int energy;
	private int hp;

	public enum Speed
	{
		SLOW,
		MEDIUM,
		FAST
	}
	
	private Speed speed;
	
	private int x;
	private int y;
	
	public Character()
	{
		initialSpeed();
	}
	
	private void initialSpeed()
	{
		switch(Die.getDiscretValue(1, 3))
		{
		case 1:
			speed = Speed.SLOW;
			break;
		case 2:
			speed = Speed.MEDIUM;
			break;
		case 3:
			speed = Speed.FAST;
			break;
		}
	}
	
	protected void move()
	{
		int steps = 0;
		switch(speed)
		{
			case SLOW:
				steps = 1;
				break;
			case MEDIUM:
				steps = 2;
				break;
			case FAST:
				steps = 3;
				break;
		}
		
		while (steps != 0)
		{
			int mod = Die.getDiscretValue(0, 1) == 0 ? -1 : 1;
			
			if (Die.getDiscretValue(0, 1) == 0)
				x += mod;
			else
				y += mod;
			
			steps--;
		}
	}
	
	public abstract void update();
}
