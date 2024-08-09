public class Lasagna{
    int expectedminutes = 40;
    
   public int expectedMinutesInOven(){

    return expectedminutes;
   } 

   public remainingMinutesInOven(int NumMinutes){
    int leftoverminutes = 40 - NumMinutes

    return leftoverminutes;
   }

   preperationTimeInMinutes(int NumLayers){
        int prepminutes = 2*NumLayers;

        return prepminutes;
   }
}