package markup;

import java.util.List;

public class Strong extends AbstractMarkupElement {
    public Strong(List<Markable> elements) {
        super(elements);
    }

    @Override
    public void toMarkdown(StringBuilder result) {
        super.toMarkdown(result, "__");
    }

    @Override
    public void toHtml(StringBuilder s) {
        super.toHtml(s, "<strong>", "</strong>");
    }

    @Override
    public void toTex(StringBuilder s) {
        super.toTex(s, "\\textbf{", "}");
    }
}
