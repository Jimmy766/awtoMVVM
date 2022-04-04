package jn.awto.jokemvvm.domain.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class JokeFlag(
    @SerializedName("nsfw")
    @Expose
    val nsfw: Boolean?,
    @SerializedName("religious")
    @Expose
    val religious: Boolean?,
    @SerializedName("political")
    @Expose
    val political: Boolean?,
    @SerializedName("racist")
    @Expose
    val racist: Boolean?,
    @SerializedName("sexist")
    @Expose
    val sexist: Boolean?,
    @SerializedName("explicit")
    @Expose
    val explicit: Boolean?
)
