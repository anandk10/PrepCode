package adapterStrategy;

public class MediaAdapter implements MediaPlayer {

	/* Have the instance of AdvancedMediaPlayer and point to the 
	 * correct instance depending upon the type of audio type. */
	
	AdvancedMediaPlayer advanceMediaPlayer;
	
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advanceMediaPlayer = new vlcPlayer();
			
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advanceMediaPlayer = new mp4Player();
		}
	}


	@Override
	public void play(String audioType, String filename) {
		// TODO Auto-generated method stub
		
		if(audioType.equalsIgnoreCase("vlc")) {
			advanceMediaPlayer.playVlc(filename);
			advanceMediaPlayer.playMp4(filename);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advanceMediaPlayer.playMp4(filename);
			advanceMediaPlayer.playVlc(filename);
		}
		
	}

}
