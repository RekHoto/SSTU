package markup;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMarkupElement implements Markable {
    protected List<Markable> elements;

    public AbstractMarkupElement(List<Markable> elements) {
        this.elements = elements;
    }


    protected void toMarkdown(StringBuilder s, String border) {
        s.append(border);
        for (Markable element : elements) {
            element.toMarkdown(s);
        }
        s.append(border);
    }

    public void toHtml(StringBuilder s, String l, String r) {
        s.append(l);
        for (Markable element : elements) {
            element.toHtml(s);
        }
        s.append(r);
    }
    public void toTex(StringBuilder s, String l, String r) {
        s.append(l);
        for (Markable element : elements) {
            element.toTex(s);
        }
        s.append(r);
    }

}
