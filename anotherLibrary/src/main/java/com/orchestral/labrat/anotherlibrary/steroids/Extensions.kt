package com.orchestral.labrat.anotherlibrary.steroids

import android.content.Context
import java.util.regex.Pattern


fun Context.getStringRecurr(resourceID: Int): String {
    val currentString = this.getString(resourceID)
    return rResolveAllStringsIn(this, currentString)
}

fun Context.getStringRecurr(currentString: String): String {
    return rResolveAllStringsIn(this, currentString)
}

fun rResolveAllStringsIn(context: Context, source: String?): String {
    val pattern = Pattern.compile("@string/([A-Za-z0-9-_]*)").matcher(source)
    val sb = StringBuffer()
    while (pattern.find()) {
        var stringFromResources = getStringByName(context, pattern.group(1))
        if (stringFromResources == null) {
            stringFromResources = pattern.group(1)
        }
        pattern.appendReplacement(sb, rResolveAllStringsIn(context, stringFromResources))

    }
    pattern.appendTail(sb)
    return sb.toString()
}

private fun getStringByName(context: Context, name: String): String? {
    val resourceId = getResourceId(context, "string", name)
    if (resourceId != 0) {
        return context.getString(resourceId)
    } else {
        return null
    }
}

private fun getResourceId(context: Context, defType: String, name: String): Int {
    return context.resources.getIdentifier(name, defType, context.packageName)
}
