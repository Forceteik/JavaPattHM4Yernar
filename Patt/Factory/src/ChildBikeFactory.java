public class ChildBikeFactory implements BikeFactory{
    @Override
    public Bike createBike() {
        return new ChildBike();
    }
}
