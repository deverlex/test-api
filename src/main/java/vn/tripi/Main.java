package vn.tripi;

import okhttp3.ResponseBody;
import retrofit2.Response;
import vn.tripi.apimodels.FilterSort;
import vn.tripi.apimodels.SearchFilter;
import vn.tripi.apimodels.SearchFlightOneDirection;
import vn.tripi.apimodels.SearchPaging;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Runnable runner = new Requester();
        for (int i = 0; i < 100; ++i) {
            new Thread(runner).start();
        }
    }

    public static class Requester implements Runnable {

        private WsClient wsClient;

        public Requester() {
            wsClient = new WsClient();
        }

        @Override
        public void run() {
            BackEndAPI api = wsClient.getBackEndAPI();
            SearchFlightOneDirection body = searchBody();
            for (int i = 0; i < 50000; ++i) {
                try {
                    Response<ResponseBody> response = api.searchOneDirection(body).execute();
                    System.out.println(response.code());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static SearchFlightOneDirection searchBody() {
        SearchFlightOneDirection body = new SearchFlightOneDirection();
        body.setRequestId(-2030244643L);
        body.setFromAirport("DAD");
        body.setToAirport("HAN");
        body.setDepart("22-11-2019");
        body.setNumAdults(1);
        body.setNumChild(0);
        body.setNumInfants(0);
        body.setTicketClassId(1);
        body.setOneWay(1);
        body.setCurrency("VND");
        body.setLang("vi");
        SearchFilter filter = new SearchFilter();
        filter.setAirlines(Collections.emptyList());
        filter.setTicketClassCodes(Collections.emptyList());
        SearchPaging paging = new SearchPaging();
        paging.setItemsPerPage(200);
        paging.setPage(1);
        filter.setPaging(paging);
        FilterSort sort = new FilterSort();
        sort.setPriceUp(true);
        filter.setSort(sort);
        body.setFilters(filter);
        body.setSort("tripi_recommended");
        body.setWaitFor("SVNA,VJAUA,JETSTAR");
        return body;
    }
}
