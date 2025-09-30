# 📝 TextEditor (Java)

A simple **Text Editor** built in Java following the **MVC (Model-View-Controller)** pattern.  
It supports text saving, undo/redo functionality, dictionary-based auto-suggestions, and text display.  

---

## 🚀 Features
- **Save text** with optional auto-suggestion from a dictionary
- **Undo/Redo** functionality for navigating through text history
- **Display** the entered text
- **Dictionary support** for auto-suggesting words
- **Simple CLI menu interface**

---

## 🗂 Project Structure
TextEditor/
│── src/
│ ├── TextEditor.Controller/
│ │ └── TextEditorController.java # Handles all text operations
│ │
│ └── TextEditor.view/
│ └── TextEditorView.java # Main class with CLI menu

---

## 🛠️ Technologies Used
- Java SE 21
- LinkedList & ArrayList (for text history and dictionary)
- Scanner (for CLI input)
- Object-Oriented Programming (OOP)
- MVC Design Pattern

---

## ▶️ How to Run
1. Clone this repository:

git clone https://github.com/your-username/TextEditor.git
Open the project in your IDE (Eclipse, IntelliJ IDEA, or VS Code).
Navigate to:
src/TextEditor/view/TextEditorView.java
Run the main() method.
Use the menu to interact with the editor:
1. Save
2. Undo
3. Redo
4. Display
5. Add Words to Dictionary
6. Exit
📖 Example Usage
Add Words to Dictionary
Enter exit to quit
Enter the word to add Dictionary
java
1 words Sucessfully added.............
oop
2 words Sucessfully added.............
exit
Save Text with AutoSuggest
Enter the Text : ja
Have AutoSuggest Press Y
Y
Select the word :
1. java
2. javascript
Enter choice: 1
Undo & Redo
> Undo → removes last saved word
> Redo → restores undone word
Display Text
java oop


🤝 Contributing
Contributions are welcome! To contribute:
Fork the repository
Create a new branch (feature-xyz)
Commit your changes
Open a Pull Request


📜 License
This project is licensed under the MIT License – feel free to use and modify it.


👨‍💻 Author: Ashish Chauhan
📌 A simple educational project for learning Java OOPs, Collections, and MVC.
