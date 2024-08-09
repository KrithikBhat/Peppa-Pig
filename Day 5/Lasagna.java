public class Lasagna{
    final int expectedminutes = 40;

   public int expectedMinutesInOven(){

    return expectedminutes;
   } 
   
   // Part 2
   private remainingMinutesInOven(int NumMinutes){
    int leftoverminutes = 40 - NumMinutes

    return leftoverminutes;
   }

   public preperationTimeInMinutes(int NumLayers){
        int prepminutes = 2*NumLayers;

        return prepminutes;
        // didn't need to add new variable- could have just subtracted during return
   }
    
   //Part 3

   private TotalTimeInMinutes(NumLayers, NumMinutes){
    return (prepminutes)+(NumMinutes)
   }
}
public class lasagnatest{
    public static void main(String[] args) {
        Lasagna randomlasagna = new Lasagna();
        randomlasagna.expectedMinutesInOven() 
        randomlasagna.remainingMinutesInOven();
        randomlasagna.preperationTimeInMinutes();
        randomlasagna.TotalTimeInMinutes();
    }
}