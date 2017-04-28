# A simple Java rest service sample project, allowing you to quickly start a new rest service.

## How to start

0. Make sure you have Java 7+ and Maven 3+ installed

1. Checkout the project

2. `cd` to the project directory

3. Run this maven command: `mvn clean tomcat7:run`

4. Run this command to verify that service is ready:
```bash
curl -XGET http://localhost:8080/hello
# Hello, it works!
```

5. Run this command to verify `network_score`:
```bash
curl -XPOST -d'{"account_id": "xxx@163.com", "id_no": "330xxxxxxx", "mobile_no": "1376765xxx", "bank_card_no": "622151166xxx", "device_id": "fe62h25dsxxxxx", "lmac": "f2:8u:xxxxxx", "ip": "67.12.22.33"}' -H "accept: application/json" -H "content-type: application/json" http://localhost:8080/fraud/network_score
# {"error_code":0,"error_msg":null,"network_score":0.33}
```
