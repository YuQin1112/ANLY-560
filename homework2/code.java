public class homework2javacode {
	public static void main(String[] args) {
	    double grade1 = 91.14; 
	    double grade2 = 85.01;
	    double grade3 = 72;
	    double grade4 = 63;
	    double grade5 = 81.14;
	    
	    double average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
	    
	    if (average < 100 && average >= 90) {
	        System.out.println("A: Fantastic job!");
	    } else if (average < 89.99 && average >= 80) {
	        System.out.println("B: Good!");
	    } else if (average < 79.99 && average >= 70) {
	        System.out.println("C: please try more next time!");
	    } else {
	        System.out.println("F: Unfortunately you failed!");
	    }
		
	}

}

