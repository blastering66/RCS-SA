package id.tech.models;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by macbook on 3/29/16.
 */
public class PojoStockStore {
    @SerializedName("json_code")
    @Expose
    private String jsonCode;
    @SerializedName("data")
    @Expose
    private List<Datum> data = new ArrayList<Datum>();

    /**
     *
     * @return
     * The jsonCode
     */
    public String getJsonCode() {
        return jsonCode;
    }

    /**
     *
     * @param jsonCode
     * The json_code
     */
    public void setJsonCode(String jsonCode) {
        this.jsonCode = jsonCode;
    }

    /**
     *
     * @return
     * The data
     */
    public List<Datum> getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(List<Datum> data) {
        this.data = data;
    }

    public class Datum {

        @SerializedName("id_produk_toko")
        @Expose
        private String idProdukToko;
        @SerializedName("kode_toko")
        @Expose
        private String kodeToko;
        @SerializedName("imei")
        @Expose
        private String imei;
        @SerializedName("tanggal_check")
        @Expose
        private String tanggalCheck;
        @SerializedName("jam_check")
        @Expose
        private String jamCheck;
        @SerializedName("status_produk")
        @Expose
        private String statusProduk;
        @SerializedName("id_pegawai")
        @Expose
        private String idPegawai;
        @SerializedName("latitude_produk_toko")
        @Expose
        private String latitudeProdukToko;
        @SerializedName("longitude_produk_toko")
        @Expose
        private String longitudeProdukToko;
        @SerializedName("created_date")
        @Expose
        private String createdDate;
        @SerializedName("id_toko")
        @Expose
        private String idToko;
        @SerializedName("nama_toko")
        @Expose
        private String namaToko;
        @SerializedName("kota")
        @Expose
        private String kota;
        @SerializedName("serial_number_produk")
        @Expose
        private String serialNumberProduk;
        @SerializedName("id_produk")
        @Expose
        private String idProduk;
        @SerializedName("imei2")
        @Expose
        private String imei2;
        @SerializedName("nama_produk")
        @Expose
        private String namaProduk;
        @SerializedName("warna_produk")
        @Expose
        private String warnaProduk;
        @SerializedName("keterangan_produk")
        @Expose
        private String keteranganProduk;
        @SerializedName("nama_pegawai")
        @Expose
        private String namaPegawai;
        @SerializedName("jabatan")
        @Expose
        private String jabatan;
        @SerializedName("images")
        @Expose
        private String images;

        /**
         *
         * @return
         * The idProdukToko
         */
        public String getIdProdukToko() {
            return idProdukToko;
        }

        /**
         *
         * @param idProdukToko
         * The id_produk_toko
         */
        public void setIdProdukToko(String idProdukToko) {
            this.idProdukToko = idProdukToko;
        }

        /**
         *
         * @return
         * The kodeToko
         */
        public String getKodeToko() {
            return kodeToko;
        }

        /**
         *
         * @param kodeToko
         * The kode_toko
         */
        public void setKodeToko(String kodeToko) {
            this.kodeToko = kodeToko;
        }

        /**
         *
         * @return
         * The imei
         */
        public String getImei() {
            return imei;
        }

        /**
         *
         * @param imei
         * The imei
         */
        public void setImei(String imei) {
            this.imei = imei;
        }

        /**
         *
         * @return
         * The tanggalCheck
         */
        public String getTanggalCheck() {
            return tanggalCheck;
        }

        /**
         *
         * @param tanggalCheck
         * The tanggal_check
         */
        public void setTanggalCheck(String tanggalCheck) {
            this.tanggalCheck = tanggalCheck;
        }

        /**
         *
         * @return
         * The jamCheck
         */
        public String getJamCheck() {
            return jamCheck;
        }

        /**
         *
         * @param jamCheck
         * The jam_check
         */
        public void setJamCheck(String jamCheck) {
            this.jamCheck = jamCheck;
        }

        /**
         *
         * @return
         * The statusProduk
         */
        public String getStatusProduk() {
            return statusProduk;
        }

        /**
         *
         * @param statusProduk
         * The status_produk
         */
        public void setStatusProduk(String statusProduk) {
            this.statusProduk = statusProduk;
        }

        /**
         *
         * @return
         * The idPegawai
         */
        public String getIdPegawai() {
            return idPegawai;
        }

        /**
         *
         * @param idPegawai
         * The id_pegawai
         */
        public void setIdPegawai(String idPegawai) {
            this.idPegawai = idPegawai;
        }

        /**
         *
         * @return
         * The latitudeProdukToko
         */
        public String getLatitudeProdukToko() {
            return latitudeProdukToko;
        }

        /**
         *
         * @param latitudeProdukToko
         * The latitude_produk_toko
         */
        public void setLatitudeProdukToko(String latitudeProdukToko) {
            this.latitudeProdukToko = latitudeProdukToko;
        }

        /**
         *
         * @return
         * The longitudeProdukToko
         */
        public String getLongitudeProdukToko() {
            return longitudeProdukToko;
        }

        /**
         *
         * @param longitudeProdukToko
         * The longitude_produk_toko
         */
        public void setLongitudeProdukToko(String longitudeProdukToko) {
            this.longitudeProdukToko = longitudeProdukToko;
        }

        /**
         *
         * @return
         * The createdDate
         */
        public String getCreatedDate() {
            return createdDate;
        }

        /**
         *
         * @param createdDate
         * The created_date
         */
        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        /**
         *
         * @return
         * The idToko
         */
        public String getIdToko() {
            return idToko;
        }

        /**
         *
         * @param idToko
         * The id_toko
         */
        public void setIdToko(String idToko) {
            this.idToko = idToko;
        }

        /**
         *
         * @return
         * The namaToko
         */
        public String getNamaToko() {
            return namaToko;
        }

        /**
         *
         * @param namaToko
         * The nama_toko
         */
        public void setNamaToko(String namaToko) {
            this.namaToko = namaToko;
        }

        /**
         *
         * @return
         * The kota
         */
        public String getKota() {
            return kota;
        }

        /**
         *
         * @param kota
         * The kota
         */
        public void setKota(String kota) {
            this.kota = kota;
        }

        /**
         *
         * @return
         * The serialNumberProduk
         */
        public String getSerialNumberProduk() {
            return serialNumberProduk;
        }

        /**
         *
         * @param serialNumberProduk
         * The serial_number_produk
         */
        public void setSerialNumberProduk(String serialNumberProduk) {
            this.serialNumberProduk = serialNumberProduk;
        }

        /**
         *
         * @return
         * The idProduk
         */
        public String getIdProduk() {
            return idProduk;
        }

        /**
         *
         * @param idProduk
         * The id_produk
         */
        public void setIdProduk(String idProduk) {
            this.idProduk = idProduk;
        }

        /**
         *
         * @return
         * The imei2
         */
        public String getImei2() {
            return imei2;
        }

        /**
         *
         * @param imei2
         * The imei2
         */
        public void setImei2(String imei2) {
            this.imei2 = imei2;
        }

        /**
         *
         * @return
         * The namaProduk
         */
        public String getNamaProduk() {
            return namaProduk;
        }

        /**
         *
         * @param namaProduk
         * The nama_produk
         */
        public void setNamaProduk(String namaProduk) {
            this.namaProduk = namaProduk;
        }

        /**
         *
         * @return
         * The warnaProduk
         */
        public String getWarnaProduk() {
            return warnaProduk;
        }

        /**
         *
         * @param warnaProduk
         * The warna_produk
         */
        public void setWarnaProduk(String warnaProduk) {
            this.warnaProduk = warnaProduk;
        }

        /**
         *
         * @return
         * The keteranganProduk
         */
        public String getKeteranganProduk() {
            return keteranganProduk;
        }

        /**
         *
         * @param keteranganProduk
         * The keterangan_produk
         */
        public void setKeteranganProduk(String keteranganProduk) {
            this.keteranganProduk = keteranganProduk;
        }

        /**
         *
         * @return
         * The namaPegawai
         */
        public String getNamaPegawai() {
            return namaPegawai;
        }

        /**
         *
         * @param namaPegawai
         * The nama_pegawai
         */
        public void setNamaPegawai(String namaPegawai) {
            this.namaPegawai = namaPegawai;
        }

        /**
         *
         * @return
         * The jabatan
         */
        public String getJabatan() {
            return jabatan;
        }

        /**
         *
         * @param jabatan
         * The jabatan
         */
        public void setJabatan(String jabatan) {
            this.jabatan = jabatan;
        }

        /**
         *
         * @return
         * The images
         */
        public String getImages() {
            return images;
        }

        /**
         *
         * @param images
         * The images
         */
        public void setImages(String images) {
            this.images = images;
        }

    }
}
