/******************************************************************************
 *  Rule08 - VNA02
 *  Compliant
 ******************************************************************************/

public class R08_VNA02_Compliant_Compilable{
    private static boolean flag = true;
    
    public static void main(String[] args){
        
        System.out.println(flag);
        flag = toggle();
        System.out.println(flag);
        flag = getFlag(); 
        System.out.println(flag);
    }
        
    public static synchronized boolean toggle() {
        flag ^= true; // Same as flag = !flag;
        return flag;
    }
 
    public static synchronized boolean getFlag() {
        return flag;
    }
}


