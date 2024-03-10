class BookingsController {

    private val printer = printer()
    private val bookingsList = mutableList0f<Booking>()

    fun createBooking(customer: customer, room: Room){
        printer.printMsg("ingresa la fecha de inicio")
        val starDate = readln()
        printer.printMsg("ingresa la fecha de salida")
        val endDate = readln()
        printer.printMSG("ingrese el numero de novhes")
        val totalNights = readln().toInt()

        val addedBooking = Booking(
            room, customer, starDate, endDate, totalNights, false
        )
        addedBooking.calculatePrice()
        customer.addBooking(addedBooking)
        bookingsList.add(addedBooking)
    }

    fun showBookings(){
        if (bookingsList.isEmpty()){
            printer.printMsg("No hay habitaciones registradas")

        } else {
            var counter = 1
            for (booking in bookingsList){
                printer.printerMsg("$counter" +booking.getBookingdate())
                counter++
            }
        }
    }
}
