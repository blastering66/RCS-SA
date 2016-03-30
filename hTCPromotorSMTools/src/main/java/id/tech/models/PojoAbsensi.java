package id.tech.models;

/**
 * Created by macbook on 3/30/16.
 */
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PojoAbsensi {
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

        @SerializedName("id_absensi")
        @Expose
        private String idAbsensi;
        @SerializedName("jam_absensi")
        @Expose
        private String jamAbsensi;
        @SerializedName("tanggal_absensi")
        @Expose
        private String tanggalAbsensi;
        @SerializedName("kode_toko")
        @Expose
        private String kodeToko;
        @SerializedName("latitude_absensi")
        @Expose
        private String latitudeAbsensi;
        @SerializedName("longitude_absensi")
        @Expose
        private String longitudeAbsensi;
        @SerializedName("tipe_absensi")
        @Expose
        private String tipeAbsensi;
        @SerializedName("id_pegawai")
        @Expose
        private String idPegawai;
        @SerializedName("created_date")
        @Expose
        private String createdDate;
        @SerializedName("id_toko")
        @Expose
        private String idToko;
        @SerializedName("nama_toko")
        @Expose
        private String namaToko;
        @SerializedName("nama_pegawai")
        @Expose
        private String namaPegawai;
        @SerializedName("jabatan")
        @Expose
        private String jabatan;

        /**
         *
         * @return
         * The idAbsensi
         */
        public String getIdAbsensi() {
            return idAbsensi;
        }

        /**
         *
         * @param idAbsensi
         * The id_absensi
         */
        public void setIdAbsensi(String idAbsensi) {
            this.idAbsensi = idAbsensi;
        }

        /**
         *
         * @return
         * The jamAbsensi
         */
        public String getJamAbsensi() {
            return jamAbsensi;
        }

        /**
         *
         * @param jamAbsensi
         * The jam_absensi
         */
        public void setJamAbsensi(String jamAbsensi) {
            this.jamAbsensi = jamAbsensi;
        }

        /**
         *
         * @return
         * The tanggalAbsensi
         */
        public String getTanggalAbsensi() {
            return tanggalAbsensi;
        }

        /**
         *
         * @param tanggalAbsensi
         * The tanggal_absensi
         */
        public void setTanggalAbsensi(String tanggalAbsensi) {
            this.tanggalAbsensi = tanggalAbsensi;
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
         * The latitudeAbsensi
         */
        public String getLatitudeAbsensi() {
            return latitudeAbsensi;
        }

        /**
         *
         * @param latitudeAbsensi
         * The latitude_absensi
         */
        public void setLatitudeAbsensi(String latitudeAbsensi) {
            this.latitudeAbsensi = latitudeAbsensi;
        }

        /**
         *
         * @return
         * The longitudeAbsensi
         */
        public String getLongitudeAbsensi() {
            return longitudeAbsensi;
        }

        /**
         *
         * @param longitudeAbsensi
         * The longitude_absensi
         */
        public void setLongitudeAbsensi(String longitudeAbsensi) {
            this.longitudeAbsensi = longitudeAbsensi;
        }

        /**
         *
         * @return
         * The tipeAbsensi
         */
        public String getTipeAbsensi() {
            return tipeAbsensi;
        }

        /**
         *
         * @param tipeAbsensi
         * The tipe_absensi
         */
        public void setTipeAbsensi(String tipeAbsensi) {
            this.tipeAbsensi = tipeAbsensi;
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
