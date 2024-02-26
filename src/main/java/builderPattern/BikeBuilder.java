package builderPattern;

public interface BikeBuilder {
    public String buildFrame();
    public String buildTire();

    public Bike getResult();
}
