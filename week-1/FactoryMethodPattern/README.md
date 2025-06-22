# Factory Method Pattern Example - Document Management System

This Java project demonstrates the **Factory Method Design Pattern** by simulating a document management system that can create different types of documents like Word, PDF, and Excel.

## 🧠 Design Pattern Used
**Factory Method Pattern** – This pattern provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

---

## 📂 Project Structure

FactoryMethodPatternExample/
│
├── Document.java # Interface for all document types
├── WordDocument.java # Word document implementation
├── PdfDocument.java # PDF document implementation
├── ExcelDocument.java # Excel document implementation
│
├── DocumentFactory.java # Abstract factory class
├── WordDocumentFactory.java # Factory to create Word documents
├── PdfDocumentFactory.java # Factory to create PDF documents
├── ExcelDocumentFactory.java # Factory to create Excel documents
│
└── Main.java # Test class demonstrating the pattern

yaml
Copy
Edit

---
## 🧪 How It Works

1. **Document Interface**: Common interface for all document types.
2. **Concrete Documents**: Implementations like WordDocument, PdfDocument, and ExcelDocument.
3. **DocumentFactory**: Abstract class with method `createDocument()`.
4. **Concrete Factories**: Each concrete factory overrides `createDocument()` to return a specific type.
5. **Main Class**: Tests the factories to open different types of documents.

---
## 🚀 How to Run

1. Clone or download this project.
2. Open in any Java IDE like Eclipse or IntelliJ IDEA.
3. Run the `Main.java` class.

---

## 🛠️ Author

Created by **Madhan Sundhar S.**

---

