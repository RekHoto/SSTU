package markup;

import java.util.List;

public class Strikeout extends AbstractMarkupElement {
    public Strikeout(List<Markable> elements) {
        super(elements);
    }

    @Override
    public void toMarkdown(StringBuilder s) {
        super.toMarkdown(s, "~");
    }

    @Override
    public void toHtml(StringBuilder s) {
        super.toHtml(s, "<s>", "</s>");
    }

    @Override
    public void toTex(StringBuilder s) {
        super.toTex(s, "\\textst{", "}");
    }
}
