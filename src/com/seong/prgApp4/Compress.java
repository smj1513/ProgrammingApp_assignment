package com.seong.prgApp4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Compress {
	public static void gzipFile(File src, File dest) throws IOException {
		try (FileInputStream fs = new FileInputStream(src);
		     GZIPOutputStream gos = new GZIPOutputStream(new FileOutputStream(dest))) {
			if (!src.isFile()) {
				throw new IOException("Compress: 파일이 아님" + src.getName());

			}
			byte[] buff = new byte[4096];

			int bytes_read;
			while ((bytes_read = fs.read()) != -1) {
				gos.write(buff, 0, bytes_read);
			}
			System.out.println("파일 압축성공");
		}
	}

	public static void zipDirectory(File directory, File zipFile) throws IOException {
		try (ZipOutputStream gos = new ZipOutputStream(new FileOutputStream(zipFile))) {
			byte[] buffer = new byte[4096];
			int bytes_read;
			for (File f : directory.listFiles()) {
				if (f.isDirectory()) continue; // sub-directory는 zip 하지 않음
				FileInputStream in = new FileInputStream(f);
				gos.putNextEntry(new ZipEntry(f.getPath()));    // For each file, (1) Write a zip entry
				while ((bytes_read = in.read(buffer)) != -1)    // (2) Copy the content of a file
					gos.write(buffer, 0, bytes_read);
			}
			System.out.println("디렉토리 압축성공");
		}


	}

	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.err.println("Usage: java Compress <from> <to>");
			System.exit(0);
		}

		File from = new File(args[0]);
		File to = new File(args[1]);
		if (to.exists()) {
			System.err.println("Compress: won't overwrite existing file: " + to.getName());
			System.exit(0);
		}

		if (from.isDirectory()) {
			zipDirectory(from, to);
		} else {
			gzipFile(from, to);
		}
	}
}
