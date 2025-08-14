package pkg_day4task2;

 class AudioPlayer implements Playable , Recordable {

	@Override
	public void record() {
		System.out.println("AudioPlayer recording audio.");
	}

	@Override
	public void play() {
		System.out.println("AudioPlayer playing audio.");
		
	}

	

}
