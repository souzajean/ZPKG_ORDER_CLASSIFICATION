import com.sap.gateway.ip.core.customdev.util.Message

def Message processData(Message message) {

    def amountStr = message.getProperty("amount")
    def amount = amountStr ? amountStr.toInteger() : 0

    def category = "LOW"

    if(amount > 1000){
        category = "HIGH"
    } else if(amount > 500){
        category = "MEDIUM"
    }

    message.setProperty("category", category)
    return message
}
