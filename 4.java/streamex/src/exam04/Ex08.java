package exam04;

import exam03.Book;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Ex08 {
    public static void main(String[] args) {
        List<Book> books = IntStream.rangeClosed(1, 10).mapToObj(i -> new Book("책", + i, "저자" + i, "출판사" + i)).toList();

        Map<String, String> data = books.stream().collect(toMap())
    }
}
