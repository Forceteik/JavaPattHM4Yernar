public class Main {
    public static void main(String[] args) {
        BikeFactory bikeFactory = createBikeByType("child");
        Bike bike = bikeFactory.createBike();

        bike.useWheels();
    }

    static BikeFactory createBikeByType(String type){
        if (type.equalsIgnoreCase("circus")){
            return new CircusBikeFactory();
        }else if(type.equalsIgnoreCase("simple")){
            return new SimpleBikeFactory();
        }else if (type.equalsIgnoreCase("child")){
            return new ChildBikeFactory();
        }
        else{
            throw new RuntimeException(type + " is not exist...");
        }
    }
}
