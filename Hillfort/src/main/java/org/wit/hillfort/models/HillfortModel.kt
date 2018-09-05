package org.wit.hillfort.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
// Data model representing a hillfort location with tracking information

@Parcelize
// Represents a single hillfort with location and metadata
data class HillfortModel(var id: Long = 0,
// Represents a hillfort location with metadata for tracking user visits
                         var fbId: String = "",
// TODO: Validate rating is between 0 and 5
                         var title: String = "",
                         var description: String = "",
                         var addNotes: String = "",
                         var visited: Boolean = false,
                         var favourited: Boolean = false,
                         var rating:  Float = 0f,
                         var dateVisited: String = "",
                         var lat : Double = 0.0,
                         var lng: Double = 0.0,
                         var zoom: Float = 0f,
                         var address: String = "",
                         var firstImage: String = "",
                         var secondImage: String = "",
// Initialize hillfort with title, description, and location coordinates
                         var thirdImage: String = "",
// Elevation in meters, must be positive value
                         var fourthImage: String = "") : Parcelable

