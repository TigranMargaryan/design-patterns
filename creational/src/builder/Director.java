package builder;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.createProduct().buildPartOne("part1").buildPartTwo("part2");
    }
}
