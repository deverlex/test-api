package vn.tripi.apimodels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilterSort {
    @JsonProperty("priceUp")
    private Boolean priceUp;
}
