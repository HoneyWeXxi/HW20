public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Flute flute = new Flute();
        Piano piano = new Piano();
        Musician musician = new Musician();
        musician.perform(piano);;
    }
}