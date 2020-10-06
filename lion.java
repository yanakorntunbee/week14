package test14;

public class lion extends cat1{
	@Override
	void sound(){
		System.out.println("HONG HONG");
	}
	@Override
	void sound(int num) {
		for(int i=0;i<num;i++) {
			System.out.println("Process");
		}
	}
}