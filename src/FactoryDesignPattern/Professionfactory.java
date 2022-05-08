package FactoryDesignPattern;

import FactoryDesignPattern.Engineer;

public class Professionfactory {

    public Profession getProfession(String typeofProfession)
    {
        if(typeofProfession==null)
        {
          return null;
        }
        if(typeofProfession.equalsIgnoreCase("FactoryDesignPattern.Doctor"))
        {
          return  new Doctor();
        }
        if(typeofProfession.equalsIgnoreCase("engineer"))
        {

            return  new Engineer();
        }
        if(typeofProfession.equalsIgnoreCase("FactoryDesignPattern.Teacher"))
        {
            return   new Teacher();
        }

        return  null;

    }

}
