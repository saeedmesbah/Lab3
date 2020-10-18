public class Main {
    
    public static void main(String[] args) {
        ClockDisplay c=new ClockDisplay();
        c.setTime(12, 15,16);
        while(true){
            c.timeTick();
            System.out.println(""+c.getTime());
        }
        
    }
    
}
