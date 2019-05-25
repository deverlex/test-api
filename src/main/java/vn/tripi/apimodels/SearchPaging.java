package vn.tripi.apimodels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchPaging {

    @JsonProperty("itemsPerPage")
    private Integer itemsPerPage;
    private Integer page;
}
