
public class Transitions {

	Places[] inputPlaces;
	Places[] outputPlaces;
	int inputcount = 0;
	int outputcount = 0;
	Transitions(){}
	
	Transitions(int input, int output){
		
		 this.inputPlaces = new Places[input];
		 this.outputPlaces = new Places[output];
	
	}
	
	public void setInputPlaces(Places p){
		this.inputPlaces[inputcount] = p;
		inputcount++;
	}
	
	public void setOutputPlaces(Places p){
		this.outputPlaces[outputcount] = p;
		outputcount++;
	}
	
}
