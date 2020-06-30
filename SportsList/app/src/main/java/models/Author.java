
package models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Author {

    @SerializedName("matchLevel")
    private String mMatchLevel;
    @SerializedName("matchedWords")
    private List<Object> mMatchedWords;
    @SerializedName("value")
    private String mValue;

    public String getMatchLevel() {
        return mMatchLevel;
    }

    public void setMatchLevel(String matchLevel) {
        mMatchLevel = matchLevel;
    }

    public List<Object> getMatchedWords() {
        return mMatchedWords;
    }

    public void setMatchedWords(List<Object> matchedWords) {
        mMatchedWords = matchedWords;
    }

    public String getValue() {
        return mValue;
    }

    public void setValue(String value) {
        mValue = value;
    }

}
