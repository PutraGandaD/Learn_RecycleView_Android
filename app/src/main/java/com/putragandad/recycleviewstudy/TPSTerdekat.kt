package com.putragandad.recycleviewstudy

import android.os.Parcel
import android.os.Parcelable

data class TPSTerdekat(val image: Int,
    val namaTPS: String,
    val jarakTPS: String,
    val alamatTPS: String,
    val jenisTPS: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(namaTPS)
        parcel.writeString(jarakTPS)
        parcel.writeString(alamatTPS)
        parcel.writeString(jenisTPS)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TPSTerdekat> {
        override fun createFromParcel(parcel: Parcel): TPSTerdekat {
            return TPSTerdekat(parcel)
        }

        override fun newArray(size: Int): Array<TPSTerdekat?> {
            return arrayOfNulls(size)
        }
    }
}
