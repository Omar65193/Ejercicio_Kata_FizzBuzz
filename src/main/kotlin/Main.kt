
fun convert(n:Int):String{

        var res:String = ""


        var centenas:Int = n/100
        var decenas:Int = (n-(centenas*100))/10
        var unidades:Int = n-(centenas*100+decenas*10)

        when(centenas){
            1->res+="one hundred "
            2->res+="two hundred "
            3->res+="three hundred "
            4->res+="four hundred "
            5->res+="five hundred "
            6->res+="six hundred "
            7->res+="seven hundred "
            8->res+="eight hundred "
            9->res+="nine hundred "
        }

        when(decenas){
            2->res+="twenty "
            3->res+="thirty "
            4->res+="fourty "
            5->res+="fifty "
            6->res+="sixty "
            7->res+="seventy "
            8->res+="eighty "
            9->res+="ninety "
        }

        if(decenas==1){
            when(unidades){
                1->res+="eleven "
                2->res+="twelve "
                3->res+="thirteen  "
                4->res+="fourteen "
                5->res+="fifteen "
                6->res+="sixteen "
                7->res+="seventeen "
                8->res+="eighteen "
                9->res+="nineteen "
            }
        }else{
            when(unidades){
                1->res+="one "
                2->res+="two "
                3->res+="three "
                4->res+="four "
                5->res+="five "
                6->res+="six "
                7->res+="seven "
                8->res+="eight "
                9->res+="nine "
            }
        }


    return res
}

fun fizzBuzz(n: Int):String{
    if(n%5 == 0 && n%3==0){
        return "FizzBuzz!"
    }else if(n%5 == 0){
        return "Fizz!"
    }else if(n%3 == 0){
        return "Buzz!"
    }else{

        var millares:Int = n/1000
        var centenas:Int = (n-(millares*1000))/100
        var decenas:Int = (n - (millares * 1000 + centenas * 100)) / 10
        var unidades:Int = n - (millares * 1000 + centenas * 100 + decenas * 10)

        var res:String = ""

        if(n==1000000){

            res = "One million"

        }else if(n<1000000 && n>1000){

            res+=convert(millares)+"thousand "+convert(centenas)+"hundred "+convert(decenas*10+unidades)

        }else if(n<1000 && n>=100){

            res+=convert(centenas)+"hundred "+convert(decenas*10+unidades)

        }else if(n<100){

            res+=convert(decenas*10+unidades)

        }
        return res
    }

}
fun main(args: Array<String>){
    var n = readLine()!!.toInt()

    println(fizzBuzz(n))
}