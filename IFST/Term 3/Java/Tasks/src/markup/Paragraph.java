package markup;

import java.util.List;

public class Paragraph extends AbstractMarkupElement {
    public Paragraph(List<Markable> elements) {
        super(elements);
    }

    @Override
    public void toMarkdown(StringBuilder s) {
        super.toMarkdown(s, "");
    }

    @Override
    public void toHtml(StringBuilder s) {
        super.toHtml(s, "", "");
    }
}
