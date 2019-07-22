public class test1 {
   private int nr;

    public test1(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    @Override
    public String toString() {
        return "test1{" + "nr=" + nr + '}';
    }
}
