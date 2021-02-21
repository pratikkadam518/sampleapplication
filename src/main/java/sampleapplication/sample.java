package sampleapplication;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sample s=new sample();
		System.out.println("Sample Maven application");
		int ans=s.add(5, 6);
		System.out.println(ans);

		
	}

	
    public int add(int a,int b) {
		return a+b;
	}
}
