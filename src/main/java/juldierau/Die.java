package juldierau;

public class Die {
	
	

	static public double getDoubleValue(int _numLimite) {
		return (Math.random() * _numLimite) + 1;
	}

	public static int getDiscretValue(int start, int end) {
		
		int resultado = 0;
		
		resultado = start + (int)(Math.random() * ((end - start) + 1));		
		
		return resultado;

		
	}

}
