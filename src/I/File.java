package I;

public abstract class File
{
    protected String fileName;
    protected boolean compressed = false;
    abstract void open();
}
