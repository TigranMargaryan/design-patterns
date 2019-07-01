package builder;

public abstract class Builder {

    public abstract Builder createProduct();

    public abstract Builder buildPartOne(String part);

    public abstract Builder buildPartTwo(String part);
}
