package uit.lap3_18521507.Service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import uit.lap3_18521507.Model.Article;
import uit.lap3_18521507.Model.News;

public interface DataService {

    @GET("/v2/everything?q=tesla&from=2022-04-09&sortBy=publishedAt&apiKey=124ed38b714140bc8794869fa4ebd8cc")
    Call<News> GetDataNews();

}
