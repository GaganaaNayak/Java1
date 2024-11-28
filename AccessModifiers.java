class AccessModifiersExample{ 
    private int privateVariable;     
    protected int protectedVariable; 
    public int publicVariable;       
 
    public void setPrivateVariable(int privateValue) { 
        privateVariable = privateValue; 
    } 
    public int getPrivateVariable() { 
        return privateVariable; 
    } 
} 
public class AccessModifiers{ 
    public static void main(String[] args) { 
        AccessModifiersExample example = new AccessModifiersExample(); 
        example.publicVariable = 30;  
        example.protectedVariable = 20; 
        example.setPrivateVariable(10); 
        System.out.println("Private Variable: " + example.getPrivateVariable()); 
        System.out.println("Protected Variable: " + example.protectedVariable); 
        System.out.println("Public Variable: " + example.publicVariable); 
} 
} 
