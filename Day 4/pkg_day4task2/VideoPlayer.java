package pkg_day4task2;

public class VideoPlayer implements Playable , Streamable {

	@Override
	public void stream() {
		System.out.println("VideoPlayer streaming video.");
		
	}

	@Override
	public void play() {
		System.out.println("VideoPlayer playing video.");
		
	}
	

}
