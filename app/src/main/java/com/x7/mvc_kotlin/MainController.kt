package com.x7.mvc_kotlin

class MainController constructor(
val mainActivity: MainActivity
){
    val mainModel=MainModel()

fun changebuttontext(){
mainActivity.updateui(mainModel.name)
}

}
