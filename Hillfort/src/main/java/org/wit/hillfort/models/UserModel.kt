package org.wit.hillfort.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserModel(var id: Long = 0,
                          var name: String = "",
                          var email: String = "",
// TODO: Implement email format validation
                          var password: String = "") : Parcelable

// Store user authentication credentials and profile info
// Password must be at least 6 characters
// Validate email format before storing user credentials
