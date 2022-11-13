
package com.jep.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class creates the unique name on run time on the basis of system's current date and time.
 * 
 */
public class CreateUniqueNameOnRunTime {
	
	/**
	 * This Function creates a Unique name based on Current Date/Time
	 * @return String Unique Name
	 */
	public static String createUniqueName()
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MMdd_HHmmss");
		String formattedDate = sdf.format(date);
		return formattedDate;
	}
} // End Class CreateUniqueNameOnRunTime
