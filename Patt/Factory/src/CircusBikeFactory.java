public class CircusBikeFactory implements BikeFactory{
    @Override
    public Bike createBike() {
        return new CircusBike();
    }
}
