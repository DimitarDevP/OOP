import java.util.Scanner;

class Brojac {
    private int glava = 0;
    private int pismo = 0;
    
    public void add(String tip) {
        if (tip == "glava") glava++;
        else if (tip == "pismo") pismo++;
    }
    
    public String getResults() {
        return "Glava: " + glava + "\nPismo: " + pismo;
    }
    
    public void reset() {
        glava = 0;
        pismo = 0;
    }
}

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
        System.out.println("Kolku pati ke frlate paricka? ");
        int brojPati = keyboard.nextInt();
        
        Brojac b = new Brojac();
        
        for (int i = 0; i < brojPati; ++i) {
            if (Math.random() < 0.5) {
                System.out.println("Parickata padna na pismo");
                b.add("pismo");
            } 
            else {
                System.out.println("Parickata padna na glava");
                b.add("glava");
            }
        }
        
        System.out.println("Rezultatite se sledni: ");
        System.out.println(b.getResults());
        b.reset();
	}
}
