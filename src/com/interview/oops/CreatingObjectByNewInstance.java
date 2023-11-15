package com.interview.oops;

public class CreatingObjectByNewInstance {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		NewInstance newInstance=null;		
		try {
			Class c=Class.forName("NewInstance");
			// c.getDeclaredConstructor(null);
			newInstance =(NewInstance) c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}				
	}
}

 class NewInstance {
    public NewInstance() {
        System.out.println("An instance of NewInstance has been created.");
    }
}
