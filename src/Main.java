public class Main {
    public static void main(String[] args) {
        Author dostoevsky = new Author("Федор", "Михайлович", "Достоевский");
        Author tolstoy = new Author("Лев", "Николаевич", "Толстой");
        Book crimeAndPunishment = new Book("Преступление и наказание", dostoevsky, 1866);
        Book idiot = new Book("Идиот", dostoevsky, 1869);
        Book warAndPeace = new Book("Война и Мир", tolstoy, 1865);
        System.out.println("Книга: " + crimeAndPunishment.getName() + " " + "Автор: " + crimeAndPunishment.getAuthor() + " " + "Год издания: " + crimeAndPunishment.getYearOfPublication());
        System.out.println("Книга: " + idiot.getName() + " " + "Автор: " + idiot.getAuthor() + " " + "Год издания: " + idiot.getYearOfPublication());
        System.out.println("Книга: " + warAndPeace.getName() + " " + "Автор: " + warAndPeace.getAuthor() + " " + "Год издания: " + warAndPeace.getYearOfPublication());
        warAndPeace.setYearOfPublication(1869);
        System.out.println("Книга: " + warAndPeace.getName() + " " + "Автор: " + warAndPeace.getAuthor() + " " + "Год издания: " + warAndPeace.getYearOfPublication());
    }
}