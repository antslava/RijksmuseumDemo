package org.antmobile.ah.rijksmuseum.data.remote.entities.details

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArtDetailsResponse(
    var artObject: ArtDetailsEntity
)
