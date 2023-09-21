
class Jet{
	public void Jet()
	{
		System.out.println("------- My Attribut ------------");
		System.out.println("High Maximum speed");
		System.out.println("Fly at high");
		System.out.println("Low Fuel Consumption");
	}
		
}

class Aeroplane extends Jet{
	public void Aeroplane()
	{
		System.out.println("--------- Aeroplane------------");
		System.out.println("Short takeoffs & Landing");
		System.out.println("Need Pilots and Copilots");
		System.out.println("Wing system to sustain it in fligth");
	}
}

class Helicopter extends Aeroplane{
	public void Helicopter()
	{
		System.out.println("---------Helicopter------------");
		System.out.println("High Speed");
		System.out.println("Noice is high");
	}
}

class Rocket extends Helicopter{
	public void Rocket()
	{
		System.out.println("------------Rocket--------------");
		System.out.println("Use for work");
	}
	public void CallAll()
	{
		Jet();
		Aeroplane();
		Helicopter();
		Rocket();
	}
}




public class FlayableMain {

	public static void main(String[] args) {
		Rocket R1=new Rocket();
		R1.CallAll();

	}

}
