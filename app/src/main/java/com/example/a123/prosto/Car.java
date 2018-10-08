package com.example.a123.prosto;

import android.os.Parcel;
import android.os.Parcelable;

public class Car implements Parcelable {
    public String name;
    public String marka;


    protected Car(Parcel in) {
        name = in.readString();
        marka = in.readString();
    }

    Car(String name, String marka) {
        this.name = name;
        this.marka = marka;
    }

    public static final Creator<Car> CREATOR = new Creator<Car>() {
        @Override
        public Car createFromParcel(Parcel in) {
            String name = in.readString();
            String marka = in.readString();
            return new Car(name, marka);
        }

        @Override
        public Car[] newArray(int size) {
            return new Car[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(marka);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
