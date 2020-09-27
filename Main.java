class Main {
  public static void main(String[] args) {
   
   int daysdebtorfailed = 4;
   int amountdebtorpaysperday = 500;
   int amountpaid = 1000;

   int totalamounttopay;
   int daysthedebtorpaid;
   int amountremaining;
   int daysdebtordidntpay;

   totalamounttopay = daysdebtorfailed * amountdebtorpaysperday;
   System.out.println("the total amount the debtor is to pay" + totalamounttopay);

   daysthedebtorpaid = amountpaid/amountdebtorpaysperday;
   System.out.println("days debtor paid for: " + daysthedebtorpaid );

   amountremaining = amountpaid % amountdebtorpaysperday;
   System.out.println("remaining debt the debtor to pay " + amountremaining);

   daysdebtordidntpay = daysdebtorfailed - daysthedebtorpaid;
   System.out.println ("days debtor havent paid "+ daysdebtordidntpay);


  }
}