
public class Main{
	public static void main (String [] args){

	Forth bucky[]=new Forth[3];
	bucky[2]=new Forth();
	bucky[0]=new Second();
	bucky[1]=new Third();
	
	for(int x=0; x<3 ;x++){
		bucky[x].eat();
	}

	}
}
