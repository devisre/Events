package operator;

public class nestedfor2 {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			for(int j=10;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
