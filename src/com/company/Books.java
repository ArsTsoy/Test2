package com.company;

public class Books {
    private String bookName;
    private String bookAuthor;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String returnBook(){
        return null;
    }

    public String returnBook(Object Reader, int countOfretunBook){
        return "Студент: " + Reader + " вернул: " + countOfretunBook + " книг";
    }

    public String returnBook(Object Reader, String bookName){
        return "Студент: " + Reader + " вернул книгу: " + bookName;
    }

}
