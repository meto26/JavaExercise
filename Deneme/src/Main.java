
public class Main {

	public static void main(String[] args) {		
		sayiBulmaca();
	}
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean Varmi =false;
		
		for (int sayi:sayilar) {
			if(sayi==aranacak) {
				Varmi=true;
				break;
			}			
		}
		if(Varmi) {
			mesajVer("Sayı mevcuttur"+ aranacak);
		}else {
			mesajVer("Sayı mevcut değildir"+ aranacak);
		}
			
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}