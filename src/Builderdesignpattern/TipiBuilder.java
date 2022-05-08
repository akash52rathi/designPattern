package Builderdesignpattern;

public class TipiBuilder implements Builder{

    private  House house;

    public TipiBuilder() {
        this.house= new House();
    }

    @Override
    public void buildBasement() {
    this.house.setBasement("WoodenBasement");
    }

    @Override
    public void buildStructure() {
      this.house.setStructure("woodenStructure");
    }

    @Override
    public void buildRoof() {

        this.house.setRoof("wooden roof");
    }

    @Override
    public void buildInterior() {
      this.house.setInterior("Wooden Interface");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
