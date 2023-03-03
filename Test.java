class Caculator{
	void add(){
		int a= 50;
		int b= 40;
		int c= a+b;
		System.out.println(c);
	}
}
class Caculator2{
	void sub(){
		int a= 50;
		int b= 40;
		int c= (a-b);
		System.out.println(c);
	}
}
Class Test {
	public static void main (sring[] args){
		Caculator c1= new Caculator();
		Caculator c2= new Caculator();
        c1.add();
        c2.sub();
	}
}