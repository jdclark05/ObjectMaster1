public class HumanTest {
    public static void main(String[] args){
        Human madMax = new Human();
        int m = madMax.displayHealth();


        Human rickSanchez = new Human();
        int r = rickSanchez.displayHealth();

        r = madMax.attack("madMax", r, "rickSanchez");
        m = rickSanchez.attack("rickSanchez", m, "madMax");
        
    }
}
