import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatFacts {

    private final String id;
    private final String text;
    private final String cat;
    private final String user;
    private final Integer upvotes;

    public CatFacts(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("cat") String cat,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") Integer upvotes

    ) {
        this.id = id;
        this.text = text;
        this.cat = cat;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getCat() {
        return cat;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }
}
