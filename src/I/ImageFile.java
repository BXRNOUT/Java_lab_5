package I;

public class ImageFile extends File implements Compressible
{
    public ImageFile(String fileName)
    {
        super.fileName = fileName;
    }

    public void compress()
    {
        if(!compressed)
        {
            System.out.println("Изображение было сжато");
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
        System.out.println("Открыт файл: ImageFile");
    }
}
