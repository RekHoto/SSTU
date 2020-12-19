package vlasov.converter;

public abstract class Converter {
    abstract void read(String in);
    abstract void convert();
    abstract void write(String out);

    public final void convert(String in, String out) {
        read(in);
        convert();
        write(out);
    }
}
