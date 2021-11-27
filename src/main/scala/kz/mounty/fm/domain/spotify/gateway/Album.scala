package kz.mounty.fm.domain.spotify.gateway

case class Album(albumType: String,
                 artists: Seq[Artist],
                 name: String,
                 images: Seq[Image])
