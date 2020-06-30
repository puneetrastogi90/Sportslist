
package models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Title {

    @SerializedName("fullyHighlighted")
    private Boolean mFullyHighlighted;
    @SerializedName("matchLevel")
    private String mMatchLevel;
    @SerializedName("matchedWords")
    private List<String> mMatchedWords;
    @SerializedName("value")
    private String mValue;

    public Boolean getFullyHighlighted() {
        return mFullyHighlighted;
    }

    public void setFullyHighlighted(Boolean fullyHighlighted) {
        mFullyHighlighted = fullyHighlighted;
    }

    public String getMatchLevel() {
        return mMatchLevel;
    }

    public void setMatchLevel(String matchLevel) {
        mMatchLevel = matchLevel;
    }

    public List<String> getMatchedWords() {
        return mMatchedWords;
    }

    public void setMatchedWords(List<String> matchedWords) {
        mMatchedWords = matchedWords;
    }

    public String getValue() {
        return mValue;
    }

    public void setValue(String value) {
        mValue = value;
    }

}
