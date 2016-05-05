package adapterStrategy;

public abstract class AdvancedMediaPlayer {

	public PlayMp4 _playMp4 = null; 
	public PlayVlc _playVlc = null;
	public abstract void playVlc(String filename);
	public abstract void playMp4(String filename);
	
	public String tryToPlayVlc() {
		return _playVlc.playVlc();
	}
	
	public String tryToPlayMp4() {
		return _playMp4.playMp4();
	}
}
