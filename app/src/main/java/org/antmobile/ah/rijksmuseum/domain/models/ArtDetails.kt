package org.antmobile.ah.rijksmuseum.domain.models

data class ArtDetails(
    val id: String,
    val title: String,
    val description: String,
    val imageUrl: String? = null,
)
