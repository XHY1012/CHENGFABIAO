
public class ChengFaBiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,i;
		for(n=1;n<=9;n++) {
			for(m=1;m<=n;m++) {
				i=n*m;
				System.out.print(m+"*"+n+"="+i+" \t");
			}
			System.out.println();
		}
	}

}
