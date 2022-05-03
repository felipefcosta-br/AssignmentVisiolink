package br.felipefcosta.data

import br.felipefcosta.model.DataObject
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers

class AssignmentDao {

    private val dataUrl = "https://my-json-server.typicode.com/felipefcosta-br/AssignmentVisiolink/data"

    fun fetchDataSet(): List<DataObject> {

        val httpClient = HttpClient.newBuilder().build()
        val httpRequest = HttpRequest.newBuilder()
            .uri(URI.create(dataUrl))
            .build()
        val response = httpClient.send(httpRequest, BodyHandlers.ofString())
        val listDataObject = object : TypeToken<List<DataObject>>() {}.type

        return Gson().fromJson(response.body(), listDataObject)
    }

}