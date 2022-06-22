public class Main {
    public static void main(String[] args) {
        // simulate the passing of time
        int startingYear = 2000;
        int targetYear = 2011;
        int currentYear = startingYear;
        int year = 0; 
        while (currentYear < targetYear) {
            year = currentYear - startingYear; 
            
            if(year == 0){
            }
            else if(year == 1){
                System.out.println(year + " year have passed");
            }else{
                System.out.println(year + " years have passed");
            }
            currentYear++;
        }
    }
}
