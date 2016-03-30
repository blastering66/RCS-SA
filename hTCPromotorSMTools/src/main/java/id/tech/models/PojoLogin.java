package id.tech.models;

/**
 * Created by macbook on 3/28/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PojoLogin {
    @SerializedName("json_code")
    @Expose
    private String jsonCode;
    @SerializedName("message")
    @Expose
    private String message;
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
     * The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(String message) {
        this.message = message;
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
        @SerializedName("created_date")
        @Expose
        private String createdDate;

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
