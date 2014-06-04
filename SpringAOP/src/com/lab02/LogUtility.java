package com.lab02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import org.springframework.stereotype.Component;

@Component
public class LogUtility {
	public void writeToLogFile(String fileName,String message)throws IOException{
		FileWriter fw = new FileWriter(new File(fileName),true);
		fw.write(message + "\n");
		fw.close();
	}
}
