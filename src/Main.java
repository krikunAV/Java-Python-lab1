import Task5.TwiceEven;
import Task1.InputUtils;
import Task1.SyracuseSequence;
import Task2.Sequence;
import Task3.TreasureMap;
import Task4.LogisticMaximum;
public class Main {
    public static void main(String[] args) {
        //Task_1
        SyracuseSequence sequential = new SyracuseSequence(InputUtils.setNumber());
        sequential.startPassage();

        //Task_2
        Sequence sequence = new Sequence();
        sequence.sumAltSequence();

        //Task_3
        TreasureMap map = new TreasureMap();
        map.quantityOfSteps();

        //Task_4
        LogisticMaximum heightTruck = new LogisticMaximum();
        heightTruck.findMaxHeightAndNumberPath();

        //Task_5
        TwiceEven even = new TwiceEven();
        even.isEvenTwice();
    }
}