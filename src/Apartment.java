/**
 * This class represents an apartment 
 * @author sells
 *
 */
public class Apartment extends Residential {

/**
 * 	Initiate variables 
 */
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
/**
 * 	empty constructor 
 */
	public Apartment ()
	{
		super();
		this.numRentableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvailable = false;
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
 * @param numRentableUnits
 * @param avgUnitSize
 * @param parkingAvailable
 */
	public Apartment (String projectName, String completeAddress, Double totalSqaureFeet, String occupancyGroup, String subGroup, int numBedrooms, int numBathrooms, boolean laundryroom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable)
	{
		super(projectName, completeAddress, totalSqaureFeet, occupancyGroup, subGroup, numBedrooms, numBathrooms, laundryroom);
		setNumRentableUnits (numRentableUnits);
		setAvgUnitSize (avgUnitSize);
		setParkingAvailable (parkingAvailable);
	}
/**
 * 	prints statement to represent drawing code
 */
	public void draw()
	{
		System.out.println("Drawing code for <<Apartment>>");
	}
/**
 * 	
 * @return the toString 
 */
	public String dispayData()
	{
		return toString();
	}
/**
 * 
 * @return the number of total rentable Units
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
/**
 * 
 * @return the average unit size
 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}
/**
 * 
 * @param avgUnitSize
 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}
/**
 * 
 * @return a true or false if parking is available 
 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}
/**
 * 
 * @param parkingAvailable
 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
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
				+ "\n\nNuber of Rentable Units: " + getNumRentableUnits()
				+ "\n\nAverage Unit Size: " + getAvgUnitSize()
				+ "\n\nParking Available: " + isParkingAvailable()
				+ "\n";
	}
	
}
