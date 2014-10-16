package main;




public class trvl {
	
	public static void travelAsk() throws Exception {
		
		int num = 1;
		
		System.out.println("Which town would you like to travel to?");
		
		System.out.println(num + ": Ansterdell");
		
		num++;
		
		if (glblVar.FINDhighcrest = true) {
			System.out.println(num + ": Highcrest");
			
			num++;
			
			
		}
		
		else if (glblVar.FINDlochwell = true) {
			System.out.println(num + ": Lochwell");
			
			num++;
			
			
		}
		
		else if (glblVar.FINDshadowridge = true) {
			System.out.println(num + ": Shadowridge");
			
			
		}
		
		travel();
		
		
	}
	
	public static void travel() throws Exception {
		
		scn.scan();
		
		if (glblVar.answer .equals("1")) {
			
			System.out.println("Welcom to Ansterdell!");
			
			twn.townAnsterdell();
		}
		
		if (glblVar.answer .equals("2")) {
			System.out.println("Welcom to Highcrest!");
			twn.townHighcrest();
		}
		
		if (glblVar.answer .equals("3")) {
			System.out.println("Welcom to Lochwell!");
			twn.townLochwell();
		}
		
		if (glblVar.answer .equals("4")) {
			System.out.println("Welcom to Shadowridge!");
			twn.townShadowridge();
		}
		
		
		
	}
}
