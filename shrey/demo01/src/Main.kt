import java.util.*

//fun main() {
//    println("Hello, Shreyas !")
//    println("I am Learning Kothlin First Time.")
//    println("I have done my PG-DAC from CDAC Pune")

//    //Adding two numbers
//    println("Addition = "+ 2+3)
//
//    //storing and displaying values from the variables
//    var name : String
//    name="Shreyas"
//    //instead of these we can also write like this
//    //var name = "Shreyas"
//    val age = 22
//
//    println("Name = "+name)
//    println("Age = "+age)
//
//    val pi = 3.14159265358979
//    println(pi)
//
//    val fname = "shreyas"
//    val lname = "narlawar"
//    val fullname=fname+" "+lname
//    val fullname2=fname.plus(lname)
//    println(fullname)
//    println(fullname2)
//    //addition of two numbers
//    val a = 10
//    val b = 40
//    println(a+b)
//
//    //storing values in DataTypes
//
//    val myNum :Byte = 14
//    println(myNum)
//    val myNum2 : Short = 14534
//    println(myNum2)
//    val myNum3 : Int = 1458745
//    println(myNum3)
//    val myNum4 : Long = 14587457687548L
//    println(myNum4)
//
//    val myNum5 : Float = 3.14F
//    println(myNum5)
//    val myNum6 : Double = 2415.56544
//    println(myNum6)
//
//    val myNum7 : Float = 5E1F
//    println(myNum7)
//
//    val isPrime = true
//    val isnumber = false
//    println(isPrime)
//    println(isnumber)
//
//    val myGrade :Char = 'A'
//    println(myGrade)
//
//    val collegeName :String = "MIT Chh.Sambhajinagar"
//    println(collegeName)
//
//    val x : Int = 65
//    val y : Char = x.toChar()
//    println(y)
//
//    var val1 = 4
//    var val2 = val1 + 1
//    var val3 = val2 + 1
//    println(val3)
//
//
//    val text1 = "abcdefghijklmnopqrstuvwxyz"
//    println(text1.length)
//    println(text1.uppercase(Locale.getDefault()))
//    val text2 = "abcdefghijklmnopqrstuvwxyz"
//    println(text1.compareTo(text2))
//
//    val text3 = "Hello, Welcome to the World of IT industry."
//    println(text3.indexOf("World"))
//
//    var name1 = "Ram"
//    var name2 = "Shyam"
//    println("My Name is $name1 and my BestFrd name is $name2")
//
//
//    val num14 = 7
//    val num15 = 74
//    if(num14>num15)
//        println("Num14 is greater than num15")
//    else
//        println("Num15 is less than num15")
//
//    val time = 11
//    val greetings = if(time < 12)
//        "Good Morning" else "Good Evening"
//
//    println(greetings)

//    val day = 5
//    val result = when (day){
//        1->"monday"
//        2->"Tuesday"
//        3->"Wednesday"
//        4->"Thursday"
//        5->"Friday"
//        6->"Saturday"
//        7->"Sunday"
//        else->"Invalid Day Enter Proper Number"
//    }
//
//println(result)
//
//    var i=0
//    while(i<6) {
//        println(i)
//        i++
//    }
//    var j=0
//    do{
//        println(j)
//        j++
//    }while(j<4)

//    var k=0
//    while(k<10) {
//        if (k == 6) {
//            k++
//            continue
//        }
//        println(k)
//        k++
//    }
//  val brands = arrayOf("BMW","Rolls Royce","Mercedes","Toyota","TATA","Volvo")
//     println(brands[3])

//     brands[4]="Farrari"
//     println(brands[4])
//     println(brands.size)

//     var carType="BMW"
//     if(carType in brands)
//         println("Available") else println("Unavailable")

// //     var i=0
// //     while(i<brands.size){
// //         println(brands[i])
// //         i++
// //     }

// 	for(x in brands)
//     println(x)
//     val numbers=arrayOf(1,7,4,5,74,64,435,546,412)
//     for(y in numbers)
//     println(y)

//     for(chars in 'a'..'y')
//     print(chars+" ")
//     println()
//     for(num in 1..23)
//     print(num)

//     if(64 in numbers)
//     println("Found")
// 	else
//     println("not found")

//     for(nums in 5..20){
//     if(nums %5 == 0)
//     continue
//     println(nums)
//     }

    //functions/Methods

    //  val brands = arrayOf("BMW","Rolls Royce","Mercedes","Toyota","TATA","Volvo")
//     println(brands[3])

//     brands[4]="Farrari"
//     println(brands[4])
//     println(brands.size)

//     var carType="BMW"
//     if(carType in brands)
//         println("Available") else println("Unavailable")

// //     var i=0
// //     while(i<brands.size){
// //         println(brands[i])
// //         i++
// //     }

// 	for(x in brands)
//     println(x)
//     val numbers=arrayOf(1,7,4,5,74,64,435,546,412)
//     for(y in numbers)
//     println(y)

//     for(chars in 'a'..'y')
//     print(chars+" ")
//     println()
//     for(num in 1..23)
//     print(num)

//     if(64 in numbers)
//     println("Found")
// 	else
//     println("not found")

//     for(nums in 5..20){
//     if(nums %5 == 0)
//     continue
//     println(nums)
//     }
//
//    val a = 29
//    val b = 71
//    shreyMethod(a,b)
//    shreyMethod("Shreyas",22)
//    var add = myAddMethod(41,9)
//    println("Addition = "+add)
//    var sub = mySubtractmethod()
//}
//fun shreyMethod(a:Int , b:Int){
//    println("Addition = "+(a+b))
//}
//fun shreyMethod(fname:String , age:Int){
//    println("Name : "+fname+ " \nAge  : "+age)
//}
//fun myAddMethod(a:Int,b:Int):Int{
//    return a+b;
//}
//fun mySubtractmethod(a:Int,b:Int)=a-b

// Classes and Objects

//    class Car{
//        var brand=""
//        var model=""
//        var type=""
//        var mf_year=0;
//    }
//    fun main(){
//        val c1=Car()
//        c1.brand="BMW"
//        c1.model="X7"
//        c1.mf_year=2024
//        c1.type="Manual"
//
//        val c2=Car()
//        c2.brand="rolls royce"
//        c2.model="Ghost"
//        c2.mf_year=2024
//        c2.type="Automatic"
//
//        println(c1.brand)
//        println(c1.model)
//        println(c1.mf_year)
//        println(c1.type)
//
//        println(c2.brand)
//        println(c2.model)
//        println(c2.type)
//    }

// Constructors

//    class Car(var brand:String ,var model:String,var year:Int){
//        fun drive(){
//            println("Wroom Wroom.")
//        }
//        fun speed(sp:Int){
//            println(brand+" "+model)
//            println("The Maximum speed is "+sp+"km/hr.")
//        }
//
//    }
//    fun main(){
//        val c1 = Car("Toyota","Supraaa",1984)
//        c1.drive()
//        c1.speed(255)
//        println(c1.toString())
//    }


//  Inheritance

//open class ParentClass{
//    val a = 10
//}
//
//class ChildClass : ParentClass(){
//    fun shreyFunc(){
//        val a=50
//        println(a)
//    }
//}
//
//fun main(){
//    val obj = ChildClass();
//    obj.shreyFunc()
//}
//fun main(){
//var name :String? = "Narlawar"
//println("The Number of Letters in my name is ${name?.length}")
//if(name!!.length>7)
//println("Name was too long")
//else
//println("Perfect name Size.")
//
//var age :Int? = 22
//println(age)
//age=null
//println(age)
//
//methods

//fun main{
//     val Switch = Switches()
//     println("The Device name is ${Switch.gadget}, Screen Type is ${Switch.type} and its Price is Rs.${Switch.price}/- Only.")
//     Switch.Off()
//     Switch.On()
// }
// class Switches{
//     val gadget = "Television"
//     val type = "OLED"
//     val price = 449999
//     fun On(){println("Switched On.")}
//     fun Off(){println("Switched Off.")}
// }

//     class A {
//         var waterLevel : Int? = null
//         set(value){field=value}
//         get()=field
//     }
//     val abc = A()
//     abc.waterLevel=14
//     println(abc.waterLevel)
//
// }

//Primary Constructor

//class B(val name:String , val age:Int){
//    var naam = name
//    var vay = age
//    var id=0
//    fun DataUser(){
//        println("the user id is ${++id},Name is ${naam},And the age is ${vay}")
//    }
//}
//fun main(){
//    val ins = B("Shreyas",22)
//    ins.DataUser()
//}

//Secondary Constructor
//
//class B(val name:String , val age:Int){
//    var Code="Available"
//    constructor(name: String, age: Int, statusCode: Int) : this(name, age) {
//        Code = when (statusCode) {
//            0->"Available"
//            1->"Unavailable"
//            else ->"Unknown"
//        }
//    }
//    fun DataUser(){
//        println("Name is $name, and the age is $age and the user is $Code")
//    }
//}
//fun main(){
//    val user1 = B("Sam", 20, 1)
//    user1.DataUser()
//
//}
//
//open class Devices(val name :String,val type :String)
//{
//    var Volume :Int = 40
//        set(value){
//            if(value in 0..100){
//                field=value
//            }
//        }
//}
//class SmartDevice(name:String,type:String):Devices(name,type)
//
//fun main(){
//    val abc = Devices("TV","SmartDevice")
//    println("Device Name :${abc.name}")
//    println("Device Type: ${abc.type}")
//    println("Device Volume : ${abc.Volume}")
//
//    abc.Volume = 80
//    println("Updated Volume is : ${abc.Volume}")
//


//Inheritance

//}open class Parent{
//    var name:String=""
//    fun myMethod1(){
//        println("I am in Parent")
//    }
//}
//
//class Child : Parent(){
//     fun myMethod2(){
//        println("In Child Method $name2")
//    }
//}
//fun main(){
//    val obj = Child()
//    obj.myMethod1()
//    obj.myMethod2()
//}
//
//Override and Inheritance

//open class Mobile(val type:String){
//    open val name :String ="General Mobile"
//    open val size :Int=5
//    open fun makeCall(){ println("Calling from $type Mobile")}
//    open fun powerOff(){ println("Shutting Down")}
//    open fun display(){ println("Simple Mobile Display")}
//}
//
//class OnePlus(typeoff:String) : Mobile(typeoff){
//    //     override val name:String="OnePlus"
////     override val size:Int=6
//    override fun display() = println("One plus display")
//    override fun toString():String{
//        return "Name- $name  - Size-  $size"
//    }
//}
//
//fun main(){
//    val genePhone = OnePlus("Samsung")
//    genePhone.display()
//    println(genePhone.toString())
////     genePhone.makeCall()
//}
//
//open class Mobile(val type:String){
//    open val name :String ="General Mobile"
//    open val size :Int=5
//    open fun makeCall(){ println("Calling from $type Mobile")}
//    open fun powerOff(){ println("Shutting Down")}
//    open fun display(){ println("Simple Mobile Display")}
//}
//
//class OnePlus(typeoff:String) : Mobile(typeoff){
//    //     override val name:String="OnePlus"
////     override val size:Int=6
//    override fun display() {
//        super.display()
//        println("One plus display")}
//    override fun toString():String{
//        return "Name- $name  - Size-  $size"
//    }
//}
//
//fun main(){
//    val genePhone = OnePlus("Samsung")
//    genePhone.display()
//    println(genePhone.toString())
////     genePhone.makeCall()
//}


//Polymorphism

//open class Shape{
//    open fun area():Double{
//        return 0.0
//    }
//}
//
//class Circle(val rad:Double):Shape(){
//    override fun area(): Double{
//        return Math.PI * rad * rad;
//    }
//}
//class Square(val side:Double):Shape(){
//    override fun area(): Double{
//        return side*side;
//    }
//}
//class Triangle(val base:Double,val height:Double):Shape(){
//    override fun area(): Double{
//        return 0.5*base*height;
//    }
//}
//fun calculateArea(shapes:Array<Shape>){
//    for(shape:Shape in shapes)
//        println(shape.area())
//}
//fun main(){
////     val circle:Shape = Circle(4.0)
////     val square:Shape = Square(5.2)
////     val triangle:Shape = Triangle(2.1,2.4)
////     println(circle.area())
////     println(square.area())
//
//    val shapes : Array<Shape> = arrayOf(Circle(3.0),Circle(4.0),Square(4.0),Triangle(3.0,4.0))
//    calculateArea(shapes)
//}


//Visibility Modifier and Polymorphism and inheritance
//
//open class SmartDevice protected constructor(val name: String, val category: String) {
//    var deviceStatus = "online"
//    //protected set
//}
//
//class SmartTvDevice(name: String, category: String) : SmartDevice(name, category) {
//
//    private var speakerVolume = 2
//        set(value){
//            if(value in 0..100){
//                field = value
//            }
//        }
//    private var channelNumber = 1
//        set(value){
//            if(value in 0..145){
//                field = value
//            }
//        }
//
//    fun increaseVolume(){
//        speakerVolume++
//        println("Speaker Volume is $speakerVolume")
//    }
//
//    fun decreaseVolume(){
//        speakerVolume--
//        println("Speaker Volume is $speakerVolume")
//    }
//
//    fun turnOn() {
//        deviceStatus = "on"
//    }
//
//    fun turnOff() {
//        deviceStatus = "off"
//    }
//}
//
//class SmartLightDevice(name: String, category: String) : SmartDevice(name, category) {
//
//    private var brightnesslevel = 0
//        set(value){
//            if(value in 0..100){
//                field=value
//            }
//        }
//
//    fun increaseBrightness(){
//        brightnesslevel++
//        println("Brightness Level $brightnesslevel")
//    }
//
//    fun decreaseBrightness(){
//        brightnesslevel--
//        println("Brightness Level $brightnesslevel")
//    }
//
//    fun turnOn() {
//        deviceStatus = "on"
//    }
//
//    fun turnOff() {
//        deviceStatus = "off"
//    }
//}
//
//class SmartHome(
//    val smartTvDevice: SmartTvDevice,
//    val smartLightDevice: SmartLightDevice
//) {
//    var deviceTurnOnCount = 0
//        private set
//
//    fun turnOnTv() {
//        deviceTurnOnCount++
//        smartTvDevice.turnOn()
//    }
//    fun turnOfTv() {
//        deviceTurnOnCount--
//        smartTvDevice.turnOff()
//    }
//
//    fun turnOnLight() {
//        deviceTurnOnCount++
//        smartLightDevice.turnOn()
//    }
//    fun turnOfLight() {
//        deviceTurnOnCount--
//        smartLightDevice.turnOff()
//    }
//
//    fun getDeviceStatus() {
//        println("Smart TV Status: ${smartTvDevice.deviceStatus}")
//        println("Smart Light Status: ${smartLightDevice.deviceStatus}")
//    }
//}
//
//fun main() {
//    val smartTvDevice = SmartTvDevice("TV", "Entertainment")
//    val smartLightDevice = SmartLightDevice("Light", "Home Automation")
////     val smartHome = SmartHome(smartTvDevice, smartLightDevice)
//
////     smartHome.getDeviceStatus()
////     smartHome.turnOnTv()
////     smartHome.turnOnLight()
////     smartHome.turnOffTv()
////     println("Device Turned On Count: ${smartHome.deviceTurnOnCount}")
////     smartHome.getDeviceStatus()
////     smartHome.turnOfTv()
////     smartHome.turnOfLight()
////     smartHome.getDeviceStatus()
//
//    smartLightDevice.increaseBrightness()
//    smartLightDevice.increaseBrightness()
//    smartLightDevice.increaseBrightness()
//}


//Delegates

//import java.util.logging.FileHandler
//
//interface Downloader{
//    fun download()
//}
//interface Uploader{
//    fun upload()
//}
//
//class VideoDownloader(val fileName:String):Downloader{
//    override fun download(){
//        println("file name : $fileName is loaded")
//    }
//}
//class VideoUploader(val fileName:String):Uploader{
//    override fun upload(){
//        println("file name : $fileName is upload")
//    }
//}
//class FileHandler(val downloader:Downloader,val uploader:Uploader):Downloader by downloader,Uploader by uploader
///* override fun download(){
//     downloader.download()
// }
// override fun upload(){
//     uploader.upload()
// }*/
//
//fun main(){
//    val downloader = VideoDownloader("Pune")
//    val uploader = VideoUploader("India")
//    val fileHandler = FileHandler(downloader,uploader)
//    fileHandler.download()
//    fileHandler.upload()
//}