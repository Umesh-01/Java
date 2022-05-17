package extra;

class Author {

private String name;
private String email;
private char gender;

public Author(String name, String email, char gender) {

super();

this.name = name;
this.email = email;
this.gender = gender;

}

public String getName() {

return name;

}

public String getEmail() {

return email;

}

public char getGender() {

return gender;

}

public String toString() {

return "Author Details: (Name -> " + name + ", Email -> " + email + ", Gender -> " + gender + ")";

}

}

class Book {

private String name;
private Author author;
private double price;
private int qtyInStock;

public Book(String name, Author author, double price, int qtyInStock) {

super();

this.name = name;

this.author = author;

this.price = price;

this.qtyInStock = qtyInStock;

}

public double getPrice() {

return price;

}

public void setPrice(double price) {

this.price = price;

}

public int getQtyInStock() {

return qtyInStock;

}

public void setQtyInStock(int qtyInStock) {

this.qtyInStock = qtyInStock;

}

public String getName() {

return name;

}

public Author getAuthor() {

return author;

}

public String toString() {

return "Book Details: \nName => " + name + ", Author => " + author + ", Price => " + price + ", Quantity in Stock => " + qtyInStock;

}

}

public class AuthorBook {

public static void main(String[] args) {

Author author = new Author("Umesh Singh", "20BCS8013@cuchd.in", 'M');

Book book = new Book("Project Based Learning in Java", author, 249.0, 121);

System.out.println(book);

}



}
