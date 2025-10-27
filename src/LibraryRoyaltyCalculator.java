// Main class to demonstrate the royalty calculation system
public class LibraryRoyaltyCalculator
{
    public static void main(String[] args)
    {
        // Creating authors
        Author author = new Author("Elvira");
        Author author2 = new Author("Erik Quist");
        Author author3 = new Author("Papaviel Octavia");

        // Creating books for first author
        Title book = new PrintedBook("21 Fallen", "SKØN", 127, 4);
        Title book2 = new PrintedBook("Poems of a past life", "Lyrik", 40, 10);

        // Creating books for second author
        Title book3 = new PrintedBook("Autobogen", "FAG", 674, 20000);
        Title book4 = new AudioBook("Beep Beep", "BI", 30, 4263);

        // Creating books for third author
        Title book5 = new EAudioBook("The Feywilds", "FAG", 5, 3, 600, 420);
        Title book6 = new EBook("Vanity is good for the health", "TE", 8, 4, 5792, 17000, true);

        // Assign titles to each author
        author.addTitle(book);
        author.addTitle(book2);

        author2.addTitle(book3);
        author2.addTitle(book4);

        author3.addTitle(book5);
        author3.addTitle(book6);

        // Print out calculated royalties
        System.out.printf("Author %s: %.2f kr. %n", author.getName(), author.calculateRoyalties());
        System.out.printf("Author %s: %.2f kr. %n", author2.getName(), author2.calculateRoyalties());
        System.out.printf("Author %s: %.2f kr. %n", author3.getName(), author3.calculateRoyalties());

        // To my great annoyance, the math is off by a bit.
        // Some float points out there are not mathing right!
    }
}
