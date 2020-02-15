package de.fkal;

public class App 
{
    public static void main( String[] args )
    {
        TransportationsMeans mercedes = new Vehicle();
        mercedes.setMoveBehaviours(new DriveBehaviour());
        mercedes.doMove();
        
        TransportationsMeans yamaha = new Ride();
        yamaha.setMoveBehaviours(new RideBehaviour());
        yamaha.doMove();
    }
}
