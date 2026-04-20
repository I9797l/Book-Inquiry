Book Inquiry System

This is a simple Java project that simulates how a library system can search for books using different data structures.

What this project is about
The goal of this project is to store a list of books and check whether a specific book exists or not. The focus is on comparing different ways of searching and how each approach affects performance.

Problem Description
The system is designed to:

Store book names
Search for a specific book
Return whether the book exists in the collection or not

Solution 1: ArrayList + Linear Search
In this approach, books are stored in an ArrayList. The search is done by checking each element one by one until the target book is found or the list ends.

Simple and easy to implement
Time complexity: O(n)
Performance decreases as the number of books increases

Solution 2: HashSet Search
In this approach, books are stored in a HashSet, which allows direct lookup without iterating through all elements.

Faster search performance
Time complexity: O(1) on average
More efficient for large datasets

Project Structure

Book-Inquiry/
│
├── Solution1_LinearSearch.java
├── Solution2_HashSet.java
└── Main.java

How to run the project:
Open the project in any Java IDE
Run the Main class
View the output in the console
Team contribution

Each member was responsible for a specific part of the project:

Implementation of Linear Search solution
Implementation of HashSet solution
Main method and testing of both solutions
Conclusion

This project demonstrates how choosing different data structures can significantly affect the efficiency of search operations in a system.
