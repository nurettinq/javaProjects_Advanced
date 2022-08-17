package deneme;

public class Lss {
    String name;
    String sname;
    String tname;
    String yname;

    public Lss(String name, String sname, String tname, String yname) {
        this.name = name;
        this.sname = sname;
        this.tname = tname;
        this.yname = yname;
    }

    @Override
    public String toString() {
        return "Lss{" +
                "name='" + name + '\'' +
                ", sname='" + sname + '\'' +
                ", tname='" + tname + '\'' +
                ", yname='" + yname + '\'' +
                '}';
    }
}
