package blockchain;

public class Main {
     public static void main(String[] args) {
    	 String data[] = {"my name is niranjan","my name is niru"};
    	 block1 b = new block1(0,data);
    	 String data1[] = {"my name is niranjan","my name is pk"};
    	 block1 b1 = new block1(b.getHash(),data);
    	 String data2[] = {"new block 2","my name is pk"};
    	 block1 b2 = new block1(b1.getHash(),data);
    	 System.out.println(b2.getPreviousHash());
    	 System.out.println(b2.getTransactions());
    	 System.out.println(b2.getHash());
     }
}
