package br.felipefcosta.data

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers

class AssignmentDao {

    val dataUrl = "https://my-json-server.typicode.com/felipefcosta-br/AssignmentVisiolink/db"

    init {
        fetchDataSet()
    }
    fun fetchDataSet() {
        val httpClient = HttpClient.newBuilder().build()
        val httpRequest = HttpRequest.newBuilder()
            .uri(URI.create(dataUrl))
            .build()
        val response = httpClient.send(httpRequest, BodyHandlers.ofString())
        println(response.body())
    }

}