/**
 * @author Santiago Garcia
 * @version 1.0
 * @see LobsterSizeChecker
 * @since Java 17.0.6
 * This class represents a Lobster with carapace length, as well as a worker method that determines if a trapped Lobster
 * can be kept, or needs to be released back into the ocean.
 */

public class Lobster {
	// Attributes:
	private static final double MINIMUM_CARAPACE_LENGTH = 82.5; // millimeters (mm)
	private double length;

	//Constructors:
	/*
	 * no-argument constructor, sets length to zero.
	 */
	public Lobster() {
		this(0.0);
	}
	
	/*
	 * Parameterized constructor, accepts a value for
	 * length
	 */
	public Lobster(double length) {
		this.length = length; 
	}

	//Public methods:
	/**
	 *
	 * @return a String that reports if a Lobster can be kept or needs to be released, based on the length,
	 * which must be greater than the MINIMUM_CARAPACE_LENGTH
	 */
	public String sizeReport() {
		boolean isTooSmall;
		String report;
		
		isTooSmall = length < MINIMUM_CARAPACE_LENGTH;
		return report = (isTooSmall) ? "Prohibited Size" : "Legal Size";
	}

	//Getters and setters
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}
}
