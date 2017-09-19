package com.ram.kotlin.samples.retrofit.data.kotlin

/**
 * Created by ramesh on 14/9/17.
 */

data class PostData(
		var status: String,// ok
		var post: Post
)

data class Post(
		var id: Int,// 2065
		var type: String,// post
		var slug: String,// a-physical-relationship-isnt-just-for-other-people
		var url: String,// http://10.5.6.103/a-physical-relationship-isnt-just-for-other-people/
		var status: String,// publish
		var title: String,// A Physical Relationship Isn’t Just For Other People
		var title_plain: String,// A Physical Relationship Isn’t Just For Other People
		var content: String,// e time to get there, but with the right partner and open communication it can happen! Read on to find out about ways to have the healthy love life […]
		var date: String,// 2017-07-06 16:40:19
		var modified: String,// 2017-07-06 16:41:48
		var categories: List<Category>,
		var tags: List<Tag>,
		var author: Author,
		var comments: List<Comment>,
		var attachments: List<Attachment>,
		var comment_count: Int,// 119
		var comment_status: String,// open
		var thumbnail: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914.jpg
		var custom_fields: Custom_fields,
		var thumbnail_size: String,// post-thumbnail
		var thumbnail_images: Thumbnail_images
)

data class Category(
		var id: Int,// 13
		var slug: String,// dating
		var title: String,// Dating
		var description: String,//
		var parent: Int,// 0
		var post_count: Int// 12
)

data class Custom_fields(
		var slide_template: List<String>,
		var sbg_selected_sidebar: List<String>,
		var sbg_selected_sidebar_replacement: List<String>
)

data class Comment(
		var id: Int,// 125872
		var name: String,// briblo201982
		var url: String,//
		var date: String,// 2017-07-06 16:58:06
		var content: String,// All it takes is patience, communication, and understanding
		var parent: Int,// 0
		var author: Author,
		var replies: List<Reply>
)

data class Reply(
		var id: Int,// 14
		var slug: String,// general
		var title: String,// General
		var description: String,//
		var parent: Int,// 0
		var post_count: Int// 21
)

data class Author(
		var id: Int,// 7922
		var slug: String,// briblo201982
		var name: String,// briblo201982
		var first_name: String,//
		var last_name: String,//
		var nickname: String,// briblo201982
		var url: String,// http://10.5.6.103/wp-content/uploads/avatars/7922/59558f5ad58d0-bpthumb.jpg
		var description: String//
)

data class Attachment(
		var id: Int,// 2066
		var url: String,// http://www.specialbridge.com/wp-content/uploads/2017/07/physical-disability.jpg
		var slug: String,// physical-disability
		var title: String,// physical-disability
		var description: String,//
		var caption: String,//
		var parent: Int,// 2065
		var mime_type: String,// image/jpeg
		var images: Images
)

data class Images(
		var full: Full,
		//var thumbnail: Thumbnail,
		var medium: Medium,
		var medium_large: Medium_large,
		var large: Large,
		//var post-thumbnail: Post-thumbnail,
		var blog_carousel: Blog_carousel
		//var bbwall-url-preview-thumb: Bbwall-url-preview-thumb
)

data class Medium_large(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914.jpg
		var width: Int,// 620
		var height: Int// 331
)

data class Blog_carousel(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914-310x177.jpg
		var width: Int,// 310
		var height: Int// 177
)

data class Large(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914.jpg
		var width: Int,// 620
		var height: Int// 331
)



data class Thumbnail_images(
		var full: Full,
		//var thumbnail: Thumbnail,
		var medium: Medium,
		var medium_large: Medium_large,
		var large: Large,
		//var post-thumbnail: Post-thumbnail,
		var blog_carousel: Blog_carousel
		//var bbwall-url-preview-thumb: Bbwall-url-preview-thumb
)


data class Full(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914.jpg
		var width: Int,// 620
		var height: Int// 331
)





data class Thumbnail(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914-150x150.jpg
		var width: Int,// 150
		var height: Int// 150
)

data class Medium(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914-300x160.jpg
		var width: Int,// 300
		var height: Int// 160
)

data class Tag(
		var id: Int,// 14
		var slug: String,// general
		var title: String,// General
		var description: String,//
		var parent: Int,// 0
		var post_count: Int// 21
)