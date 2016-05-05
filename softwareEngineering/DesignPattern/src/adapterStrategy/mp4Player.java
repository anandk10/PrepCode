package adapterStrategy;

public class mp4Player extends AdvancedMediaPlayer {

	public  mp4Player() {
		// TODO Auto-generated constructor stub
		_playMp4 = new ItPlaysMp4();
		_playVlc = new CantPlayVlc();
	}
	
	
	@Override
	public void playVlc(String filename) {
		// TODO Auto-generated method stub
		/* do nothing */
		System.out.println(this.getClass().getSimpleName()+" says "+this.tryToPlayVlc());
	}

	@Override
	public void playMp4(String filename) {
		// TODO Auto-generated method stub
		System.out.println("Current audio type mp4 is played by "
				+ this.getClass().getSimpleName());
	}

}
