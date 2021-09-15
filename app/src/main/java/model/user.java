package model;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;

import java.util.ArrayList;

public class user implements Parcelable {

    private String nama, alamat, umur;

    public user(TextView nama, TextView alamat, TextView umur){
        this.nama = "";
        this.umur = "";
        this.alamat = "";
    }

    public user(String nama, String alamat, String umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public static Creator<user> getCREATOR() {
        return CREATOR;
    }

    protected user(Parcel in) {
        nama = in.readString();
        umur = in.readString();
        alamat = in.readString();
    }

    public static final Creator<user> CREATOR = new Creator<user>() {
        @Override
        public user createFromParcel(Parcel in) {
            return new user(in);
        }

        @Override
        public user[] newArray(int size) {
            return new user[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(umur);
        dest.writeString(alamat);
    }
}
