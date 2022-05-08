package Abstractfactorydesignpattern;

public class professionAbstractfactory extends Abstractfactory {
    @Override
    Profession getprofession(String typeofProfession) {
        if(typeofProfession==null)
            return  null;
        else  if(typeofProfession.equalsIgnoreCase("Doctor"))
            return new Doctor();
        else  if(typeofProfession.equalsIgnoreCase("Engineer"))
            return new Engineer();
         return null;
    }
}
