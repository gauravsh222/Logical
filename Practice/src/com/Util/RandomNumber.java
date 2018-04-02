package com.Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class Z {}
public class RandomNumber {
	public static void main	(String[] args) throws IOException {
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);		
		System.out.println(l1.equals(l2));
		
		writeObjects();
		readObject();
	}

	private static void readObject() throws IOException {
		String currDir = System.getProperty("user.dir");
		Path path = Paths.get(currDir, "/Backup/", "temp" + ".txt");
		RandomAccessFile file = new RandomAccessFile(path.toString(), "r");
		byte readByte = file.readByte();
	}

	private static void writeObjects() {
		String currDir = System.getProperty("user.dir");
		Path path = Paths.get(currDir, "/Backup/", "temp" + ".txt");
		if (! Files.exists(path)) {
			File file = new File(path.toString());
			file.getParentFile().mkdirs();
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try (FileOutputStream fOut = new FileOutputStream(path.toString()); ObjectOutputStream oOut = new ObjectOutputStream(fOut);){
			List<String> l2 = new ArrayList<String>();
			l2.add("Name");
			l2.add("Id");
			l2.add("Salary");			
			for (String vnfval : l2) {
				oOut.writeObject(vnfval);
			}
		} catch (IOException e) {
			System.err.println(e.getStackTrace()+ e.toString());
		}
	}
}
