package com.wahidabd.dicodingcompose.data.source

import com.wahidabd.dicodingcompose.data.model.MyProfile
import com.wahidabd.dicodingcompose.R

object ProfileItem {
    val data = listOf(
        MyProfile(
            Id = 1,
            Icon = R.drawable.captain,
            Label = "Edit Profile",
            Route = "/"
        ),
        MyProfile(
            Id = 2,
            Icon = R.drawable.bell_icon,
            Label = "Notifications",
            Route = "/"
        ),
        MyProfile(
            Id = 3,
            Icon = R.drawable.shield,
            Label = "Security",
            Route = "/"
        ),
        MyProfile(
            Id = 4,
            Icon = R.drawable.earth_asia,
            Label = "Language",
            Route = "/"
        ),
        MyProfile(
            Id = 5,
            Icon = R.drawable.share_nodes,
            Label = "Invite Friends",
            Route = "/"
        )
    )
}