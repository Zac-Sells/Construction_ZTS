/**
 * This class represents a Single Family Home
 * @author sells
 *
 */
public class SingleFamilyHome extends Residential{
/**
 * initiates variables
 */
	private boolean garage;
/**
 * empty constructor	
 */
	public SingleFamilyHome() {
		super ();
		this.garage = false;
	}
/**
 * preferred constructor	
 * @param projectName
 * @param completeAddress
 * @param totalSqaureFeet
 * @param occupancyGroup
 * @param subGroup
 * @param numBedrooms
 * @param numBathrooms
 * @param laundryroom
 * @param garage
 */
	public SingleFamilyHome(String projectName, String completeAddress, Double totalSqaureFeet, String occupancyGroup, String subGroup, int numBedrooms, int numBathrooms, boolean laundryroom, boolean garage) 
	{
		super(projectName, completeAddress, totalSqaureFeet, occupancyGroup, subGroup, numBedrooms, numBathrooms, laundryroom);
		setGarage (garage);
	}
/**
 * prints statement to represent drawing code	
 */
	public void draw()
	{
		System.out.println("Drawing code for <<SingleFamilyHome>>");
	}
/**
 * 	@return the toString()
 */
	public String displayData()
	{
		return toString();
	}
/**
 * 
 * @return a true or false if a home has a garage
 */
	public boolean isGarage() {
		return garage;
	}
/**
 * 
 * @param garage
 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
	public String toString() {
		return "Project Name: " + getProjectName() 
				+ "\n\nAddress: " + getCompleteAddress() 
				+ "\n\nSquare Feet: " + getTotalSquareFeet()       
				+ "\n\nOccupany Group: " +getOccupancyGroup()
				+ "\n\nOccupancy Subgroup: " + getSubGroup()
				+ "\n\nNumber of Bedrooms: " + getNumBedrooms()
				+ "\n\nNumber of Bathrooms: " + getNumBathrooms()
				+ "\n\nLaundry Room " + isLaundryroom() 
				+ "\n\nGarage: " +isGarage()
				+ "\n";
	}
	
}
