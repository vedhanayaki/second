package player;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a={1,2,3,4};
int smallest=0;
int secondsmallest=0;
for(int i=0;i<a.length;i++){
	for(int j=0;j<a.length;j++){
		if(a[i]<smallest){
			smallest=a[i];
		}
		if(secondsmallest<a[j]){
			secondsmallest=a[j];
		}
	}
}
System.out.println("The Secondsmallest Number is:"+smallest+"\t"+secondsmallest);

	}

}
