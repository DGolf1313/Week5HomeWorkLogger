
public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		String spacedString = "";
		for (int i = 0 ; i < log.length(); i++) {
			spacedString += log.charAt(i)+ " ";
		}
		System.out.println("*********************");
		System.out.println("***" + spacedString + "***");
		System.out.println("*********************");
	}

	@Override
	public void error(String error) {
		String spacedString = "";
		for (int i = 0 ; i < error.length(); i++) {
			spacedString += error.charAt(i)+ " ";
		}
		System.out.println("*********************");
		System.out.println("***Error: " + spacedString + "***");
		System.out.println("*********************");
	}
}
