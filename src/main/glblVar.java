package main;




public class glblVar {
	
	//user stats
	public static int level;
	public static String name;
	public static String sex;
	public static int money;
	public static int health = level * 100;
	public static int age;
	public static int food;
	public static int xp;
	public static int hunger;
	public static int energy;
	public static int damage;
	public static int armor;
	public static int playerStats = health + armor;
			
	
	//user location
	public static String town;
	public static boolean inTown;
	public static boolean north;
	public static boolean south;
	public static boolean east;
	public static boolean west;
	public static boolean ansterdell;
	public static boolean shadowridge;
	public static boolean highcrest;
	public static boolean lochwell;
	public static boolean FINDansterdell;
	public static boolean FINDshadowridge;
	public static boolean FINDhighcrest;
	public static boolean FINDlochwell;
	public static String direction;

	//tech
	public static String answer;
	public static int ranNum;
	public static String say;
	public static String saveName;
        public static boolean yesno;
        public static String console;
        public static boolean ifAnswer;
	
	
	
	
	//enemy
	public static String enemyName;
	public static int enemyLevel = level + 1;
	public static int enemyDamage = enemyLevel * 5;
	public static int enemyHealth = enemyLevel * 100;
	public static int enemyStats = enemyHealth;
	
	


	
}
