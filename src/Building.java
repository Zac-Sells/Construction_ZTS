/**
 * This class represents a building 
 * @author sells
 *
 */
public class Building {
/**
 * Initiates variables
 */
	protected String projectName;
	protected String completeAddress;
	protected String occupancyGroup;
	protected String subGroup;
	protected Double totalSquareFeet;
 /**
  * empty constructor 	
  */
	public Building()
	{
		this.projectName = "";
		this.completeAddress = "";
		this.occupancyGroup = "";
		this.subGroup = "";
		this.totalSquareFeet = 0.0;
	}
/**
 * preferred constructor 	
 * @param projectName
 * @param completeAddress
 * @param totalSqaureFeet
 * @param occupancyGroup
 * @param subGroup
 */
	public Building(String projectName, String completeAddress, Double totalSqaureFeet, String occupancyGroup, String subGroup)
	{
		setProjectName (projectName);
		setCompleteAddress (completeAddress);
		setOccupancyGroup (occupancyGroup);
		setSubGroup (subGroup);
		setTotalSquareFeet (totalSqaureFeet);
	}
/**
 * prints statement to represent drawing code	
 */
	public void draw()
	{
	System.out.println("Drawing code for <<Building>>");
	}
/**
 * 	
 * @return the toString()
 */
	public String displayData()
	{
		return toString();
	}
/**
 * 
 * @return the name of the project 
 */
	public String getProjectName() {
		return projectName;
	}
/**
 * 
 * @param projectName
 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
/**
 * 
 * @return the address 
 */
	public String getCompleteAddress() {
		return completeAddress;
	}
/**
 * 
 * @param completeAddress
 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}
/**
 * 
 * @return the occupancy group 
 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}
/**
 * 
 * @param occupancyGroup
 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}
/**
 * 
 * @return the subgroup
 */
	public String getSubGroup() {
		return subGroup;
	}
/**
 * 
 * @param subGroup
 */
	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}
/**
 * 
 * @return the total amount of square feet 
 */
	public Double getTotalSquareFeet() {
		return totalSquareFeet;
	}
/**
 * 
 * @param totalSquareFeet
 */
	public void setTotalSquareFeet(Double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	@Override
	public String toString() {
		return "Project Name: " + getProjectName() 
				+ "\n\nAddress: " + getCompleteAddress() 
				+ "\n\nSquare Feet: " + getTotalSquareFeet()       
				+ "\n\nOccupany Group: " +getOccupancyGroup()
				+ "\n\nOccupancy Subgroup: " + getSubGroup()
				+ "\n";
	}
	
	
	
	
}
