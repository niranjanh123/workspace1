package blockchain;
import java.lang.reflect.*;
import java.util.Arrays;
public class block1 {
private int prehash;
private String[] transaction;
private int blockhash;
 public block1(int prehash,String[] transactions) {
    this.prehash = prehash;
    this.transaction = transactions;
    
    Object[] content = {Arrays.hashCode(transaction),prehash};
    this.blockhash = Arrays.hashCode(content);
 }
 public int getPreviousHash() {
	 return prehash;
 }
 public String[] getTransactions() {
	 return transaction;
 }
 public int getHash() {
	 return blockhash;
 }
}
