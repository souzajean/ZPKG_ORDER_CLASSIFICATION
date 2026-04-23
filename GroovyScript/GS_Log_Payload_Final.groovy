import com.sap.gateway.ip.core.customdev.util.Message

def Message processData(Message message) {

    def body = message.getBody(String)

    def messageLog = messageLogFactory.getMessageLog(message)
    if(messageLog != null){
        messageLog.addAttachmentAsString("Payload Final", body, "text/xml")
    }

    return message
}
