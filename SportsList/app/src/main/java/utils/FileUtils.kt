package utils

import android.R.attr.data
import android.content.Context
import android.util.Log
import com.google.gson.Gson
import models.Result
import retrofit2.converter.gson.GsonConverterFactory
import java.io.*


object FileUtils {
    public fun writeToFile(result: Result, context: Context) {
        try {
            val outputStreamWriter = OutputStreamWriter(
                context.openFileOutput(
                    "cache.txt",
                    Context.MODE_PRIVATE
                )
            )
            outputStreamWriter.write(data)
            outputStreamWriter.close()
        } catch (e: IOException) {
            Log.e("Exception", "File write failed: " + e.toString())
        }
    }


    private fun readFromFile(context: Context): Result? {
        var ret: Result? = null
        try {
            val inputStream: InputStream? = context.openFileInput("cache.txt")
            if (inputStream != null) {
                val inputStreamReader = InputStreamReader(inputStream)
                val bufferedReader = BufferedReader(inputStreamReader)
                var receiveString: String? = ""
                val stringBuilder = StringBuilder()
                while (bufferedReader.readLine().also({ receiveString = it }) != null) {
                    stringBuilder.append("\n").append(receiveString)
                }
                inputStream.close()
                val gson = Gson()
                ret = gson.fromJson(stringBuilder.toString(), Result::class.java)
            }
        } catch (e: FileNotFoundException) {
            Log.e("login activity", "File not found: " + e.toString())
        } catch (e: IOException) {
            Log.e("login activity", "Can not read file: $e")
        }
        return ret
    }
}