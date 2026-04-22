# 🎭 Theatre Management System (Java)

This project is a simple object-oriented simulation of a theatre entry system, developed as part of a university assignment at TUM.

## 📅 Submission

* **Course:** Foundations of Programming (FOP)
* **University:** Technical University of Munich (TUM)
* **Original Deadline:** November 7, 2025
* **Uploaded to GitHub:** April 2026

---

## 📌 Overview

The system models how customers enter a theatre hall with limited capacity and store their belongings in a wardrobe.

It demonstrates:

* Object-Oriented Programming (OOP)
* Class interactions
* Basic data structures (Lists, Stack behavior)
* Queue processing logic

---

## 🧩 Components

### 1. Customer

Represents a person entering the theatre.

* Stores name and carried item
* Can successfully or unsuccessfully enter the hall

### 2. Hall

Manages the theatre space.

* Has a maximum capacity
* Tracks current customers inside

### 3. Wardrobe

Acts like a stack (LIFO).

* Stores items from customers
* Allows retrieving items in reverse order

### 4. Theatre

Controls the overall process.

* Maintains a queue of customers
* Processes entry attempts
* Coordinates between Hall and Wardrobe

### 5. Main

Contains test scenarios (currently commented out).

---

## ⚙️ How It Works

1. Customers are added to a queue
2. The system processes the queue:

   * If space is available → customer enters and stores item
   * If full → customer is re-added to the queue
3. Items are stored in the wardrobe (stack behavior)
4. Customers can leave, freeing space

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/your-repo.git
   ```

2. Open in any Java IDE (e.g., IntelliJ, Eclipse)

3. Uncomment the code inside `Main.java`

4. Run the `Main` class

---

## ⚠️ Note

This project was created for educational purposes as part of a university course.
Please do not reuse or submit this code as your own work for academic assignments.

---

## 👨‍💻 Author

* Student at TUM (Information Engineering)

---
