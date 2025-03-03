This project is a Java-based book sorting application for North Seattle College Library. It allows users to sort books in different ways using the Comparator interface. The sorting options include:

By Title (default sorting using Comparable)

By Author

By Year of Publication (newest first)

By Author, then Title

Features

Implements Comparable for default title sorting.

Uses Comparator for author, year, and combined author-title sorting.

Demonstrates sorting using a sample book list.

Outputs sorted books in a readable format.

Folder Structure

BookSorter/
│── src/
│   ├── Book.java
│   ├── BookSorter.java
│   ├── AuthorComparator.java
│   ├── YearComparator.java
│   ├── AuthorTitleComparator.java
│── README.md
│── .gitignore

Installation and Usage

Prerequisites

Ensure you have Java installed. You can check by running:

java -version

If Java is not installed, download and install it from Adoptium.

Clone the Repository

git clone https://github.com/luwamhabtu07/book-sorter.git
cd book-sorter

Compile and Run

javac src/*.java
java -cp src BookSorter

Expected Output Example

Original list:
Title: The Catcher in the Rye, Author: J.D. Salinger, Year: 1951
Title: To Kill a Mockingbird, Author: Harper Lee, Year: 1960
Title: 1984, Author: George Orwell, Year: 1949
...

Sorted by title:
Title: 1984, Author: George Orwell, Year: 1949
Title: Brave New World, Author: Aldous Huxley, Year: 1932
...

Testing

This program is tested with:

3 Normal Cases: Books sorted correctly by title, author, and year.

3 Edge Cases:

Books with the same title but different authors.

Books with the same year but different titles.

Books with mixed uppercase/lowercase letters in sorting.

Extra Credit (Optional)

For extra credit, a GUI can be implemented using JavaFX or Swing.

Submission Requirements

GitHub Repository: Ensure your project is public.

Video Demonstration: Show sorting functionality and test cases.

Submit Links: Include GitHub repo and YouTube video links in the submission.

License

This project is for educational purposes and is not licensed for commercial use.

