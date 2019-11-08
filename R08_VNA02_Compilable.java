/******************************************************************************
 *  Rule08 - VNA02
 *
 ******************************************************************************/

public class R08_VNA02_Compilable{
    private static boolean flag = true;
    
    public static void main(String[] args){
        
        System.out.println(flag);
        flag = toggle();
        System.out.println(flag);
        flag = getFlag(); 
        System.out.println(flag);
    }
        
    public static boolean toggle() {  // Unsafe
        flag = !flag;
        return flag; 
    }

    public static boolean getFlag() { // Unsafe
        return flag;
    }
}


