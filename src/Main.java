import dto.MediaDTO;
import controller.MediaController;

public class Main {
    public static void main(String[] args) {
        MediaController controller = new MediaController();

        MediaDTO song = new MediaDTO();
        song.name = "Song One";
        song.type = "SONG";
        song.duration = 180;

        MediaDTO podcast = new MediaDTO();
        podcast.name = "Podcast One";
        podcast.type = "PODCAST";
        podcast.duration = 1200;

        controller.create(song);
        controller.create(podcast);

        controller.showAll();
    }
}