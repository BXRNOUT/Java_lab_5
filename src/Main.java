import I.AudioFile;
import I.ImageFile;
import I.TextFile;

public class Main
{
    public static void main(String[] args)
    {
        TextFile text = new TextFile("Курсовая работа");
        ImageFile image = new ImageFile("Анапа 2007");
        AudioFile audio = new AudioFile("Город Сочи");
        text.open();
        image.open();
        audio.open();
        text.compress();
        text.compress();
        image.compress();
    }
}