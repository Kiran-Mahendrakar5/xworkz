public class Animal{
 
static String name;
static long noOfAnimals;
static boolean doesLionEatGrass;
static double meatConsistingFatyAcid;
static char firstLetterOfAnimal;

int noCaveInForest=1567634;
int noDomasticAnimals=26556;
int noWildAnimals=5767;
int noOfTrees=25555;
int noOfRiver=14566;

final byte noOfForest;
final float forestVolume;
final double forestLength;
final byte noOfMonths;
final byte noOfWeeks;

Colour colour;
Legs legs;
Veg veg;

public Animal(byte noOfForest,float forestVolume,double forestLength,byte noOfMonths,byte noOfweeks,Colour colour,Legs legs,Veg veg){
	this.noOfForest=noOfForest;
	this.forestVolume=forestVolume;
	this.forestLength=forestLength;
	this.noOfMonths=noOfMonths;
	this.noOfWeeks=noOfWeeks;
	
	this.colour=colour;
	this.legs=legs;
	this.veg=veg;
}
static{
	Animal.name="lion";
	Animal.noOfAnimals=567898766l;
	Animal.doesLionEatGrass=false;
	Animal.meatConsistingFatyAcid=9.5d;
	Animal.firstLetterOfAnimal= 'A';
	
	System.out.println(Animal.name);
	System.out.println(Animal.noOfAnimals);
	System.out.println(Animal.doesLionEatGrass);
	System.out.println(Animal.meatConsistingFatyAcid);
	System.out.println(Animal.firstLetterOfAnimal);
}
public static void main(String[] args){
	Animal demo = new Animal(1567634,26556,5767,25555,14566,Colour.YELLOW,Legs.FOUR,Veg.GRASS);
	System.out.println(demo.noCaveInForest);
	System.out.println(demo.noDomasticAnimals);
	System.out.println(demo.noWildAnimals);
	System.out.println(demo.noOfTrees);
	System.out.println(demo.noOfRiver);
	
	System.out.println(demo.noOfForest);
	System.out.println(demo.forestVolume);
	System.out.println(demo.forestLength);
	System.out.println(demo.noOfMonths);
	System.out.println(demo.noOfWeeks);
	
	System.out.println(demo.colour.colour);
	System.out.println(demo.legs.legs);
	System.out.println(demo.veg.veg);
	
    }
	enum Colour{
		YELLOW("yellow"),LIGHTORANGE("lightorange");
		String colour;
		Colour(String colour){
			this.colour=colour;
		}
	}
	enum Legs{
		TWO("two"),FOUR("four");
		String legs;
		Legs(String legs){
			this.legs=legs;
		}
	}
	enum Veg{
		GRASS("rabbit"),MEAT("lion");
		String veg;
		Veg(String veg){
			this.veg=veg;
		}
	}

}