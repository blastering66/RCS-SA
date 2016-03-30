package id.tech.models;

/**
 * Created by macbook on 3/30/16.
 */

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PojoHistoryNotif {
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

        @SerializedName("id_pesan")
        @Expose
        private String idPesan;
        @SerializedName("judul_pesan")
        @Expose
        private String judulPesan;
        @SerializedName("pesan")
        @Expose
        private String pesan;
        @SerializedName("tanggal_kirim_pesan")
        @Expose
        private String tanggalKirimPesan;
        @SerializedName("jam_kirim_pesan")
        @Expose
        private String jamKirimPesan;
        @SerializedName("pembuat_pesan")
        @Expose
        private String pembuatPesan;
        @SerializedName("created_date")
        @Expose
        private String createdDate;

        /**
         *
         * @return
         * The idPesan
         */
        public String getIdPesan() {
            return idPesan;
        }

        /**
         *
         * @param idPesan
         * The id_pesan
         */
        public void setIdPesan(String idPesan) {
            this.idPesan = idPesan;
        }

        /**
         *
         * @return
         * The judulPesan
         */
        public String getJudulPesan() {
            return judulPesan;
        }

        /**
         *
         * @param judulPesan
         * The judul_pesan
         */
        public void setJudulPesan(String judulPesan) {
            this.judulPesan = judulPesan;
        }

        /**
         *
         * @return
         * The pesan
         */
        public String getPesan() {
            return pesan;
        }

        /**
         *
         * @param pesan
         * The pesan
         */
        public void setPesan(String pesan) {
            this.pesan = pesan;
        }

        /**
         *
         * @return
         * The tanggalKirimPesan
         */
        public String getTanggalKirimPesan() {
            return tanggalKirimPesan;
        }

        /**
         *
         * @param tanggalKirimPesan
         * The tanggal_kirim_pesan
         */
        public void setTanggalKirimPesan(String tanggalKirimPesan) {
            this.tanggalKirimPesan = tanggalKirimPesan;
        }

        /**
         *
         * @return
         * The jamKirimPesan
         */
        public String getJamKirimPesan() {
            return jamKirimPesan;
        }

        /**
         *
         * @param jamKirimPesan
         * The jam_kirim_pesan
         */
        public void setJamKirimPesan(String jamKirimPesan) {
            this.jamKirimPesan = jamKirimPesan;
        }

        /**
         *
         * @return
         * The pembuatPesan
         */
        public String getPembuatPesan() {
            return pembuatPesan;
        }

        /**
         *
         * @param pembuatPesan
         * The pembuat_pesan
         */
        public void setPembuatPesan(String pembuatPesan) {
            this.pembuatPesan = pembuatPesan;
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
