package Abstractfactorydesignpattern;

public class TraineeAbstractfactory extends  Abstractfactory{

    Profession getprofession(String typeofProfession) {
        if(typeofProfession==null)
            return  null;
        else  if(typeofProfession.equalsIgnoreCase("Doctor"))
            return new Traineedoctor();
        else  if(typeofProfession.equalsIgnoreCase("Engineer"))
            return new TraineeEngieer();
        return null;
    }
}
