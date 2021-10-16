public class SimpleBikeFactory implements BikeFactory{
    @Override
    public Bike createBike() {
        return new SimpleBike();
    }
}
