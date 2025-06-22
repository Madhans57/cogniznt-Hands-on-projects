# 📦 Inventory Management System

A simple Java-based Inventory Management System for managing warehouse products. It allows you to add, update, delete, and view products efficiently using appropriate data structures.

## 🛠️ Features

- Add new products to the inventory
- Update existing product details
- Delete products by product ID
- Display the complete inventory

## 🧱 Data Structure Used

- **HashMap**: 
  - Used to store `Product` objects with `productId` as the key.
  - Ensures **O(1)** time complexity for add, update, and delete operations (on average).

## 🧾 Product Structure

Each product has:
- `productId`: Unique identifier
- `productName`: Name of the product
- `quantity`: Available stock
- `price`: Price of the product

## 📁 File Structure

InventoryManagementSystem/
└── Inventory.java

## 🚀 How to Run

1. Open the project in any Java IDE (like Eclipse, IntelliJ, or VS Code).
2. Compile and run `Inventory.java`.
3. The `main` method demonstrates all functionalities.

## 📊 Time Complexity Analysis

| Operation     | Time Complexity |
|---------------|-----------------|
| Add Product   | O(1) average     |
| Update Product| O(1) average     |
| Delete Product| O(1) average     |
| Display All   | O(n)             |
