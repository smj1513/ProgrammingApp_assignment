package com.seong.prgApp3;

import java.io.*;

public class ch06 {
	public static void main(String[] args) throws IOException{
		try (FileInputStream in = new FileInputStream(new File(args[0]));
		     FileOutputStream out = new FileOutputStream(new File(args[1]))) {
			int c;
			while ((c = in.read()) != -1)
				out.write(c);
		}
	}
}
