public class Main {
    public static void main(String[] args) {
        Bebek bebek = new BebekKwek();

        Kucing kucing = new MeowAdapter(bebek);
        System.out.println("Kucing Bersuara Bebek :");
        kucing.meow();
    }
}
