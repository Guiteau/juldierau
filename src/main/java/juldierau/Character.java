package juldierau;

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
		
	}
	
	private void changeSpeed()
	{
		switch((int)Math.random() * 3 + 1)
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
		switch(speed)
		{
			case SLOW:
				if ((int)Math.random() * 2 == 0)
					
				break;
		}
	}
	
	public abstract void update();
}
