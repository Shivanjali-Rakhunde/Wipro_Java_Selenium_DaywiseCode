package pkg_day4task2;

public class Main {
	public static void main(String[] args) {
		Playable audioPlay = new AudioPlayer();
		Recordable audioRecord = (Recordable) audioPlay;
		
		audioPlay.play();
		audioRecord.record();
		System.out.println("");
		
		
		Playable videoPlay = new VideoPlayer();
		Streamable videoStream = (Streamable) videoPlay;
		
		videoPlay.play();
		videoStream.stream();
		System.out.println("");
		
		Recordable cameraRecord = new Camera();
		Streamable cameraStream = (Streamable) cameraRecord;
		
		cameraRecord.record();
		cameraStream.stream();
		System.out.println("");
	}

}
