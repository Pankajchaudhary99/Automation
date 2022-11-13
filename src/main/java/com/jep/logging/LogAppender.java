

package com.jep.logging;
import org.apache.log4j.RollingFileAppender;

public class LogAppender extends RollingFileAppender  {
	boolean repeatCalling=false;
	
	/***
	 * It will create the logs and append the logs which are created as per the current time stamp. 
	 */
    @Override
    public void  setFile(String fileName) {
    	String replaceTarget="%dateTime";
    	String createFolder="folder";
    	String dynamicName="";
    	String dynamicDateTimeMyAppender="";
        if (fileName.indexOf(replaceTarget) >= 0) {
        	dynamicDateTimeMyAppender=CreateUniqueNameOnRunTime.createUniqueName();
        	dynamicName=dynamicDateTimeMyAppender;
        	fileName = fileName.replaceAll(replaceTarget, dynamicName);
        	String folderName=dynamicName.substring(0, dynamicName.lastIndexOf("_"));
        	fileName= fileName.replaceAll(createFolder, folderName);
        	
        }
        super.setFile(fileName);
    	}
    }
