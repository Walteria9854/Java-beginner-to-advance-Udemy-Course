public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel) {

    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public void addToner(){
        int adding = 0;
        int tonerAmount = tonerLevel + adding;

        if(tonerLevel > 100){
            this.tonerLevel = 100;
        }else if(tonerLevel <= 0){
            this.tonerLevel = 0;
        }else {
            this.tonerLevel += tonerAmount;
        }

    }

    public void printPages(){
        System.out.println("Printing pages will be " + pagesPrinted);
        if(duplex){
            System.out.println("This will be duplex printer");
        }
    }


}
