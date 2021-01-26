public class variableTypes{
	static int staticVariable = 1;	//Static variable
	//Declared as static
	//can’t be local
	//can be shared among all instances of a class
	//memory allocated only when the class is loaded
	
	int instanceVariable = 2; //Instance variable
	//Inside a class but outside of method
	//not declared as static
	//instance specific and is not shared among instances
	
	public static void main(String [] args){
		public void methodName(int methodParameter){
			int methodLocalVariable = 3; //Local variable
			//Defined inside a method
			//can’t be defined with static keyword
			
			if(true){
				int blockVariable = 4;
			}
		}
	}
}


