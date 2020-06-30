
package models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class _highlightResult {

    @SerializedName("author")
    private Author mAuthor;
    @SerializedName("title")
    private Title mTitle;
    @SerializedName("url")
    private Url mUrl;

    public Author getAuthor() {
        return mAuthor;
    }

    public void setAuthor(Author author) {
        mAuthor = author;
    }

    public Title getTitle() {
        return mTitle;
    }

    public void setTitle(Title title) {
        mTitle = title;
    }

    public Url getUrl() {
        return mUrl;
    }

    public void setUrl(Url url) {
        mUrl = url;
    }

}
