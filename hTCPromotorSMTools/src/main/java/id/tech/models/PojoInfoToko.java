package id.tech.models;

/**
 * Created by macbook on 3/30/16.
 */

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PojoInfoToko {
    @SerializedName("json_code")
    @Expose
    private String jsonCode;
    @SerializedName("data")
    @Expose
    private Data data;

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
    public Data getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(Data data) {
        this.data = data;
    }


    public class Data {

        @SerializedName("id_toko")
        @Expose
        private String idToko;
        @SerializedName("nama_toko")
        @Expose
        private String namaToko;
        @SerializedName("alamat_toko")
        @Expose
        private String alamatToko;
        @SerializedName("telepon_toko")
        @Expose
        private String teleponToko;
        @SerializedName("email_toko")
        @Expose
        private String emailToko;
        @SerializedName("tlp")
        @Expose
        private String tlp;
        @SerializedName("kode_toko")
        @Expose
        private String kodeToko;
        @SerializedName("kota")
        @Expose
        private String kota;
        @SerializedName("created_date")
        @Expose
        private String createdDate;
        @SerializedName("all_data")
        @Expose
        private Object allData;
        @SerializedName("images")
        @Expose
        private List<Image> images = new ArrayList<Image>();

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
         * The alamatToko
         */
        public String getAlamatToko() {
            return alamatToko;
        }

        /**
         *
         * @param alamatToko
         * The alamat_toko
         */
        public void setAlamatToko(String alamatToko) {
            this.alamatToko = alamatToko;
        }

        /**
         *
         * @return
         * The teleponToko
         */
        public String getTeleponToko() {
            return teleponToko;
        }

        /**
         *
         * @param teleponToko
         * The telepon_toko
         */
        public void setTeleponToko(String teleponToko) {
            this.teleponToko = teleponToko;
        }

        /**
         *
         * @return
         * The emailToko
         */
        public String getEmailToko() {
            return emailToko;
        }

        /**
         *
         * @param emailToko
         * The email_toko
         */
        public void setEmailToko(String emailToko) {
            this.emailToko = emailToko;
        }

        /**
         *
         * @return
         * The tlp
         */
        public String getTlp() {
            return tlp;
        }

        /**
         *
         * @param tlp
         * The tlp
         */
        public void setTlp(String tlp) {
            this.tlp = tlp;
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
         * The allData
         */
        public Object getAllData() {
            return allData;
        }

        /**
         *
         * @param allData
         * The all_data
         */
        public void setAllData(Object allData) {
            this.allData = allData;
        }

        /**
         *
         * @return
         * The images
         */
        public List<Image> getImages() {
            return images;
        }

        /**
         *
         * @param images
         * The images
         */
        public void setImages(List<Image> images) {
            this.images = images;
        }

    }

    public class Image {

        @SerializedName("id_image")
        @Expose
        private String idImage;
        @SerializedName("nama_image")
        @Expose
        private String namaImage;
        @SerializedName("deskripsi")
        @Expose
        private String deskripsi;
        @SerializedName("tipe_image")
        @Expose
        private String tipeImage;
        @SerializedName("id_tipe_image")
        @Expose
        private String idTipeImage;
        @SerializedName("created_date")
        @Expose
        private String createdDate;

        /**
         *
         * @return
         * The idImage
         */
        public String getIdImage() {
            return idImage;
        }

        /**
         *
         * @param idImage
         * The id_image
         */
        public void setIdImage(String idImage) {
            this.idImage = idImage;
        }

        /**
         *
         * @return
         * The namaImage
         */
        public String getNamaImage() {
            return namaImage;
        }

        /**
         *
         * @param namaImage
         * The nama_image
         */
        public void setNamaImage(String namaImage) {
            this.namaImage = namaImage;
        }

        /**
         *
         * @return
         * The deskripsi
         */
        public String getDeskripsi() {
            return deskripsi;
        }

        /**
         *
         * @param deskripsi
         * The deskripsi
         */
        public void setDeskripsi(String deskripsi) {
            this.deskripsi = deskripsi;
        }

        /**
         *
         * @return
         * The tipeImage
         */
        public String getTipeImage() {
            return tipeImage;
        }

        /**
         *
         * @param tipeImage
         * The tipe_image
         */
        public void setTipeImage(String tipeImage) {
            this.tipeImage = tipeImage;
        }

        /**
         *
         * @return
         * The idTipeImage
         */
        public String getIdTipeImage() {
            return idTipeImage;
        }

        /**
         *
         * @param idTipeImage
         * The id_tipe_image
         */
        public void setIdTipeImage(String idTipeImage) {
            this.idTipeImage = idTipeImage;
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

    }
}
