package kz.mounty.fm.domain.playlist

import kz.mounty.fm.domain.DomainEntity

case class Playlist(id: String,
                    name: String,
                    imageUrl: String,
                    tracksTotalAmount: Int,
                    isPublic: Boolean,
                    spotifyUri: String) extends DomainEntity
