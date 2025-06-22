# Singleton Pattern Example - Logger Utility

This Java project demonstrates the **Singleton Design Pattern** by implementing a logging utility class that ensures only one instance is used throughout the application lifecycle.

## 🔁 Design Pattern Used
**Singleton Pattern** – Ensures that a class has only one instance and provides a global point of access to it.

---

## 📂 Project Structure

SingletonPatternExample/
│
├── Logger.java # Singleton class
└── Main.java # Test class to verify singleton behavior


---

## 🧪 How It Works

1. `Logger` class has:
   - A private static instance of itself.
   - A private constructor to prevent direct instantiation.
   - A public static method `getInstance()` for instance access.

2. In the `Main` class:
   - Two logger objects are fetched using `Logger.getInstance()`.
   - A comparison confirms both refer to the same instance.

---

## 🚀 How to Run

1. Clone or download the project.
2. Open it in your favorite Java IDE (like Eclipse or IntelliJ).
3. Run `Main.java`.

