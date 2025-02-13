package Task2;

import Task1.InputUtils;

public class Sequence{
    int[] sequence;

    public  Sequence(){
        this.sequence = InputUtils.setSequence();
    }

    public void sumAltSequence (){
        int sum = 0;
        for (int i = 0; i < sequence.length; i++){
            sum = (i % 2 == 0) ? (sum + sequence[i]) : (sum - sequence[i]);
        }
        System.out.println(sum);
    }

}