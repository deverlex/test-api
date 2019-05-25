package vn.tripi.apimodels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchFlightOneDirection {

    @JsonProperty("requestId")
    private Long requestId;
    @JsonProperty("from_airport")
    private String fromAirport;
    @JsonProperty("to_airport")
    private String toAirport;
    private String depart;
    @JsonProperty("num_adults")
    private Integer numAdults;
    @JsonProperty("num_childs")
    private Integer numChild;
    @JsonProperty("num_infants")
    private Integer numInfants;
    @JsonProperty("ticketClassId")
    private Integer ticketClassId;
    @JsonProperty("one_way")
    private Integer oneWay;
    private String currency;
    private String lang;
    private SearchFilter filters;
    private String sort;
    @JsonProperty("waitFor")
    private String waitFor;
}

