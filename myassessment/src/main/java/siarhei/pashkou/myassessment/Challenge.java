package siarhei.pashkou.myassessment;

class Challenge {
	  // Complete this function to return either
	  // "Hello, [name]!" or "Hello there!"
	  // based on the input
	  
	  public static String sayHello(String name ) {
	    // You can print to STDOUT for debugging if you need to:
	    System.out.print(name);
	    
	    // but you need to return the correct value in order to pass the challenge
	    if((name == null) || name.isEmpty()){
	      return "Hello there";
	    }
	    
	    return "Hello, " + name + "!"; // TODO: return the correct value
	  }
	}