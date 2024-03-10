class ClientsController {
    
    private val printer = printer()
    private val clientList = mutableListOf<Customer>(
        Customer(
            "mike",
            "valer",
            "nim",
            "FGFGWSQASITR8",
            "Sm 210 Mz 69 Lt 2"
        )
    )
    fun registerCustomer(){
        printer.printMsg("ingrese los nombres")
        val names = readln()
        printer.printMsg("ingrese el primer apellido") 
        val firstLastName = readln()
        printer.printMsg("ingrese el segundo apellido")
        val secondLastName = readln()
        printer.printMsg("ingrese el RFC")
        val rfc = readln()
        printer.printMsg("ingrese la dirección")
        val addres = readln()
        
        val addedCustomer = Customer(
            names, firstLastName, secondLastName, rfc, addres
        )
        clientList.add(addedCustomer)
    }
    fun showCustomers(){
        if (clientList.isEmpty()){
            printer.printMsg("no se encuentran clientes registrados")
        }else{
            var counter = 1 
            for (customer in clientList){
                printer.printerMsg("$counter-"+ customer.getCustomerData())
                counter++
            }
        }
    }
    fun loadClientsFromDB(){
    }
    fun getCustomerByIndex(index: Int): customer = clientList[index]
    
    fun areNotClientsRegistered(): Boolean = clientList.isEmpty
}