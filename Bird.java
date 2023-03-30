public class Bird{
	static String name;
	static String notionalbird;
	static String othername;
	static String colour;
	static char firstLetterOfBird;
	
	final byte malePeacockInZoo;
    final float forestVolume;
    final double beakLength;
    final byte noOfLegs;
    final byte noOfWeeks;
	
    int tails = 1111;
	int femalePeacockInZoo = 2311;
	int noOfTrees = 12567;
	int noOfMalePeacock = 24563;
	boolean femalePeacockHavingLongTail = false;
	
	Fovoritebirds aves;
	Zoo places;
	Fomousbirds chick;
	Beutifulbird raptor;
	
	
	public Bird(byte malePeacockInZoo,float forestVolume,double beakLength,byte noOfLegs,byte noOfWeeks){
		this.malePeacockInZoo=malePeacockInZoo;
		this.forestVolume=forestVolume;
		this.beakLength=beakLength;
		this.noOfLegs=noOfLegs;
		this.noOfWeeks=noOfWeeks;
	}
	static{
		Bird.name = "Peacock";
		Bird.notionalbird = "Peacock";
		Bird.othername = "peafowl";
		Bird.colour = "LightGreen";
		Bird.firstLetterOfBird = 'B';
		
		System.out.println(Bird.name);
		System.out.println(Bird.notionalbird);
		System.out.println(Bird.othername);
		System.out.println(Bird.colour);
		System.out.println(Bird.firstLetterOfBird);
	}
	
	public static void main (String[] args){
		Bird notional = new Bird((byte)112,(float)339.23f,(double)125.7,(byte)4,(byte)7);
		System.out.println(notional.tails);
		System.out.println(notional.femalePeacockInZoo);
		System.out.println(notional.noOfTrees);
		System.out.println(notional.noOfMalePeacock);
		System.out.println(notional.femalePeacockHavingLongTail);
		
		System.out.println(notional.malePeacockInZoo);
		System.out.println(notional.forestVolume);
		System.out.println(notional.beakLength);
		System.out.println(notional.noOfLegs);
		System.out.println(notional.noOfWeeks);
		
		
		System.out.println(Fovoritebirds.PIGEON.aves);
		System.out.println(Zoo.MYSORE.places);
	    System.out.println(Fomousbirds.PEACOCK.chick);
		System.out.println(Beutifulbird.EAGLE.raptor);
		
		
	}
	enum Fovoritebirds{
		PIGEON("pigeon"),PEACOCK("peacock"),PARROT("parrot"),SPARROW("sparrow"),COCKTAIL("cocktail");
		String aves;
		Fovoritebirds(String aves){
			this.aves=aves;
		}
	}
	enum Zoo{
		MYSORE("mysore"),BANNARGATTA("bannargatta"),SHIMOGA("shimoga"),BANGALORE("bangalore");
		String places;
		Zoo(String places){
			this.places=places;
		}
	}
	enum Fomousbirds{
		PEACOCK("peacock"),HOOPOES("hoopoes"),KINGFISHER("kingfisher"),NILGIRIWOODPIGEON("nilgiriwoodpigeon"),SUNBIRD("sunbird");
		String chick;
		Fomousbirds(String chick){
			this.chick=chick;
		}	
	}
	enum Beutifulbird{
		EAGLE("eagle");
		String raptor;
		Beutifulbird(String aves){
		this.raptor=raptor;	
		}
	}
	
}