package com.example.revision

interface Downloader{
    fun download()
}
interface Uploader{
    fun upload()
}

class VideoDownloader(val fileName:String):Downloader{
    override fun download(){
        println("file name : $fileName is loaded")
    }
}
class VideoUploader(val fileName:String):Uploader{
    override fun upload(){
        println("file name : $fileName is upload")
    }
}
class FileHandler(val downloader:Downloader,val uploader:Uploader):Downloader by downloader,Uploader by uploader
   /* override fun download(){
        downloader.download()
    }
    override fun upload(){
        uploader.upload()
    }*/

fun main(){
    val downloader = VideoDownloader("Pune")
    val uploader = VideoUploader("India")
    val fileHandler = FileHandler(downloader,uploader)
    fileHandler.download()
    fileHandler.upload()
}