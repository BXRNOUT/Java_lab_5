package I;

public class TextFile extends File implements Compressible
{
    public TextFile(String fileName)
    {
        super.fileName = fileName;
    }

    public void compress()
    {
        if(!compressed)
        {
            System.out.println("Текстовый файл был сжат");
            compressed = true;
        }
        else
        {
            System.out.println("Файл уже сжат");
        }
    }

    @Override
    public void open()
    {
        System.out.println("Открыт файл: TextFile");
    }
}
