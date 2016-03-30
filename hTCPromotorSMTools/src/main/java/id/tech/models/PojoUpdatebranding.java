package id.tech.models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macbook on 3/30/16.
 */
public class PojoUpdatebranding {
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

        @SerializedName("id_update_branding")
        @Expose
        private String idUpdateBranding;
        @SerializedName("nama_toko")
        @Expose
        private String namaToko;
        @SerializedName("id_pegawai")
        @Expose
        private String idPegawai;
        @SerializedName("pesan_update_branding")
        @Expose
        private String pesanUpdateBranding;
        @SerializedName("keterangan_update_branding")
        @Expose
        private String keteranganUpdateBranding;
        @SerializedName("latitude_update_branding")
        @Expose
        private String latitudeUpdateBranding;
        @SerializedName("longitude_update_branding")
        @Expose
        private String longitudeUpdateBranding;
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
         * The idUpdateBranding
         */
        public String getIdUpdateBranding() {
            return idUpdateBranding;
        }

        /**
         *
         * @param idUpdateBranding
         * The id_update_branding
         */
        public void setIdUpdateBranding(String idUpdateBranding) {
            this.idUpdateBranding = idUpdateBranding;
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
         * The pesanUpdateBranding
         */
        public String getPesanUpdateBranding() {
            return pesanUpdateBranding;
        }

        /**
         *
         * @param pesanUpdateBranding
         * The pesan_update_branding
         */
        public void setPesanUpdateBranding(String pesanUpdateBranding) {
            this.pesanUpdateBranding = pesanUpdateBranding;
        }

        /**
         *
         * @return
         * The keteranganUpdateBranding
         */
        public String getKeteranganUpdateBranding() {
            return keteranganUpdateBranding;
        }

        /**
         *
         * @param keteranganUpdateBranding
         * The keterangan_update_branding
         */
        public void setKeteranganUpdateBranding(String keteranganUpdateBranding) {
            this.keteranganUpdateBranding = keteranganUpdateBranding;
        }

        /**
         *
         * @return
         * The latitudeUpdateBranding
         */
        public String getLatitudeUpdateBranding() {
            return latitudeUpdateBranding;
        }

        /**
         *
         * @param latitudeUpdateBranding
         * The latitude_update_branding
         */
        public void setLatitudeUpdateBranding(String latitudeUpdateBranding) {
            this.latitudeUpdateBranding = latitudeUpdateBranding;
        }

        /**
         *
         * @return
         * The longitudeUpdateBranding
         */
        public String getLongitudeUpdateBranding() {
            return longitudeUpdateBranding;
        }

        /**
         *
         * @param longitudeUpdateBranding
         * The longitude_update_branding
         */
        public void setLongitudeUpdateBranding(String longitudeUpdateBranding) {
            this.longitudeUpdateBranding = longitudeUpdateBranding;
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

        /**
         *
         * @return
         * The images
         */


    }
}
