package seravalle;
/**
 * Makes a disk
 * @author Adam Seravalle
 * Disk.java
 * December 14 2016
 */

public class Disk extends Circle {
	private double thickness;

	/**
	 * Makes a new disk
	 * @param r
	 * @param t
	 */
	public Disk(double r, double t) {
		super(r);
		thickness = r;
	}
/**
 * set the thickness 
 * @param newThickness
 */
	public void setThickness(double newThickness) {
		thickness = newThickness;

	}
/**
 * get thickness
 * @return
 */
	public double getThickness() {
		return (thickness);
	}
/**
 * calculate volume
 * @return
 */
	public double volume() {
		double v;

		v = super.area() * thickness;
		return (v);
	}
/**
 * checks if the first disk is equal to the second 
 * 
 * @param d
 * 
 * @return
 * 
 */
	public boolean equals(Object d) {
		Disk testObj = (Disk) d;
		if (testObj.getRadius() == super.getRadius() && testObj.getThickness() == thickness) {
			return (true);
		} else {
			return (false);
		}
	}
/**
 * 
 */
	public String toString() {
		String diskString;
		diskString = "The disk has radius " + super.getRadius() + " and thickness " + thickness + ".";
		return (diskString);
	}

}
