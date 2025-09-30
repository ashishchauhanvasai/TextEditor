package TextEditor.Controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TextEditorController {

	public LinkedList<String> textList = new LinkedList<>();
	public ArrayList<String> dictonary = new ArrayList<>();
	public Scanner sc = new Scanner(System.in);
	int position = -1;

	public void save() {
		System.out.println("Enter the Text : ");
		String str = sc.nextLine();
		while (position < textList.size() - 1) {
			textList.removeLast();
		}
		System.out.println("Have AutoSuggest Press Y ");
		String str1 = sc.next();
		if (str1.equalsIgnoreCase("Y")) {
			textList.add(AutoSuggest(str));
			// System.out.println(textList);
		} else {
			textList.add(str);
			// System.out.println(textList);
		}
		position++;
	}

	public void undo() {
		if (position > -1) {
			position--;
		}
	}

	public void redo() {
		if (position < textList.size() - 1) {
			position++;
		}
	}

	public void display() {
		for (int i = 0; i <= position; i++) {
			System.out.print(textList.get(i) + " ");
		}
	}

	public void addWordToDictionary() {
		System.out.println("Enter exit to quit");
		System.out.println("Enter the word to add Dictonary");
		String str = "";
		while (true) {
			str = sc.nextLine();
			if (str.equalsIgnoreCase("exit")) {
				break;
			}
			dictonary.add(str);
			System.out.println(dictonary.size() + " words Sucessfully added.............");
		}
	}

	public String AutoSuggest(String str) {

		int i = 0;
		System.out.println("Select the word : ");
		for (String word : dictonary) {
			i++;
			if (word.startsWith(str)) {
				System.out.println(i + ". " + word);
			}
		}
		int c = sc.nextInt();
		return dictonary.get(--c);
	}

}
