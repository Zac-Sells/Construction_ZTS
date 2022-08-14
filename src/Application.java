/**
 * 
 * @author sells
 * @version 2.0
 * 
 * This Class is is used to test the constructors and methods of each class "building, Business, Apartment, Mall, Residential, SingleFamily, Home"
 * The application class is should test each class's constructor, displaydata(), and draw().
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Building Bul1 = new Building("Gaines House", "123 Main Street | Louisville, Kentucky 40201", 2450.0, "Residential", "R1");
		System.out.println(Bul1.displayData());
		Bul1.draw();
		System.out.println("==============================================" + "\n");
		
		Business Biz1 = new Business("Gaines House", "123 Main Street | Louisville, Kentucky 40201", 2450.0, "Busiess", "B", 20);
		System.out.println(Biz1.displayData());
		Biz1.draw();
		System.out.println("==============================================" + "\n");	
		
		Residential Res1 = new Residential ("Gaines House", "123 Main Street | Louisville, Kentucky 40201", 2450.0, "Residential", " R-1, R-2, R-3, & R-4", 4, 3, true );
		System.out.println(Res1.displayData());
		Res1.draw();
		System.out.println("==============================================" + "\n");
		
		SingleFamilyHome SFH1 = new SingleFamilyHome ("Gaines House", "123 Main Street | Louisville, Kentucky 40201", 2450.0, "Residential", " R-1, R-2, R-3, & R-4", 4, 3, true, true);
		System.out.println(SFH1.displayData());
		SFH1.draw();
		System.out.println("==============================================" + "\n");
		
		Apartment Apt1 = new Apartment ("Gaines House", "123 Main Street | Louisville, Kentucky 40201", 2450.0, "Residential", " R-1, R-2, R-3, & R-4", 4, 3, true, 25, 1500, true);
		System.out.println(Apt1.displayData());
		Apt1.draw();
		System.out.println("==============================================" + "\n");
		
		Mall Mall1 = new Mall ("Gaines House", "123 Main Street | Louisville, Kentucky 40201", 2450.0, "Mercantile", "M", 25, 20, 35, 500.0 );
		System.out.println(Mall1.displayData());
		Mall1.draw();
		System.out.println("==============================================" + "\n");
		
 }
}

