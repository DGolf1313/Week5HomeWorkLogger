
public class App {

	public static void main(String[] args) {
		AsteriskLogger testAsteriskLogger = new AsteriskLogger();
		SpacedLogger testSpacedLogger = new SpacedLogger();
		
		testAsteriskLogger.log("GoodBye");
		
		System.out.println();
		
		testAsteriskLogger.error("GoodBye!!!");
		
		System.out.println();
		System.out.println();
		
		testSpacedLogger.log("GoodBye");
		
		System.out.println();
		
		testSpacedLogger.error("GoodBye!!!");
		
	}

}
