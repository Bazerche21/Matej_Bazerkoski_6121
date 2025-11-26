import java.io.IOException;

public class Main {
    public static void main ( String[] args ) {
       String fileName = "test3.txt";
       SeriazableDef seriazableDef = new SeriazableDef();
       seriazableDef.setFeature("Feature");
       seriazableDef.setProductName("Product");
       seriazableDef.setFeatureCount(64);

       try {
            SerializationLib.doSerialize(seriazableDef, fileName);
            seriazableDef = (SeriazableDef)SerializationLib.doDeserialize(fileName);
           System.out.println(seriazableDef);
       }catch (IOException | ClassNotFoundException e){
           e.printStackTrace();
       }
    }
}