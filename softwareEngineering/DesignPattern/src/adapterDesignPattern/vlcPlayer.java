package adapterDesignPattern;

public class vlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) {
		// TODO Auto-generated method stub
		System.out.println("Current audio type vlc is played by "
				+ this.getClass().getSimpleName());
	}

	@Override
	public void playMp4(String filename) {
		// TODO Auto-generated method stub
		/* do nothing */
	}

}
