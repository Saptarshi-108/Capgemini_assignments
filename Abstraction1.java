/*
Q. Mobile -> intialize camera(), battery(); 
   Redmi1 -> override camera();
   Redmi2 -> override battery(), initalize smartcamera();
   Redmi3 -> override smartcamera();
*/

// Mobile.java
package abstraction;

public abstract class Mobile {
	public abstract void camera();
	public abstract void battery();
}

//Redmi1.java
package abstraction;

public abstract class Redmi1 extends Mobile {
	@Override
	public void camera() {
		System.out.println("The camera is top notch");
	}
}

//Redmi2.java
package abstraction;

public abstract class Redmi2 extends Redmi1{
	public abstract void smartcamera();
	@Override
	public void battery() {
		System.out.println("The battery is very bad");
	}
}

//Redmi3.java
package abstraction;

public class Redmi3 extends Redmi2{
	@Override
	public void smartcamera() {
		System.out.println("Smart Camera is very smart");
	}
	
	public static void main(String args[]) {
		System.out.println("Redmi 3");
		Redmi3 rd3 = new Redmi3();
		rd3.battery();
		rd3.camera();
		rd3.smartcamera();
		System.out.println("Redmi 2");
		Redmi2 rd2 = new Redmi3(); //UC
		rd2.battery();
		rd2.camera();
		rd2.smartcamera();
		System.out.println("Redmi 1");
		Redmi1 rd1= new Redmi3(); //UC
		rd1.battery();
		rd1.camera();
//		rd1.smartcamera(); wrong
		System.out.println("Mobile");
		Mobile m= new Redmi3(); //UC
		m.battery();
		m.camera();
//		m.smartcamera(); wrong
		
	}
}
