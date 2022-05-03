package br.felipefcosta.core

import br.felipefcosta.model.DataColor
import br.felipefcosta.model.DataObject
import br.felipefcosta.model.DataType
import br.felipefcosta.data.AssignmentDao

class AssignmentService(private val assignmentDao: AssignmentDao) {

    fun startCheckRoutine() {
        val dataItems = assignmentDao.fetchDataSet()
        checkDataSetMatch(dataItems)
    }

    /*
    The base data-set matches only the first expression. I created new elements
    in the data-set to show the matches with other expressions, but I left that commented.
     */
    private fun checkDataSetMatch(dataObjectList: List<DataObject>) {

        for (dataObject in dataObjectList) {

             when {
                dataObject.type.uppercase() == DataType.APPLE.toString()
                        && dataObject.color.uppercase() == DataColor.GREEN.toString() -> {
                    println("Type ${dataObject.type} and color ${dataObject.color} matched")
                }
                else -> {
                    println("Type ${dataObject.type}, color ${dataObject.color} and weight ${dataObject.weight} did not match!")
                }
            }
            /*
            when {
                dataObject.type.uppercase() == DataType.APPLE.toString()
                        && dataObject.color.uppercase() == DataColor.GREEN.toString() -> {
                    println("Type ${dataObject.type} and color ${dataObject.color} matched")
                }
                dataObject.color.uppercase() == DataColor.RED.toString() && dataObject.weight > 50 -> {
                    println("Color ${dataObject.color} and weight ${dataObject.weight} matched")
                }
                dataObject.type.uppercase() == DataType.PEAR.toString() -> {
                    println("Type ${dataObject.type} matched")
                }
                else -> {
                    println("Type ${dataObject.type}, color ${dataObject.color} and weight ${dataObject.weight} did not match!")
                }
            }
             */
        }
    }
}

