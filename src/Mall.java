/**
 * This class represents a Mall
 * @author sells
 *
 */
public class Mall extends Business{
/**
 * initiates variables
 */
	private int numRentedUnits;
	private int numParkingSpaces;
	private double medianUnitSize;
/** 
 * empty constructor 	
 */
	public Mall()
	{
		super();
		this.numRentedUnits = 0;
		this.numParkingSpaces = 0;
		this.medianUnitSize = 0;	
	}
/**
 * preferred constructor 	
 * @param projectName
 * @param completeAddress
 * @param totalSqaureFeet
 * @param occupancyGroup
 * @param subGroup
 * @param numRentableUnits
 * @param numRentedUnits
 * @param numParkingSpaces
 * @param medianUnitSize
 */
	public Mall(String projectName, String completeAddress, double totalSqaureFeet, String occupancyGroup, String subGroup, int numRentableUnits, int numRentedUnits, int numParkingSpaces, double medianUnitSize)
	{
		super(projectName, completeAddress, totalSqaureFeet, occupancyGroup, subGroup, numRentableUnits);
		setNumRentedUnits (numRentedUnits);
		setNumParkingSpaces (numParkingSpaces);
		setMedianUnitSize (medianUnitSize);
	}
/**
 * prints statement to represent drawing code
 */
	public void draw()
	{
		System.out.println("Drawing code for <<Mall>>");
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
 * @return number of rented units
 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}
/**
 * 
 * @param numRentedUnits
 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}
/**
 * 
 * @return the number of parking spaces
 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}
/**
 * 
 * @param numParkingSpaces
 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
/**
 * 
 * @return average unit size
 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}
/**
 * 
 * @param medianUnitSize
 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public String toString() {
		return "Project Name: " + getProjectName() 
				+ "\n\nAddress: " + getCompleteAddress() 
				+ "\n\nSquare Feet: " + getTotalSquareFeet()       
				+ "\n\nOccupany Group: " +getOccupancyGroup()
				+ "\n\nOccupancy Subgroup: " + getSubGroup() 
				+ "\n\nNumber Rentalable Units: " + getNumRentableUnits()
				+ "\n\nNumber of Rented Units: " + getNumRentedUnits()
				+ "\n\nNumber of Parking Spots : " + getNumParkingSpaces()
				+ "\n\nMedian Unit Size: " + getMedianUnitSize()
				+ "\n";
	}
	
	
	
	
	
	
}
