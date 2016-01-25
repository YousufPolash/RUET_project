
public class primeCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i, j, a=0;

for(i=1; i<=200; i++){
	a=0;
	for(j=2; j<=i/2; j++){
		if(i%j==0){
			a=1;
		}
	}
	if(a==0){
		System.out.println(i);
	}
}

	}

}
