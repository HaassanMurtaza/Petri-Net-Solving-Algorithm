
public class Places {

	int count;
	
	Places(){}
	
	Places( int c ){
		this.count = c;
	}
	
	public void decreaseCount(){
		this.count--;
	}
		
	public void increaseCount(){
		this.count++;
	}
	
	public int getCount(){
		return this.count;
	}
	
}
