package jn.awto.jokemvvm.domain.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class JokeFlags(
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
){
    // override toString to print the flags in a readable format without the null values , without commas and without variable names
    fun format(): String {

        return "${formatVariableName(nsfw,"nsfw")} "+
                "${formatVariableName(religious,"religious")} "+
                "${formatVariableName(political,"political")} "+
                "${formatVariableName(racist,"racist")} "+
                "${formatVariableName(sexist,"sexist")} "+
                formatVariableName(explicit,"explicit")
    }

    private fun formatVariableName(value:Boolean?, name:String):String{
        return if (value == true) name else ""
    }


}
