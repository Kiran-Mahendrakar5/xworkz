public class Constructor{
   public Constructor(){
		System.out.println("Constructor");
	}
	public Constructor(Double rating){
		System.out.println("xworkz BTM rating");
	}
	public Constructor(Boolean torf){
		System.out.println("human live without water");
	}
	public Constructor(float percentage){
		System.out.println("percentage Of My SSLC");
	}
	public Constructor(char letter){
		System.out.println("first Letter Of My Name kiran");
	}
	
	public static void main(String[] args){
		Constructor name = new Constructor();
		Constructor rating = new Constructor(4.9);
		Constructor trueORfalse = new Constructor(false);
		Constructor percentage = new Constructor(75.68f);
		Constructor letter = new Constructor('k');
	}
}