package jea.example.surveyweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SurveyWebApplication

fun main(args: Array<String>) {
    runApplication<SurveyWebApplication>(*args)
}
