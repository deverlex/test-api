package vn.tripi.apimodels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchFilter {

    private List<Integer>  airlines;
    @JsonProperty("ticketClassCodes")
    private List<String> ticketClassCodes;
    private SearchPaging paging;
    private FilterSort sort;
}
