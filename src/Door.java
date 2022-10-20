

abstract class lock{
	public abstract boolean isUnlocked(String keyCode);
	public void test() {
		System.out.println("test");
	}
}
	public class Door {
		lock l = new lock() {
			@override
			public boolean isUnlocked(String keycode) {
				if(keycode.equals("qwerty")) {
					return true;
				}else {
					return false;
				}
			
			}
		};
	}

	
		

