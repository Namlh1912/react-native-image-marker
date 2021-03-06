package com.jimmydaddy.imagemarker;

import android.graphics.Color;
import android.util.Log;
import com.facebook.react.bridge.ReadableMap;

public class TextStyle {
    public String fontName;
    public String color;
    public int fontSize;

    public TextStyle(String fontName, String color, int fontSize) {
        this.fontName = fontName;
        this.color = color;
        this.fontSize = fontSize;
    }

    public TextStyle(ReadableMap readableMap) {
        if (null != readableMap) {
            try {
                this.setFontName(readableMap.getString("fontName"));                
                this.setFontSize((int) readableMap.getInt("fontSize"));
                this.setColor(readableMap.getString("color"));
            } catch (Exception e) {
                Log.d(Utils.TAG, "Unknown text background options ", e);
            }
        }
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