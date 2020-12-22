public class TextStyle {
    public String fontName;
    public String color;
    public int fontSize;

    public TextStyle(String fontName, String color, int fontSize) {
        this.fontName = fontName;
        this.color = color;
        this.fontSize = fontSize;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}