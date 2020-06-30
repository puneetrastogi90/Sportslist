
package models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Hit {

    @SerializedName("author")
    private String mAuthor;
    @SerializedName("comment_text")
    private Object mCommentText;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("created_at_i")
    private Long mCreatedAtI;
    @SerializedName("num_comments")
    private Long mNumComments;
    @SerializedName("objectID")
    private String mObjectID;
    @SerializedName("parent_id")
    private Object mParentId;
    @SerializedName("points")
    private Long mPoints;
    @SerializedName("relevancy_score")
    private Long mRelevancyScore;
    @SerializedName("story_id")
    private Object mStoryId;
    @SerializedName("story_text")
    private Object mStoryText;
    @SerializedName("story_title")
    private Object mStoryTitle;
    @SerializedName("story_url")
    private Object mStoryUrl;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("_highlightResult")
    private models._highlightResult m_highlightResult;
    @SerializedName("_tags")
    private List<String> m_tags;

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        mAuthor = author;
    }

    public Object getCommentText() {
        return mCommentText;
    }

    public void setCommentText(Object commentText) {
        mCommentText = commentText;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public Long getCreatedAtI() {
        return mCreatedAtI;
    }

    public void setCreatedAtI(Long createdAtI) {
        mCreatedAtI = createdAtI;
    }

    public Long getNumComments() {
        return mNumComments;
    }

    public void setNumComments(Long numComments) {
        mNumComments = numComments;
    }

    public String getObjectID() {
        return mObjectID;
    }

    public void setObjectID(String objectID) {
        mObjectID = objectID;
    }

    public Object getParentId() {
        return mParentId;
    }

    public void setParentId(Object parentId) {
        mParentId = parentId;
    }

    public Long getPoints() {
        return mPoints;
    }

    public void setPoints(Long points) {
        mPoints = points;
    }

    public Long getRelevancyScore() {
        return mRelevancyScore;
    }

    public void setRelevancyScore(Long relevancyScore) {
        mRelevancyScore = relevancyScore;
    }

    public Object getStoryId() {
        return mStoryId;
    }

    public void setStoryId(Object storyId) {
        mStoryId = storyId;
    }

    public Object getStoryText() {
        return mStoryText;
    }

    public void setStoryText(Object storyText) {
        mStoryText = storyText;
    }

    public Object getStoryTitle() {
        return mStoryTitle;
    }

    public void setStoryTitle(Object storyTitle) {
        mStoryTitle = storyTitle;
    }

    public Object getStoryUrl() {
        return mStoryUrl;
    }

    public void setStoryUrl(Object storyUrl) {
        mStoryUrl = storyUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public models._highlightResult get_highlightResult() {
        return m_highlightResult;
    }

    public void set_highlightResult(models._highlightResult _highlightResult) {
        m_highlightResult = _highlightResult;
    }

    public List<String> get_tags() {
        return m_tags;
    }

    public void set_tags(List<String> _tags) {
        m_tags = _tags;
    }

}
