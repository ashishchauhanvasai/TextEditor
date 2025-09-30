package TextEditor.view;

import TextEditor.Controller.TextEditorController;

public class TextEditorView {

	public static void main(String[] args) {

		TextEditorController tec = new TextEditorController();
		System.out.println("=============Welcome to TextExitor=============");

		while (true) {
			System.out.println("\n1. Save");
			System.out.println("2. Undo");
			System.out.println("3. Redo");
			System.out.println("4. Display");
			System.out.println("5. Add Words To Dictonary");
			System.out.println("6. Exit");
			System.out.println("Enter your choice : ");

			int choice = tec.sc.nextInt();
			tec.sc.nextLine();

			switch (choice) {
			case 1:
				tec.save();
				break;

			case 2:
				tec.undo();
				break;

			case 3:
				tec.redo();
				break;

			case 4:
				tec.display();
				break;


			case 5:
				tec.addWordToDictionary();
				break;

			case 6:
				System.out.println("Program Stopped Succesfully");
				System.out.println("Thank you for using this TextEditor...............");
				return;

			default:
				System.out.println("Invalid Input Please Try Again..............");
			}

		}

	}

}
