package com.user;

public class User {
	private static User userInstanceSingleton;
	private String filePath,fileName,fileDir;

	private User() {}
	
	public static User getInstance() {
		if(userInstanceSingleton == null) {
			synchronized (User.class) {
				userInstanceSingleton = new User();
			}
		}
		return userInstanceSingleton;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileDir() {
		return fileDir;
	}

	public void setFileDir(String fileDir) {
		this.fileDir = fileDir;
	}
	
}
