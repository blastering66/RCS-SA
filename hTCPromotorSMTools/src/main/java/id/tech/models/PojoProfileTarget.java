package id.tech.models;

/**
 * Created by macbook on 3/29/16.
 */
import android.support.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class PojoProfileTarget {
    @SerializedName("json_code")
    @Expose
    private String jsonCode;

    @Nullable
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

        @SerializedName("id_target")
        @Expose
        private String idTarget;
        @SerializedName("id_pegawai")
        @Expose
        private String idPegawai;
        @SerializedName("tanggal_mulai")
        @Expose
        private String tanggalMulai;
        @SerializedName("tanggal_selesai")
        @Expose
        private String tanggalSelesai;
        @SerializedName("jumlah_target")
        @Expose
        private String jumlahTarget;
        @SerializedName("created_date")
        @Expose
        private String createdDate;
        @SerializedName("nama_pegawai")
        @Expose
        private String namaPegawai;
        @SerializedName("email_pegawai")
        @Expose
        private String emailPegawai;
        @SerializedName("telepon_pegawai")
        @Expose
        private String teleponPegawai;
        @SerializedName("jabatan")
        @Expose
        private String jabatan;
        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("password")
        @Expose
        private Object password;
        @SerializedName("total_penjualan")
        @Expose
        private String totalPenjualan;

        /**
         *
         * @return
         * The idTarget
         */
        public String getIdTarget() {
            return idTarget;
        }

        /**
         *
         * @param idTarget
         * The id_target
         */
        public void setIdTarget(String idTarget) {
            this.idTarget = idTarget;
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
         * The tanggalMulai
         */
        public String getTanggalMulai() {
            return tanggalMulai;
        }

        /**
         *
         * @param tanggalMulai
         * The tanggal_mulai
         */
        public void setTanggalMulai(String tanggalMulai) {
            this.tanggalMulai = tanggalMulai;
        }

        /**
         *
         * @return
         * The tanggalSelesai
         */
        public String getTanggalSelesai() {
            return tanggalSelesai;
        }

        /**
         *
         * @param tanggalSelesai
         * The tanggal_selesai
         */
        public void setTanggalSelesai(String tanggalSelesai) {
            this.tanggalSelesai = tanggalSelesai;
        }

        /**
         *
         * @return
         * The jumlahTarget
         */
        public String getJumlahTarget() {
            return jumlahTarget;
        }

        /**
         *
         * @param jumlahTarget
         * The jumlah_target
         */
        public void setJumlahTarget(String jumlahTarget) {
            this.jumlahTarget = jumlahTarget;
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
         * The totalPenjualan
         */
        public String getTotalPenjualan() {
            return totalPenjualan;
        }

        /**
         *
         * @param totalPenjualan
         * The total_penjualan
         */
        public void setTotalPenjualan(String totalPenjualan) {
            this.totalPenjualan = totalPenjualan;
        }

    }
}
