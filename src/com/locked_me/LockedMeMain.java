package com.locked_me;

public class LockedMeMain {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");

		MenuItems.printWelcomeScreen("LockedMe", "Nunna Likhitha");

		HandleOptions.handleWelcomeScreenInput();
	}
}

