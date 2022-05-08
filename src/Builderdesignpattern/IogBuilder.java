package Builderdesignpattern;

public class IogBuilder implements Builder{

    private  House house;
    public IogBuilder() {
        this.house= new House();
    }

    @Override
    public void buildBasement() {
        this.house.setBasement("Ice Basement");
    }

    @Override
    public void buildStructure() {
        this.house.setStructure("Ice Structure");
    }

    @Override
    public void buildRoof() {

        this.house.setRoof("Ice roof");
    }

    @Override
    public void buildInterior() {
        this.house.setInterior("Ice Interface");
    }

    @Override
    public House getHouse() {
        return this.house;
    }

}
