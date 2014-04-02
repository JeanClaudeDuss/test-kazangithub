public class Conversion {

	public Conversion(){}

	public String integerToString(int number){
		return (String)number;
	}

	public void nothing(){
		//FIXME: i do nothing
	}

	public Float doubleToFloat(Double number){
		return (Float)number;
	}

	public Gold alchemy(Dust poorStuff){
		return (Gold)poorStuff;
	}

	public Cake cooking(Ingredient ingredient){
		return (Cake)ingredient;
	}

	public Internet research(Minitel minitel){
		return (Internet)minitel;
	}

	public Money luke(){
		return new Money(500);
	}
}