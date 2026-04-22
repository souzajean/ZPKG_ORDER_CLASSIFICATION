# 🚀 ZPKG_ORDER_CLASSIFICATION_CPI
## SAP BTP CPI | Intelligent Order Classification with XML Modifier & Groovy

## 📌 Overview

This project demonstrates the development of an Integration Flow (iFlow) in SAP BTP Integration Suite (CPI) focused on order processing and classification.

The solution receives an XML payload via HTTP, extracts data using XPath, applies business rules with Groovy, and returns an enriched XML response.

🎯 Scenario

A backend system sends order data that must be:

Validated   
Classified based on amount   
Enriched with processing information   

🧩 iFlow Architecture

HTTPS Sender → Content Modifier (Properties) → Groovy Script → Content Modifier (XML) → Logging → HTTPS Response

📥 Input Payload
<Order>
    <OrderID>5001</OrderID>
    <CustomerID>2002</CustomerID>
    <Amount>750</Amount>
    <Region>SP</Region>
</Order>
⚙️ Processing Steps
1. Content Modifier (Extract Properties)
Extracts values using XPath
Stores data in Exchange Properties
2. Groovy Script (Business Logic)
Classifies order based on amount:
LOW
MEDIUM
HIGH
3. Content Modifier (Build Response)
Constructs final XML response
Adds timestamp and status
4. Logging (Groovy)
Logs final payload in Message Monitoring
📤 Output Payload
<ProcessedOrder>
    <OrderID>5001</OrderID>
    <CustomerID>2002</CustomerID>
    <Amount>750</Amount>
    <Region>SP</Region>
    <Category>MEDIUM</Category>
    <Status>PROCESSED</Status>
    <ProcessedAt>2026-04-22 10:00:00</ProcessedAt>
</ProcessedOrder>
🧠 Key Features
✔️ XPath-based data extraction   
✔️ Business rules with Groovy Script   
✔️ XML transformation using Content Modifier   
✔️ Payload logging for monitoring   
✔️ Parameter externalization ready   
💡 Technical Highlights
Separation of concerns (Extraction vs Logic vs Transformation)
Use of Exchange Properties for stability
Avoidance of inline XPath in XML (best practice)
🚀 Endpoint
POST /order/classify
🧪 How to Test (Postman)
Method: POST
URL: /order/classify
Body: XML
Send request and validate response
📷 Preview

Add your iFlow screenshot here
