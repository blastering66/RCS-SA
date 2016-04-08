package id.tech.adapters;

/**
 * Created by macbook on 3/28/16.
 */
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.http.Path;
import retrofit.http.Query;
import com.squareup.okhttp.RequestBody;
import java.util.List;
import id.tech.models.*;

public interface Rest_Adapter {

    @GET("login.php?kind=mobile")
    Call<PojoLogin> login(@Query("username") String username,
                         @Query("password") String password
    );

    @FormUrlEncoded
    @POST("insert.php?")
    Call<PojoResponseRowCount> absent(
            @Field("kind") String kind,
            @Field("kode_toko") String kode_toko,
            @Field("id_pegawai") String id_pegawai,
            @Field("longitude_absensi") String longitude_absensi,
            @Field("latitude_absensi") String latitude_absensi,
            @Field("tipe_absensi") String tipe_absensi
    );

    @GET("get.php?kind=pegawai")
    Call<PojoProfile> profile(@Query("id_pegawai") String id_pegawai
    );

    @GET("get.php?kind=achievement")
    Call<PojoProfileTarget> profile_target(
            @Query("id_pegawai") String id_pegawai,
            @Query("today") String today
    );

    @GET("get.php?kind=produk_toko")
    Call<PojoStockStore> cek_stock(
            @Query("kode_toko") String kode_toko,
            @Query("today") String today
    );

    @Multipart
    @POST("insert.php?")
    Call<PojoResponseRowCount> input_produk(
            @Part("kind") RequestBody  kind,
            @Part("id_pegawai") RequestBody  id_pegawai,
            @Part("kode_toko") RequestBody  kode_toko,
            @Part("latitude_produk_toko") RequestBody  latitude_produk_toko,
            @Part("longitude_produk_toko") RequestBody  longitude_produk_toko,
            @Part("imei") RequestBody  imei,
            @Part("img\"; filename=\"img.png\" ")RequestBody img0
            );



    @GET("get.php?kind=absensi")
    Call<PojoAbsensi> absensi_pegawai(@Query("id_pegawai") String id_pegawai
    );

    @GET("get.php?kind=update_branding")
    Call<PojoUpdatebranding> updatebranding_pegawai(@Query("id_pegawai") String id_pegawai
    );

    @GET("get.php?kind=issue")
    Call<PojoIssue> issue_pegawai(@Query("id_pegawai") String id_pegawai
    );

    @GET("get.php?")
    Call<PojoHistoryNotif> notification_all(@Query("kind") String kind
    );

    @GET("get.php?kind=toko")
    Call<PojoInfoToko> info_toko(@Query("kode_toko") String kode_toko
    );

    @FormUrlEncoded
    @POST("update.php?")
    Call<PojoResponseRowCount> update_infotoko(
            @Field("kind") String kind,
            @Field("id_toko") String id_toko,
            @Field("alamat_toko") String alamat_toko,
            @Field("desc") String desc,
            @Field("area") String area,
            @Field("tlp") String tlp,
            @Field("kota") String kota
    );

//    @Multipart
//    @POST("update.php?")
//    Call<PojoResponseRowCount> update_infotoko(
//            @Part("kind") RequestBody  kind,
//            @Part("id_toko") RequestBody  id_toko,
//            @Part("alamat_toko") RequestBody  alamat_toko,
//            @Part("desc") RequestBody  desc,
//            @Part("area") RequestBody  area,
//            @Part("tlp") RequestBody  tlp,
//            @Part("kota") RequestBody  kota
//    );
    @Multipart
    @POST("insert.php?")
    Call<PojoResponseRowCount> input_update_branding(
            @Part("kind") RequestBody  kind,
            @Part("nama_toko") RequestBody nama_toko,
            @Part("id_pegawai") RequestBody id_pegawai,
            @Part("latitude_update_branding") RequestBody latitude_update_branding,
            @Part("longitude_update_branding") RequestBody longitude_update_branding,
            @Part("keterangan_update_branding") RequestBody keterangan_update_branding,
            @Part("pesan_update_branding") RequestBody pesan_update_branding,

            @Part("img0\"; filename=\"img0.png\" ") RequestBody img0,
            @Part("img1\"; filename=\"img1.png\" ")RequestBody img1,
            @Part("img2\"; filename=\"img2.png\" ")RequestBody img2,
            @Part("img3\"; filename=\"img3.png\" ")RequestBody img3
    );

    @Multipart
    @POST("insert.php?")
    Call<PojoResponseRowCount> input_issue(
            @Part("kind") RequestBody  kind,
            @Part("nama_toko") RequestBody nama_toko,
            @Part("id_pegawai") RequestBody id_pegawai,
            @Part("nama_program") RequestBody nama_program,
            @Part("brand") RequestBody brand,
            @Part("tanggal_mulai_program") RequestBody tanggal_mulai_program,
            @Part("tanggal_akhir_program") RequestBody tanggal_akhir_program,

            @Part("latitude_issue") RequestBody latitude_issue,
            @Part("longitude_issue") RequestBody longitude_issue,
            @Part("pesan_issue") RequestBody pesan_issue,

            @Part("img0\"; filename=\"img0.png\" ") RequestBody img0,
            @Part("img1\"; filename=\"img1.png\" ")RequestBody img1,
            @Part("img2\"; filename=\"img2.png\" ")RequestBody img2,
            @Part("img3\"; filename=\"img3.png\" ")RequestBody img3
    );


    @FormUrlEncoded
    @POST("insert.php?")
    Call<PojoResponseRowCount> input_produk_baru(
            @Field("kind") String kind,
            @Field("serial_number_produk") String serial_number_produk,
            @Field("imei") String imei,
            @Field("imei2") String imei2,
            @Field("ESN") String esn,
            @Field("nama_produk") String nama_produk,
            @Field("warna_produk") String warna_produk,
            @Field("keterangan_produk") String keterangan_produk,
            @Field("kode_toko") String kode_toko,
            @Field("id_pegawai") String id_pegawai,
            @Field("latitude_produk_toko") String latitude_produk_toko,
            @Field("longitude_produk_toko") String longitude_produk_toko
    );
}
