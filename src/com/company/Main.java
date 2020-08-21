package com.company;

public class Main {



    public static void main(String[] args) {

        Reader [] arrayreader = new Reader[3];


        Reader reader = new Reader();
        reader.setShortNamestudent("Болатов Б.Б.");
        reader.setStudentDateOfBirth("01-01-1991");
        reader.setStudentGroup("Информационные системы");
        reader.setStudentPhoneNumber("87771235485");
        reader.setStudentNumber(101200);

        arrayreader[0] = reader;


        Reader reader1 = new Reader();
        reader1.setShortNamestudent("Утегенов Е.С.");
        reader1.setStudentDateOfBirth("13-11-1994");
        reader1.setStudentGroup("Математика");
        reader1.setStudentPhoneNumber("87078524174");
        reader1.setStudentNumber(101201);

        arrayreader[1] = reader1;

        Reader reader2 = new Reader();
        reader2.setShortNamestudent("Алпамысов М.Н.");
        reader2.setStudentDateOfBirth("21-04-1992");
        reader2.setStudentGroup("Прикладная математика");
        reader2.setStudentPhoneNumber("87784566545");
        reader2.setStudentNumber(101202);

        arrayreader[2] = reader2;

        Books [] arrayOfreturnBooks = new Books[3];

        Books book1 = new Books();
        book1.setBookName("Java для начинающих");
        book1.setBookAuthor("Алексей Васильев");

        arrayOfreturnBooks[0] = book1;

        Books books2 = new Books();
        books2.setBookName("ORACLE для профессионалов");
        books2.setBookAuthor("Том Кайт");

        arrayOfreturnBooks[1] = books2;

        Books books3 = new Books();
        books3.setBookName("PHP глазами хакера");
        books3.setBookAuthor("Михаил Фленов");

        arrayOfreturnBooks[2] = books3;

        //для takeBook
        /*for (int i = 0; i <arrayreader.length ; i++) {
            //System.out.println(arrayreader[i].takeBook(arrayreader[i].getShortNamestudent(),2));
            //System.out.println(arrayreader[i].takeBook(arrayreader[i].getShortNamestudent(),books3.getBookName()));
            //System.out.println(arrayreader[i].takeBook(arrayreader[i].getShortNamestudent(),books2.getBookName()));

        }*/

        // для returnBook
        for (int i = 0; i <arrayOfreturnBooks.length ; i++) {
            //System.out.println(arrayOfreturnBooks[i].returnBook(reader2.getShortNamestudent(),book1.getBookName()));
            System.out.println(arrayOfreturnBooks[i].returnBook(reader.getShortNamestudent(),15));
        }
    }
}
