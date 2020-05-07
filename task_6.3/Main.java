*1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain].
Параметр конструктора - название книги (title).
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook измените тип возвращаемого значения на более подходящий.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.*/

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Mark Twain","Tom Soyer"));
        //books.add(new AgathaChristieBook("Agatha Christie", "Hercule Poirot"));


        }
}

class MarkTwainBook extends Book {
    String title;
    public MarkTwainBook(String author, String title) {
        super(author);
        this.title = title;
    }
    public String getOutputByBookType(){
        return getAuthor();
    }
}
//в коде дальше указывал модификаторы доступа Puclic,чтобы разобраться с ними в будущем. 

abstract class Book {
    public String author;

    public Book(String author) {
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

  
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBook(){
        return author;
    }


    public String getOutputByBookType() {
        //String agathaChristieOutput = this.author + ": " + getBook() + " is a detective";
        String markTwainOutput = getBook() + " was written by " + this.author;

        String output = markTwainOutput;
        //Add your code here

        return output;
    }
}
