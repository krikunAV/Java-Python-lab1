package Task1;

public class SyracuseSequence {
    int countStep;
    int arg;

    public SyracuseSequence(int arg) {
        if(arg <= 1) {
            System.out.println("Argument must be greater than 1!");
            return;
        }
        this.arg = arg;
        this.countStep = 0;
    }

    public void startPassage() {
        while (arg != 1) {
            arg = (arg % 2 == 0) ? (arg / 2) : (arg * 3 + 1);
            countStep++;
        }
        System.out.println(countStep);
    }
}