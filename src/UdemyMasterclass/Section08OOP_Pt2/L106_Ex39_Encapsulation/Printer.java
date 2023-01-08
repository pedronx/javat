package UdemyMasterclass.Section08OOP_Pt2.L106_Ex39_Encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel=" + tonerLevel +
                ", pagesPrinted=" + pagesPrinted +
                ", duplex=" + duplex +
                '}';
    }

    public int addToner(int tonerAmount) {

        if (tonerAmount <= 0 || (tonerLevel + tonerAmount) < 0 || (tonerLevel  + tonerAmount) > 100) {
            return -1;
        } else {
            return tonerLevel += tonerAmount;
        }
    }

    public int printPages(int pages) {

        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = (int) Math.round((double)pages / 2);
            pagesPrinted += pagesToPrint;

            System.out.println("It's a duplex print");
            return pagesToPrint;
        } else {
            pagesPrinted += pages;
            return pages;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}
