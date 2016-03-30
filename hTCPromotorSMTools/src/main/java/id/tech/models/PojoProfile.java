package id.tech.models;

/**
 * Created by macbook on 3/29/16.
 */
import android.support.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class PojoProfile {

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

        @SerializedName("id_pegawai")
        @Expose
        private String idPegawai;
        @SerializedName("nama_pegawai")
        @Expose
        private String namaPegawai;
        @SerializedName("telepon_pegawai")
        @Expose
        private String teleponPegawai;
        @SerializedName("email_pegawai")
        @Expose
        private String emailPegawai;
        @SerializedName("jabatan")
        @Expose
        private String jabatan;
        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("password")
        @Expose
        private Object password;
        @SerializedName("created_date")
        @Expose
        private String createdDate;
        @SerializedName("all_data")
        @Expose
        private Object allData;

        @Nullable
        @SerializedName("images")
        @Expose
        private List<Image> images = new ArrayList<Image>();

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
         * The teleponPegawai
         */
        public String getTeleponPegawai() {
            return teleponPegawai;
        }

        /**
         *
         * @param teleponPegawai
         * The telepon_pegawai
         */
        public void setTeleponPegawai(String teleponPegawai) {
            this.teleponPegawai = teleponPegawai;
        }

        /**
         *
         * @return
         * The emailPegawai
         */
        public String getEmailPegawai() {
            return emailPegawai;
        }

        /**
         *
         * @param emailPegawai
         * The email_pegawai
         */
        public void setEmailPegawai(String emailPegawai) {
            this.emailPegawai = emailPegawai;
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
         * The username
         */
        public String getUsername() {
            return username;
        }

        /**
         *
         * @param username
         * The username
         */
        public void setUsername(String username) {
            this.username = username;
        }

        /**
         *
         * @return
         * The password
         */
        public Object getPassword() {
            return password;
        }

        /**
         *
         * @param password
         * The password
         */
        public void setPassword(Object password) {
            this.password = password;
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
