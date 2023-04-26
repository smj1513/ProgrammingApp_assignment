package com.seong.prgApp4;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

public class Dir {
	public static void main(String[] args) throws IOException {
		if (args.length < 1) {
			System.out.println("Usage: Dir [no option | -l | -r] [filename]");
			return;
		}
		File file;
		String selection;
		if(args.length==1){
			selection = "def";
			file=new File(args[0]);
		}
		else{
			selection=args[0];
			file=new File(args[1]);
		}
		selection=selection.toLowerCase();
		File[] fileList = file.listFiles();
		switch (selection){
			case "def"->{
				for (File files : fileList) {
					System.out.println(files.getAbsolutePath());
				}
			}
			case "-l"->{
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
				for (File files : fileList){
					String fileName = files.getName();
					String lastModified = sdf.format(files.lastModified());
					String fileType = files.isDirectory() ? "dir" : "file";
					String size = files.length()+"KB";
					System.out.printf("%s \t\t\t %s %s %s\n", fileName,lastModified, fileType, size);
				}
			}
			case "-r"->{
				File absPath = file.getCanonicalFile();
				System.out.println(absPath);
				recursiveDir(absPath);
			}
			default -> {

			}
		}
	}
	public static void recursiveDir(File dir){
		File[] files =dir.listFiles();
		for(File file: files){
			if(file.isDirectory()){
				System.out.println(file);
				recursiveDir(file);
			}
			else{ //파일일경우 재귀 종료
				System.out.println(file);
			}
		}

	}
}
