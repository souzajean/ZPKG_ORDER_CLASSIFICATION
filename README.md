# 🚀 ZPKG_ORDER_CLASSIFICATION_CPI
## SAP BTP CPI | Classificação Inteligente de Pedidos com XML Modifier & Groovy

## 📌 Objetivo da solução

Este projeto demonstra o desenvolvimento de um Integration Flow (iFlow) no SAP BTP Integration Suite (CPI), focado no processamento e classificação de pedidos.

A solução recebe um payload XML via HTTP, extrai os dados utilizando XPath, aplica regras de negócio com Groovy e retorna uma resposta XML enriquecida.

### 🎯 Cenário

Um sistema backend envia dados de pedidos que devem ser:

✅ Validados   
📊 Classificados com base no valor   
🔄 Enriquecidos com informações de processamento    

<br>

![Fluxo](imagens/capa-linkedin.png)

---

<br>

# 🏗️ 🔧 Arquitetura do iFlow

<br><br>

# 🔄 1. Fluxo da Integração

<br>

### 🧱 Criando o Package
![Fluxo](imagens/Screenshot_1.png)

<br><br>

### 🏷️ Nome do Package
```
ZPKG_COUNTRIES_INTEGRATION
```
![Fluxo](imagens/Screenshot_2.png)

<br>

### ➕ Adicionando o Artefato
![Fluxo](imagens/Screenshot_3.png)

<br>

### 🏷️ Nome do iFlow
```
IF_SEND_MESSAGE_DISCORD
```
![Fluxo](imagens/Screenshot_4.png)

<br>

### ➕ Adicionando o Adapter
![Fluxo](imagens/Screenshot_5.png)

<br> 

# 🔹 2. HTTPS Sender (Trigger)
```
Endpoint: /discord
```
![Fluxo](imagens/Screenshot_6.png)

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
