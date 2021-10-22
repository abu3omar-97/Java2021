public class Main2 {
    public static void main(String[] args) {

        final int KITKAT_ID = 10;
        final double KITKAT_PRICE = 0.5;
        final int KITKAT_REMAINING = 4;

        final int OREO_ID = 50;
        final double OREO_PRICE = 0.25;
        final int OREO_REMAINING = 0;


        double moneyFromUser = Double.parseDouble(JOptionPane.showInputDialog("PLEASE ENTER SOME COINS"));
        String menuItems = "10: KitKat (0.5)\n" +
                "50: Oreo (0.25)\n" +
                "20: Ras Al-Abed (0.1)\n" +
                "25: Laban (0.5)\n";

        int id = Integer.parseInt(JOptionPane.showInputDialog(menuItems));

        double change = 0;

        if(id == KITKAT_ID){

            if(moneyFromUser >= KITKAT_PRICE && KITKAT_REMAINING > 0){
                JOptionPane.showMessageDialog(null, "CATCH YOUR KITKAT");
            }
                change = moneyFromUser - KITKAT_PRICE;
        }
        else if(id == OREO_ID){
            if(moneyFromUser >= OREO_PRICE && OREO_REMAINING > 0){
                JOptionPane.showMessageDialog(null, "CATCH YOUR OREO");
            }
                change = moneyFromUser - OREO_PRICE;
        }
        else {
            JOptionPane.showMessageDialog(null,"ITEM NOT FOUND");
            change = moneyFromUser;
        }

        JOptionPane.showMessageDialog(null, "GOODBYE, DON'T FORGET YOUR CHANGE: " + change);




    }
}
