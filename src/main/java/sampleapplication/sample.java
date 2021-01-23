package sampleapplication;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sample s=new sample();
		System.out.println("Sample Maven application");
		int a=0;
		a=+5;
		int b=s.a();

		
	}

	@Deprecated
    public int a() {
		return 1;
	}
}
