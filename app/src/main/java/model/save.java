package model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class save implements Parcelable {

    public static ArrayList<user> savedata = new ArrayList<>();

    public save(String nama, String umur, String alamat) {

    }
    protected save(Parcel in) {
    }

    public static final Creator<save> CREATOR = new Creator<save>() {
        @Override
        public save createFromParcel(Parcel in) {
            return new save(in);
        }

        @Override
        public save[] newArray(int size) {
            return new save[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
