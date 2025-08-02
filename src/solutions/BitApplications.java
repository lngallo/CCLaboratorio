package solutions;

/**
 * Change the bit representation to his complement.
 * 
 * @author lgallo
 */
public class BitApplications {

    public static void main(String[] args) {
	//long num = 2147483647;
	//long num = 1;
	long num = 0;
	StringBuilder sb = new StringBuilder(32);
	System.out.println();
	for (int i = 31; i >= 0; i--) { 
	    System.out.print(Long.toBinaryString((num >> i) & 1));
	    sb.append(((num >> i) & 1) == 1? 0: 1);
	}
	System.out.println(sb);
	System.out.println(Long.parseLong(sb.toString(), 2));
    }


}
