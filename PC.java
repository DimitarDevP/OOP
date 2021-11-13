class PC {
    private int memorija;
    private String tipNaMemorija;
    
    private int storage;
    private String disk;
    
    public PC() {
        memorija = 2;
        tipNaMemorija = "DDR4";
        storage = 160;
        disk = "HDD";
    }
    
    public void zgolemi(int zgolemiMemorija, int novSSDDisk) {
        System.out.println("Memorijata beshe " + memorija + " GB, sega iznesuva " + (memorija + zgolemiMemorija));
        memorija += zgolemiMemorija;
        System.out.println("Tipot na memorijata e " + tipNaMemorija);
        System.out.println("Noviot disk e SSD ima golemina od " + novSSDDisk + " GB. Prethodno imave " + disk + " i iznesuvase " + storage + " GB");
        storage = novSSDDisk;
        disk = "SSD m.2";
    }
}

public class Main {
	public static void main(String[] args) {
		PC laptop = new PC();
		laptop.zgolemi(8, 512);
	}
}
