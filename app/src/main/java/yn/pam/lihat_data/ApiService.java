package yn.pam.lihat_data;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("todo.php")
    Call<List<Task>> getTasks();
}
