package com.example.libdrew.services

data class GalleryTagResponse(
    val `data`: Data,
    val status: Int,
    val success: Boolean
) {
    data class Data(
        val featured: String,
        val galleries: List<Gallery>,
        val tags: List<Tag>
    ) {
        data class Gallery(
            val description: String,
            val id: Int,
            val name: String,
            val topPost: TopPost
        ) {
            data class TopPost(
                val account_id: Int,
                val account_url: String,
                val ad_type: Int,
                val ad_url: String,
                val comment_count: Int,
                val cover: String,
                val cover_height: Int,
                val cover_width: Int,
                val datetime: Int,
                val description: Any,
                val downs: Int,
                val favorite: Any,
                val favorite_count: Int,
                val id: String,
                val images: List<Image>,
                val images_count: Int,
                val in_gallery: Boolean,
                val in_most_viral: Boolean,
                val include_album_ads: Boolean,
                val is_ad: Boolean,
                val is_album: Boolean,
                val layout: String,
                val link: String,
                val nsfw: Boolean,
                val points: Int,
                val privacy: String,
                val score: Int,
                val section: String,
                val tags: List<Tag>,
                val title: String,
                val topic: Any,
                val topic_id: Any,
                val ups: Int,
                val views: Int,
                val vote: Any
            ) {
                data class Image(
                    val account_id: Any,
                    val account_url: Any,
                    val ad_type: Int,
                    val ad_url: String,
                    val animated: Boolean,
                    val bandwidth: Long,
                    val comment_count: Any,
                    val datetime: Int,
                    val description: String,
                    val downs: Any,
                    val edited: String,
                    val favorite: Boolean,
                    val favorite_count: Any,
                    val has_sound: Boolean,
                    val height: Int,
                    val id: String,
                    val in_gallery: Boolean,
                    val in_most_viral: Boolean,
                    val is_ad: Boolean,
                    val link: String,
                    val nsfw: Any,
                    val points: Any,
                    val score: Any,
                    val section: Any,
                    val size: Int,
                    val tags: List<Any>,
                    val title: Any,
                    val type: String,
                    val ups: Any,
                    val views: Int,
                    val vote: Any,
                    val width: Int
                )

                data class Tag(
                    val accent: String,
                    val background_hash: String,
                    val background_is_animated: Boolean,
                    val description: String,
                    val description_annotations: DescriptionAnnotations,
                    val display_name: String,
                    val followers: Int,
                    val following: Boolean,
                    val is_promoted: Boolean,
                    val is_whitelisted: Boolean,
                    val logo_destination_url: Any,
                    val logo_hash: Any,
                    val name: String,
                    val thumbnail_hash: Any,
                    val thumbnail_is_animated: Boolean,
                    val total_items: Int
                ) {
                    class DescriptionAnnotations
                }
            }
        }

        data class Tag(
            val accent: String,
            val background_hash: String,
            val background_is_animated: Boolean,
            val description: String,
            val description_annotations: DescriptionAnnotations,
            val display_name: String,
            val followers: Int,
            val following: Boolean,
            val is_promoted: Boolean,
            val is_whitelisted: Boolean,
            val logo_destination_url: Any,
            val logo_hash: Any,
            val name: String,
            val thumbnail_hash: String,
            val thumbnail_is_animated: Boolean,
            val total_items: Int
        ) {
            class DescriptionAnnotations
        }
    }
}