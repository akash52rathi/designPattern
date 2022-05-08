package Builderdesignpattern;

public class CivilEngineer {

    private  Builder builder;

    public CivilEngineer(Builder builder) {
        this.builder =  builder;
    }
    public House getHouse()
    {
        return builder.getHouse();
    }

    public  void ConstructHouse()
    {
        builder.buildBasement();
        builder.buildRoof();
        builder.buildInterior();
        builder.buildStructure();
    }

}
