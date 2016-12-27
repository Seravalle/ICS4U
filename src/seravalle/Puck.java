package seravalle;

/**
 * 	This class makes a new puck
 * 	@author Adam Seravalle
 *	December 15th, 2016
 *	Puck.java
 */
public class Puck extends Disk{
	private double weight;
	private boolean standard;
	private boolean youth;
	
	/**
	 * Constructor for a puck
	 * 
	 * @param radius
	 * 			
	 * @param thick
	 * 			
	 * @param weight
	 * 			
	 */
	public Puck(double radius, double thick, double weight) {
		super(radius, thick);
		this.weight = weight;
		determineType(weight);
	}

	/**
	 * Determines if the puck is a youth or standard puck weight
	 * 
	 * @param w
	 * 			
	 */
	private void determineType(double weight) {
		if ((weight >= 4 && weight <= 4.5) && ifOffical()){
			this.youth = true;
		}
		else if ((weight >= 5 && weight <= 5.5) && ifOffical()){
			this.standard = true;
		}
	}
	
	/**
	 * Determines if the puck is of offical size
	 * 
	 * @return
	 * 			
	 */
	private boolean ifOffical(){
		return (super.getRadius() == 3 && super.getThickness() == 1);
	}
	
	/**
	 * Get the weight of the puck
	 * 
	 * @return
	 * 			
	 */
	public double getWeight(){
		return this.weight;
	}
	
	/**
	 * get the division 
	 * @return
	 */
	public String getDivision(){
		if (standard){
			return "Standard";
		}
		else if (youth){
			return "Youth";
		}
		else{
			return "Not Offical";
		}
	}
	
	/**
	 * if the first puck equals the second
	 * 
	 * @param p
	 *          
	 * @return 
	 * 		
	 */
	public boolean equals(Puck p){
		return (p.getRadius() == super.getRadius() && p.getThickness() == getThickness() && p.getWeight() == getWeight());
	}
	
	/**
	 * strings all the information for the puck
	 * @return 
	 */
	public String toString(){
		return "The puck radius is "  + super.getRadius() + ", the puck thickness is " + getThickness() + " and the puck weight is " + getWeight();
	}
}