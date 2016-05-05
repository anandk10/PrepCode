package adapterDesignPattern;

public class Client {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "Numb");
		audioPlayer.play("vlc", "Its time");
		audioPlayer.play("mp4", "Amazing day");
	}
}
