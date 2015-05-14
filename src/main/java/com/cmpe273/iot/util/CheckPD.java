package com.cmpe273.iot.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Get the list of files from the pd and checks the pd
 * and return true if the pd is attached
 * @author Kandarp
 *
 */
public class CheckPD {
    
    public static  List<File> files = new ArrayList<File>();
    
    public static void main(String[] args) 
    {   
        File[] units = File.listRoots();

        for(File unit:units)
        {
            System.out.println(unit.getAbsolutePath());
            listf( unit.getAbsolutePath() );
            System.out.println(" Total : " + files.size() );
            break;
        }
        //listf(".");
        //System.out.println(" Total : " + files.size() );
    }
    
    public static void listf(String directoryName) {
	    File directory = new File(directoryName);

	    // get all the files from a directory
	    File[] fList = directory.listFiles();
	    for (File file : fList) {
	        if (file.isFile()) {
	            files.add(file);
	        } else if (file.isDirectory()) {
	            listf(file.getAbsolutePath());
	        }
	    }
	}
    

}
