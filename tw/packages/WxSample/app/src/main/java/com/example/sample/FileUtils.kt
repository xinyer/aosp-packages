package com.example.sample

import java.io.File

object FileUtils {

    fun read(path: String): String? {
        if (path.isBlank()) {
            return null
        }
        val file = File(path)
        if (file.exists().not()) {
            return null
        }
        return file.reader().readText()
    }
}