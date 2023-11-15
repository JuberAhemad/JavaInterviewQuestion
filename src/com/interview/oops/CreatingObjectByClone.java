package com.interview.oops;

public class CreatingObjectByClone implements Cloneable {
	
    String name;
    String greeting;
    
    public void sayGreeting(String name,String greeting) {
    	System.out.println("Hello "+name+ " "+greeting);
    }

	public static void main(String[] args) {
	
		CreatingObjectByClone obj = new CreatingObjectByClone();
		CreatingObjectByClone clone=null;
        try {
        	clone = (CreatingObjectByClone)obj.clone();
        	if (obj.equals(clone)) {
        		System.out.println("Both Object are Equal");
			}else {
				System.out.println("Both Object are not equal");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        clone.sayGreeting("Juber", "Good Moring");
		
	}

}
