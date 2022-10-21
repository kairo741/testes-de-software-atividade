import org.junit.Test
import java.util.*
import kotlin.concurrent.thread


//class Testes2 {


//    @Test
//    fun deveLancarExcecaoQuandoConcorrencia() {
//
//        main()
////        synchronized(this) {
////            print("\n${Date().time} Data 1\n")
////            print("\n${Date().time} Data 2\n")
////        }
////        val codigos = mutableListOf(504663, 2)
////
////        service.enviarLiberacao(codigos, "Joao Luz")
////        service.enviarLiberacao(codigos, "Kairo")
//    }


    fun main() {
        println("My program runs...: ${Thread.currentThread().name}")


        thread {
            print("\n${Date().time} Data 1\n")
            Thread.sleep(1000)
            print("\n${Date().time} Data 2\n")
        }

        thread {
            print("\n${Date().time} Data 3\n")
            Thread.sleep(1000)
            print("\n${Date().time} Data 4\n")
        }

        println(
            "My program run ends...: ${Thread.currentThread().name}"
        )
    }

    fun longRunningTask() {
        println(
            "executing longRunningTask on...:  ${Thread.currentThread().name}"
        )
        Thread.sleep(1000)
        println(
            "longRunningTask ends on thread ...:   ${Thread.currentThread().name}"
        )
    }

//}