package com.wcang.parcel;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by wcang on 20/01/2018.
 */

public class Vehicle implements Parcelable {
    public String model;
    public int year;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(model);
        dest.writeInt(year);
    }

    public static final Parcelable.Creator<Vehicle> CREATOR = new Parcelable.Creator<Vehicle>() {
        @Override
        public Vehicle createFromParcel(Parcel source) {
            return new Vehicle(source);
        }

        @Override
        public Vehicle[] newArray(int size) {
            return new Vehicle[size];
        }
    };

    private Vehicle(Parcel in) {
        model = in.readString();
        year = in.readInt();
    }

    public Vehicle() {
    }
}
