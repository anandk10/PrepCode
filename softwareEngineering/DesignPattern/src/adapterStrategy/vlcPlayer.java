package adapterStrategy;

public class vlcPlayer extends AdvancedMediaPlayer {

	public vlcPlayer() {
		// TODO Auto-generated constructor stub
		_playMp4 = new CantPlayMp4();
		_playVlc = new CantPlayVlc();
	}
	
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
		System.out.println(this.getClass().getSimpleName()+" says "+this.tryToPlayMp4());
	}

}
