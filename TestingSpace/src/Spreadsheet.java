public class Spreadsheet {
    // counts the number of Spreadsheet objects that have been created
    static int numSpreadsheets = 0;
    // the name of *this* Spreadsheet
    String name;
    Spreadsheet(String name) {
        numSpreadsheets += 1;
        this.name = name;
    }
    public static void main(String args[]){
        Spreadsheet first = new Spreadsheet("1st");
        Spreadsheet second = new Spreadsheet("2nd");
        Spreadsheet third = new Spreadsheet("3rd");
        System.out.println("The number of Spreadsheets is "+ numSpreadsheets);
    }
}