package com.seong.prgApp4;

import java.io.File;
import java.io.IOException;

public class Delete {
	public static void main(String[] args) throws IOException {
		if (args.length < 1) {
			System.out.println("Delete file_or_directory");
			return;
		}
		File file = new File(args[0]);

		boolean exists = file.exists(); //존재하는가?
		boolean canWrite = file.canWrite(); //쓰기가능한가?
		boolean isDirectory = file.isDirectory();//폴더인가?
		boolean directoryIsEmpty = true;
		if (!exists) {
			if(file.createNewFile()){
				System.out.println("File create success");
			}
		}
		if(file.setReadOnly()){
			System.out.println("File set Read only success");
		}
		if (!canWrite) {
			if(file.setWritable(true)){
				System.out.println("File set Writeable success");
			}
		}
		if (isDirectory) {//폴더라면
			File[] files = file.listFiles();
			directoryIsEmpty = files.length == 0;
			if(directoryIsEmpty){ //비어있는가?
				System.out.println("Folder is Empty");
			}else{
				System.out.println("Folder is not Empty. Process faild");
				System.exit(0);
			}
		}
		if(file.delete()){
			System.out.println("File delete success");
		}

	}
}
