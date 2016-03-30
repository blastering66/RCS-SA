package id.tech.models;

/**
 * Created by macbook on 3/30/16.
 */

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PojoIssue {
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

        @SerializedName("id_issue")
        @Expose
        private String idIssue;
        @SerializedName("nama_toko")
        @Expose
        private String namaToko;
        @SerializedName("id_pegawai")
        @Expose
        private String idPegawai;
        @SerializedName("nama_program")
        @Expose
        private String namaProgram;
        @SerializedName("brand")
        @Expose
        private String brand;
        @SerializedName("tanggal_mulai_program")
        @Expose
        private String tanggalMulaiProgram;
        @SerializedName("tanggal_akhir_program")
        @Expose
        private String tanggalAkhirProgram;
        @SerializedName("pesan_issue")
        @Expose
        private String pesanIssue;
        @SerializedName("latitude_issue")
        @Expose
        private String latitudeIssue;
        @SerializedName("longitude_issue")
        @Expose
        private String longitudeIssue;
        @SerializedName("created_date")
        @Expose
        private String createdDate;
        @SerializedName("tanggal_buat")
        @Expose
        private String tanggalBuat;
        @SerializedName("jam_buat")
        @Expose
        private String jamBuat;
        @SerializedName("nama_pegawai")
        @Expose
        private String namaPegawai;
        @SerializedName("jabatan")
        @Expose
        private String jabatan;

        /**
         *
         * @return
         * The idIssue
         */
        public String getIdIssue() {
            return idIssue;
        }

        /**
         *
         * @param idIssue
         * The id_issue
         */
        public void setIdIssue(String idIssue) {
            this.idIssue = idIssue;
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
         * The namaProgram
         */
        public String getNamaProgram() {
            return namaProgram;
        }

        /**
         *
         * @param namaProgram
         * The nama_program
         */
        public void setNamaProgram(String namaProgram) {
            this.namaProgram = namaProgram;
        }

        /**
         *
         * @return
         * The brand
         */
        public String getBrand() {
            return brand;
        }

        /**
         *
         * @param brand
         * The brand
         */
        public void setBrand(String brand) {
            this.brand = brand;
        }

        /**
         *
         * @return
         * The tanggalMulaiProgram
         */
        public String getTanggalMulaiProgram() {
            return tanggalMulaiProgram;
        }

        /**
         *
         * @param tanggalMulaiProgram
         * The tanggal_mulai_program
         */
        public void setTanggalMulaiProgram(String tanggalMulaiProgram) {
            this.tanggalMulaiProgram = tanggalMulaiProgram;
        }

        /**
         *
         * @return
         * The tanggalAkhirProgram
         */
        public String getTanggalAkhirProgram() {
            return tanggalAkhirProgram;
        }

        /**
         *
         * @param tanggalAkhirProgram
         * The tanggal_akhir_program
         */
        public void setTanggalAkhirProgram(String tanggalAkhirProgram) {
            this.tanggalAkhirProgram = tanggalAkhirProgram;
        }

        /**
         *
         * @return
         * The pesanIssue
         */
        public String getPesanIssue() {
            return pesanIssue;
        }

        /**
         *
         * @param pesanIssue
         * The pesan_issue
         */
        public void setPesanIssue(String pesanIssue) {
            this.pesanIssue = pesanIssue;
        }

        /**
         *
         * @return
         * The latitudeIssue
         */
        public String getLatitudeIssue() {
            return latitudeIssue;
        }

        /**
         *
         * @param latitudeIssue
         * The latitude_issue
         */
        public void setLatitudeIssue(String latitudeIssue) {
            this.latitudeIssue = latitudeIssue;
        }

        /**
         *
         * @return
         * The longitudeIssue
         */
        public String getLongitudeIssue() {
            return longitudeIssue;
        }

        /**
         *
         * @param longitudeIssue
         * The longitude_issue
         */
        public void setLongitudeIssue(String longitudeIssue) {
            this.longitudeIssue = longitudeIssue;
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
         * The tanggalBuat
         */
        public String getTanggalBuat() {
            return tanggalBuat;
        }

        /**
         *
         * @param tanggalBuat
         * The tanggal_buat
         */
        public void setTanggalBuat(String tanggalBuat) {
            this.tanggalBuat = tanggalBuat;
        }

        /**
         *
         * @return
         * The jamBuat
         */
        public String getJamBuat() {
            return jamBuat;
        }

        /**
         *
         * @param jamBuat
         * The jam_buat
         */
        public void setJamBuat(String jamBuat) {
            this.jamBuat = jamBuat;
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

    }
}
