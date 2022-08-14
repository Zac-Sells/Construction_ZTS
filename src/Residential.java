/**
 * This class represents a Residential building
 * @author sells
 *
 */
public class Residential extends Building {
/**
 * initiates variables
 */
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryroom;
/**
 * empty constructor 	
 */
	public Residential()
	{
		super();
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryroom = false;
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
 */
	public Residential(String projectName, String completeAddress, Double totalSqaureFeet, String occupancyGroup, String subGroup, int numBedrooms, int numBathrooms, boolean laundryroom)
	{
		super (projectName, completeAddress, totalSqaureFeet, occupancyGroup, subGroup);
		setNumBedrooms (numBedrooms);
		setNumBathrooms (numBathrooms);
		setLaundryroom (laundryroom);
	}
/**
 * 	prints statement to represent drawing code
 */
	public void draw()
	{
		System.out.println("Drawing code for <<Residential>>");
	}
/**
 * @return the toString()	
 */
	public String displayData()
	{
		return toString();
	}
/**
 * 
 * @return number of bedrooms
 */
	public int getNumBedrooms() {
		return numBedrooms;
	}
/**
 * 
 * @param numBedrooms
 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}
/**
 * 
 * @return number of bathrooms
 */
	public int getNumBathrooms() {
		return numBathrooms;
	}
/**
 * 
 * @param numBathrooms
 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}
/**
 * 
 * @return a true or false if a unit has a laundry room
 */
	public boolean isLaundryroom() {
		return laundryroom;
	}
/**
 * 
 * @param laundryroom
 */
		
	public void setLaundryroom(boolean laundryroom) {
		this.laundryroom = laundryroom;
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
				+ "\n";
	}
}	
