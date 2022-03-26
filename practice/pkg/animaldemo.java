package pkg;

public class animaldemo {
    public static void main(String[] args) {
        myanimal ob = new myanimal();

        for (int i = 0; i < ob.aname.length; i++) {
            System.out.println("Animal name: " + ob.aname[i]);
        }
    }

}