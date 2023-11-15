package net.ealgorithm.testtoolskit

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * File name to string
 *
 * @param classLoader
 * @return
 */
fun String.fileNameToString(classLoader: ClassLoader?): String {
    val inputStream = classLoader?.getResourceAsStream(this) ?: return ""
    val sb = StringBuilder()
    BufferedReader(InputStreamReader(inputStream)).use { reader ->
        var line: String? = null
        while (reader.readLine().also { line = it } != null) {
            sb.append(line)
        }
    }
    return sb.toString()
}