import java.util.Date; // import package that has combo of classes and interfaces before our class definition. This will use "Date" class
public class ImportDemo { // our class contains only info belonging to the class itself
	public String getCurrentDate(){ 
		Date date = new Date(); // initialize a new date. No main method right now.
		return "Current date is " + date; 
	}
}

// seperate class info from test running info. This ImportDemo file is a class so we can use it inside our ImportDemoTest file