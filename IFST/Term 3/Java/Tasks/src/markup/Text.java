package markup;

import java.util.List;

public class Text implements Markable {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public void toMarkdown(StringBuilder s) {
        s.append(text);
    }

    @Override
    public void toHtml(StringBuilder s) {
        s.append(text);
    }

    @Override
    public void toTex(StringBuilder s) {
        s.append("\\item" + text);
    }
}
