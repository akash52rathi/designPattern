package Abstractfactorydesignpattern;

public class AbstractfactoryProducer {
    public  static  Abstractfactory getprofession(boolean IsTrainee)
    {
        if(IsTrainee)
        {
            return  new TraineeAbstractfactory();
        }
        else {
            return  new professionAbstractfactory();
        }
    }
}
