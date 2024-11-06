public class File extends FileSystemComponent {
    public File(String name) {
        super(name);
    }

    @Override
    public void display(int depth) {
        System.out.println(new String(new char[depth]).replace('\0', '-') + " File: " + name);
    }
}
