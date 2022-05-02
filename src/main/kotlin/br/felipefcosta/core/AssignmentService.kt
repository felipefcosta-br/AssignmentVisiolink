package br.felipefcosta.core

import br.felipefcosta.Model.DataColor
import br.felipefcosta.Model.DataObject
import br.felipefcosta.Model.DataType
import br.felipefcosta.data.AssignmentDao

class AssignmentService(private val assignmentDao: AssignmentDao) {

    fun getDataSetItems() {
        val dataItems = assignmentDao
    }

    private fun checkDataSetMatch(dataObject: DataObject) {

        when {
            dataObject.type.uppercase() == DataType.APPLE.toString()
                    && dataObject.color.uppercase() == DataColor.GREEN.toString() -> {
                println("Matched")
            }
            dataObject.color.uppercase() == DataColor.RED.toString() && dataObject.weight > 50 -> {
                println("Matched")
            }
            dataObject.type.uppercase() == DataType.PEAR.toString() -> {
                println("Matched")
            }
            else -> {
                println("Did not matched!")
            }
        }
    }
}

