package builder;

public class ConcreteBuilder extends Builder {

    private Product product;

    @Override
    public Builder createProduct() {
        this.product = new Product();
        return this;
    }

    @Override
    public Builder buildPartOne(String part) {
        product.setPart1(part);
        return this;
    }

    @Override
    public Builder buildPartTwo(String part) {
        product.setPart2(part);
        return this;
    }

    public Product getResult()
    {
        return product;
    }
}
