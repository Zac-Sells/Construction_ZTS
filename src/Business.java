/**
 * This class represents a business 
 * @author sells
 *
 */
public class Business extends Building {
/**
 * initiates variables 
 */
	protected int numRentableUnits;
/**
 * empty constructor 	
 */
	public Business()
	{
		super();
		this.numRentableUnits = 0;
	}
/**
 * preferred constructor 	
 * @param projectName
 * @param completeAddress
 * @param totalSqaureFeet
 * @param occupancyGroup
 * @param subGroup
 * @param numRentableUnits
 */
	public Business(String projectName, String completeAddress, double totalSqaureFeet, String occupancyGroup, String subGroup, int numRentableUnits)
	{
		super(projectName, completeAddress, totalSqaureFeet, occupancyGroup, subGroup);
		setNumRentableUnits (numRentableUnits);
	}
/**
 * prints statement to represent drawing code	
 */
	public void draw()
	{
		System.out.println("Drawing code for <<Business>>");
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
 * @return the number of rentable units
 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
/**
 * 
 * @param numRentableUnits
 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	@Override
	public String toString() {
		return "Project Name: " + getProjectName() + "\n"+"\n"
				+ "Address: " + getCompleteAddress() + "\n\nSquare Feet: " + getTotalSquareFeet()       
				+ "\n\nOccupany Group: " +getOccupancyGroup()
				+ "\n\nOccupancy Subgroup: " + getSubGroup() + "\n\nNumber Rentalable Units: " + getNumRentableUnits()
				+ "\n";
	}
	

}
