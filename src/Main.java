public class Main {
    public static void main(String[] args) {
        Author theFirstAuthor = new Author("Лев", "Толстой");
        Author theSecondAuthor = new Author("Михаил", "Булгаков");

        Book theFirstBook = new Book("Война и мир", theFirstAuthor, 1880);
        Book theSecondBook = new Book("Мастер и Маргарита", theSecondAuthor, 1960);

        System.out.print(theFirstBook.getNameBook());
        System.out.print(" " + theFirstBook.getNameAuthor().getTheFirstNameAuthor());
        System.out.print(" " + theFirstBook.getNameAuthor().getTheSecondNameAuthor());
        System.out.print(" " + theFirstBook.getPublishingYear());
        theFirstBook.setPublishingYear(1885);
        System.out.println();
        System.out.println("theFirstBook = " + theFirstBook.getPublishingYear());
        System.out.print(theSecondBook.getNameBook());
        System.out.print(" " + theSecondBook.getNameAuthor().getTheFirstNameAuthor());
        System.out.print(" " + theSecondBook.getNameAuthor().getTheSecondNameAuthor());
        System.out.print(" " + theSecondBook.getPublishingYear());
    }
}