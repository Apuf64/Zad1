fun main() {
    print("Введите строку:")

    val inputV = readln()

    var result = ""

    var countC = 1

    var previousC = inputV[0]

    for (i in 1 .. inputV.length - 1) {

        if (inputV[i] == previousC) {

            countC++

        }
        else{
            if (countC > 1) {

                result = result + previousC + countC

            }
            else {

                result = result + previousC

            }

            countC = 1
            previousC = inputV[i]

        }

        if (countC > 1) {

            result = result + previousC + countC

        }
        else {

            result = result + previousC

        }

        countC = 1

        previousC = inputV[i]

    }

    if (countC > 1){

        result = result + previousC + countC

    }

    else{

        result = result + previousC

    }

    print(result)

}