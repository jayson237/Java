import java.util.function.Supplier;

class Customer {
    private final int id;
    private final double arrival;
    private final Supplier<Double> service;

    Customer(int id, double arrival, Supplier<Double> service) {
        this.id = id;
        this.arrival = arrival;
        this.service = service;
    }

    public int getId() {
        return this.id;
    }

    public double getArrival() {
        return this.arrival;
    }

    public double getService() {
        return this.service.get();
    }

    public double doneBy() {
        return getArrival() + getService();
    }

    @Override
    public String toString() {
        return String.format("%d", this.id);
    }
}
