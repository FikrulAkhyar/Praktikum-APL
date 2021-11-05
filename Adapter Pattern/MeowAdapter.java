public class MeowAdapter implements Kucing {
    Bebek bebek;

    public MeowAdapter(Bebek bebek) {
        this.bebek = bebek;
    }

    @Override
    public void meow() {
        bebek.kwek();
    }
}
