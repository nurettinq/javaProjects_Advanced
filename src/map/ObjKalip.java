package map;

public class ObjKalip {
    String name;
    int yas;
    String meslek;

    public ObjKalip(String name, int yas, String meslek) {
        this.name = name;
        this.yas = yas;
        this.meslek = meslek;
    }

    @Override
    public String toString() {
        return
                name +
                 yas +
              meslek;
    }
}
