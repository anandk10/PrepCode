package adapterDesignPattern;

public class mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) {
		// TODO Auto-generated method stub
		/* do nothing */
	}

	@Override
	public void playMp4(String filename) {
		// TODO Auto-generated method stub
		System.out.println("Current audio type mp4 is played by "
				+ this.getClass().getSimpleName());
	}

}
