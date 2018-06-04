package neo.com.demo_1.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Student implements Parcelable{
    private String sFullName;
    private int iOld;

    public Student() {
    }

    /**
     * Instantiates a new Student.
     *
     * @param sFullName the s full name
     * @param iOld      the old
     */
    public Student(String sFullName, int iOld) {
        this.sFullName = sFullName;
        this.iOld = iOld;
    }

    public String getsFullName() {
        return sFullName;
    }

    public void setsFullName(String sFullName) {
        this.sFullName = sFullName;
    }

    public int getiOld() {
        return iOld;
    }

    public void setiOld(int iOld) {
        this.iOld = iOld;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
