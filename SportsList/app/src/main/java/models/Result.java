
package models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Result {

    @SerializedName("exhaustiveNbHits")
    private Boolean mExhaustiveNbHits;
    @SerializedName("hits")
    private List<Hit> mHits;
    @SerializedName("hitsPerPage")
    private Long mHitsPerPage;
    @SerializedName("nbHits")
    private Long mNbHits;
    @SerializedName("nbPages")
    private Long mNbPages;
    @SerializedName("page")
    private Long mPage;
    @SerializedName("params")
    private String mParams;
    @SerializedName("processingTimeMS")
    private Long mProcessingTimeMS;
    @SerializedName("query")
    private String mQuery;

    public Boolean getExhaustiveNbHits() {
        return mExhaustiveNbHits;
    }

    public void setExhaustiveNbHits(Boolean exhaustiveNbHits) {
        mExhaustiveNbHits = exhaustiveNbHits;
    }

    public List<Hit> getHits() {
        return mHits;
    }

    public void setHits(List<Hit> hits) {
        mHits = hits;
    }

    public Long getHitsPerPage() {
        return mHitsPerPage;
    }

    public void setHitsPerPage(Long hitsPerPage) {
        mHitsPerPage = hitsPerPage;
    }

    public Long getNbHits() {
        return mNbHits;
    }

    public void setNbHits(Long nbHits) {
        mNbHits = nbHits;
    }

    public Long getNbPages() {
        return mNbPages;
    }

    public void setNbPages(Long nbPages) {
        mNbPages = nbPages;
    }

    public Long getPage() {
        return mPage;
    }

    public void setPage(Long page) {
        mPage = page;
    }

    public String getParams() {
        return mParams;
    }

    public void setParams(String params) {
        mParams = params;
    }

    public Long getProcessingTimeMS() {
        return mProcessingTimeMS;
    }

    public void setProcessingTimeMS(Long processingTimeMS) {
        mProcessingTimeMS = processingTimeMS;
    }

    public String getQuery() {
        return mQuery;
    }

    public void setQuery(String query) {
        mQuery = query;
    }

}
