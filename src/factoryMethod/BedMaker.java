package factoryMethod;

public class BedMaker implements Furniture{

	public BedMaker() {
		System.out.println("침대메이커 삼삼대기");
	}

	@Override
	public void make() {
		System.out.println("침대를 만들었습니다.");
	}

}
