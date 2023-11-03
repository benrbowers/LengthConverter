public class LengthConverter {
	public static double footToMeter(double foot) {
		return foot * 0.3048;
	}

	public static double meterToFoot(double meter) {
		return meter * 3.28084;
	}

	public static void main(String[] args) {
		// Test the methods

		double mile = 5280; // Mile in feet
		double kilometer = 1000; // Kilometer in meters

		// Should be 1609.344 meters in a mile
		System.out.println("Meters in a mile: " + footToMeter(mile));

		// Should be 3280.84 feet in a kilometer
		System.out.println("Feet in a kilometer: " + meterToFoot(kilometer));
	}
}