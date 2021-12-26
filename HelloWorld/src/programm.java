public class Program {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
        // Branche featureA
        System.out.println("Hallo World ...");
        // Branche featureA next commit
		System.out.println("Hallo World ..."+i);
<<<<<<< HEAD
        // change for 4. commit	
		System.out.println("Hallo 4. World ..."+i);

=======
        // New comment 
        System.out.println("Hallo FeatureA ..."+i);
>>>>>>> featureA
		}
		
	}