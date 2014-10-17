package main;

import java.util.Scanner;


public class str {
	
	public static void store() throws Exception {
		
		if (glblVar.inTown == false) {
			System.out.println("You need to travel to a town.");
			System.out.println("Would you like to travel to a town?");
			
			askyn.askYesNo();
			
			if (glblVar.yesno = true ) {
				trvl.travelAsk();
			}
			else 
			{
				mnu.Menu();
			}
			
		}
		
		else {
			str.ask();
		}
		
	}

	public static void ask() throws Exception {
		System.out.println("What would you like to buy?");
		System.out.println("1: Upgrades");
		System.out.println("2: Items");
		System.out.println("3: Food");
		System.out.println("4: Bag");
		System.out.println("5: Back to Menu");
		
		scn.scan();
		
		if(glblVar.answer .equals("1")) {
			str.upgrade();
		}
		
		if(glblVar.answer .equals("2")) {
			str.item();
		}

		if(glblVar.answer .equals("3")) {
			str.food();
	
		}

		if(glblVar.answer .equals("4")) {
			str.bag();
		}
		
		if(glblVar.answer .equals("5")) {
			mnu.Menu();
		}
		
	}

    private static void upgrade() throws Exception {
        System.out.println("What do you want to upgrade?");
        System.out.println("1: Armor");
        System.out.println("2: Train");
        System.out.println("3: Exit Store");

        scn.scan();

        //armor upgrade
        if (glblVar.answer .equals("1")) {
                int armorLevel = glblVar.armor / 5;
                int futureArmorLevel = armorLevel++;
                int armorUpgrade$ = armorLevel * 200;

                if (glblVar.money > armorUpgrade$) {
                        System.out.println("You have enough money.");
                        System.out.println("It will cost $" + armorUpgrade$ + ".");
                        System.out.println("Do you want to upgrade your armor to level " + futureArmorLevel + "?");


                        askyn.askYesNo();

                        if(glblVar.yesno = true) {
                                System.out.println("Upgraded your armor!");

                                glblVar.money = glblVar.money - armorUpgrade$;
                                armorLevel++;
                                glblVar.armor = armorLevel*5;

                                System.out.println("Your armor is " + glblVar.armor + ".");
                                System.out.println("You have $" + glblVar.money + " left.");

                                str.store();


                        }

                        else {
                                ask();
                        }
                }
                else {
                        System.out.println("You do not have enough money.");
                        ask();
                }
        }

        //damage upgrade
        if (glblVar.answer .equals("2")) {

            System.out.println("What do you want to train?");
            System.out.println("1: Attack");
            System.out.println("2: Counter Attack");
            System.out.println("3: Block");
            System.out.println("4: Exit");

            scn.scan();

            //attack
            if (glblVar.answer .equals("1")) {
                
                //int 
                System.out.println("You want to train your attack skill?");
                

            }

            //counter attack
            if (glblVar.answer .equals("2")) {

            }

            //block
            if (glblVar.answer .equals("3")) {


            }
        //exit
        if (glblVar.answer .equals("3")) {

            str.ask();

        }
        }
    }

	private static void item() throws Exception {
		
            System.out.println("WIP");
            str.ask();
        }

	private static void food() throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int packToBuy;
		
		
		System.out.println("Would you like to buy food?");
		
                askyn.askYesNo();
		
		//yes
		if(glblVar.yesno == true) {
			
			System.out.println("Packs of food come in 10.");
			System.out.println("1 pack equals 10 food and 50 coins.");
                        System.out.println("How many packs of food would you like to buy?");
			
			packToBuy = scan.nextInt();
			int packCost = packToBuy*50;
			
			System.out.println("You want to buy " + packToBuy + " packs of food?");
			System.out.println("That is " + packToBuy*10 + " hunger.");
			System.out.println("It will cost " + packCost + " coins.");
			
			if(glblVar.money < packCost) {
				System.out.println("You do not have enough money.");
				ask();
				
			}
			
			else {
				System.out.println("You have enough money.");
				System.out.println("Do you still want to buy it?");
				
                                askyn.askYesNo();
				
				if(glblVar.yesno == true) {
					System.out.println("You bought " + packToBuy + " packs of food!");
					
					glblVar.food = glblVar.food + (packToBuy*10);
					glblVar.money = glblVar.money - packCost;
					
					System.out.println("You have $" + glblVar.money + ".");
					System.out.println("You have " + glblVar.food + " food left.");
					
					ask();
				}
				
				else {
					ask();
				}
			}
			
			
			
		}
		
		//no
		if(glblVar.answer .equals("2")) {
			ask();
		}
		
	}

	private static void bag() throws Exception {
		
            System.out.println("WIP");
            str.ask();
		
	}
}
