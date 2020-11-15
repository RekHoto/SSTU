package markup;

import java.util.List;

public class Emphasis extends AbstractMarkupElement {
    public Emphasis(List<Markable> elements) {
        super(elements);
    }

    @Override
    public void toMarkdown(StringBuilder s) {
        super.toMarkdown(s, "*");
    }

    @Override
    public void toHtml(StringBuilder s) {
        super.toHtml(s, "<em>", "</em>");
    }
}
