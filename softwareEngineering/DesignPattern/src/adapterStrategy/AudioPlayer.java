package adapterStrategy;

public class AudioPlayer implements MediaPlayer {

	/* Have a adapter class object which will help this class to play files apart from mp3 */
	@Override
	public void play(String audioType, String filename) {
		// TODO Auto-generated method stub

		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Current audio type " + audioType + " is played by "
					+ this.getClass().getSimpleName());
		} else {
			/* Pass the params to the adapter object. */
			/* Create an object of MediaAdapter class */
			MediaAdapter mediaAdapter = new MediaAdapter(audioType);
			/* Call the play method */
			mediaAdapter.play(audioType, filename);
		}
	}

}
