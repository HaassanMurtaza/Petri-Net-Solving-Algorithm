
public class Test {

	public static void main(String[] args){
		
		Places p1 = new Places(1);
		Places p2 = new Places();
		Places p3 = new Places(2);
		Places p4 = new Places(1);
		Places p5 = new Places();
		// Transitions Array
		Transitions[] t = new Transitions[]{
				new Transitions(2, 2),
				new Transitions(2,1)
		};
		// Setting of transition 1
		t[0].setInputPlaces(p1);
		t[0].setInputPlaces(p3);
		t[0].setOutputPlaces(p2);
		t[0].setOutputPlaces(p4);
		// Setting of transition 2
		t[1].setInputPlaces(p3);
		t[1].setInputPlaces(p4);
		t[1].setOutputPlaces(p5);
		// Help in iterating transitions again & again
		boolean trans = true;
		int counter = 0;
		while(trans){
		trans = false;
		for(Transitions t1 : t){
			boolean allow = true;
			while(allow){
				for(Places p: t1.inputPlaces){	
					if(p.count <= 0){
						allow = false;
					}
				}
				if(allow){
						for(Places p: t1.inputPlaces){
							p.decreaseCount();
						}
						for(Places p: t1.outputPlaces){
							p.increaseCount();
						}
						System.out.println("Final Values  "+ counter + " iteration " + " P1 : " + p1.count + " P2 : " + p2.count
								 + " P3 : " + p3.count + " P4 : " +  p4.count + " P5 : " + p5.count);	
						trans = true;
					}
				}			
			counter++;	
			}	
	
		}
		
	}
}
