package markup;

public interface Markable {
    void toMarkdown(StringBuilder s);
    void toHtml(StringBuilder s);
    void toTex(StringBuilder s);
}
