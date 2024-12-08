package I;

public class AudioFile extends File
{
    public AudioFile(String fileName)
    {
        super.fileName = fileName;
    }

    @Override
    public void open()
    {
        System.out.println("Открыт файл: TextFile");
    }
}
