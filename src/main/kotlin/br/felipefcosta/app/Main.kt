package br.felipefcosta.app

import br.felipefcosta.core.AssignmentService
import br.felipefcosta.data.AssignmentDao

fun main(args: Array<String>) {
    val assignmentDao = AssignmentDao()
    val assignmentService = AssignmentService(assignmentDao)
    assignmentService.startCheckRoutine()

}