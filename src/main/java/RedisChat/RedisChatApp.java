package RedisChat;

import redis.clients.jedis.Jedis;
import java.util.List;
import java.util.Map;

public class RedisChatApp {

    private Jedis jedis;

    public RedisChatApp() {
        String redisHost = "redis-11929.c336.samerica-east1-1.gce.redns.redis-cloud.com";
        int redisPort = 11929;
        String redisPassword = "Pierina1438";
        jedis = new Jedis(redisHost, redisPort);
        jedis.auth(redisPassword);
    }

    public void close() {
        if (jedis != null) {
            jedis.close();
        }
    }

    public void addUser(String userId, String username, String status) {
        jedis.hset("user:" + userId, "username", username);
        jedis.hset("user:" + userId, "status", status);
    }
    //Envia mensaje
    public void sendMessage(String messageId, String senderId, String receiverId, String content, String timestamp, String chatId) {
        jedis.hset("message:" + messageId, "sender_id", senderId);
        jedis.hset("message:" + messageId, "receiver_id", receiverId);
        jedis.hset("message:" + messageId, "content", content);
        jedis.hset("message:" + messageId, "timestamp", timestamp);

        // Añade el nuevo mensaje al final de la lista del chat
        jedis.lpush("chat:" + chatId, messageId);

    }
   //Muestra ultimos mensajes de un chat
    public void showCurrentMessages(String chatId) {
        List<String> messageIds = jedis.lrange("chat:" + chatId, 0, 3); // Recupera los últimos 10 mensajes
        if (messageIds.isEmpty()) {
            System.out.println("No current messages found for chat " + chatId);
            return;
        }
        System.out.println("Current messages in chat " + chatId + ":");
        for (String messageId : messageIds) {
            Map<String, String> message = jedis.hgetAll("message:" + messageId);
            if (message.isEmpty()) {
                System.out.println("Message ID " + messageId + " not found.");
                continue;
            }
            System.out.println("Message ID: " + messageId);
            System.out.println("Sender ID: " + message.get("sender_id"));
            System.out.println("Receiver ID: " + message.get("receiver_id"));
            System.out.println("Content: " + message.get("content"));
            System.out.println("Timestamp: " + message.get("timestamp"));
            System.out.println();
        }
    }
    //Muestra Historial completo
    public void showChatHistory(String chatId) {
        List<String> messageIds = jedis.lrange("chat:" + chatId, 0, -1);
        if (messageIds.isEmpty()) {
            System.out.println("No messages found for chat " + chatId);
            return;
        }
        System.out.println("Message history for chat " + chatId + ":");
        for (String messageId : messageIds) {
            Map<String, String> message = jedis.hgetAll("message:" + messageId);
            if (message.isEmpty()) {
                System.out.println("Message ID " + messageId + " not found.");
                continue;
            }
            System.out.println("Message ID: " + messageId);
            System.out.println("Sender ID: " + message.get("sender_id"));
            System.out.println("Receiver ID: " + message.get("receiver_id"));
            System.out.println("Content: " + message.get("content"));
            System.out.println("Timestamp: " + message.get("timestamp"));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RedisChatApp app = new RedisChatApp();
        try {
            // Agregar usuarios
            app.addUser("1", "Alicia", "online");
            app.addUser("2", "Pedro", "online");
            app.addUser("3", "Carlos", "online");

            // Enviar mensajes
            //mensajes chat 1 Alicia y Pedro
            app.sendMessage("1001", "1", "2", "Hola Pedro, ¿cómo estás?", "2024-09-15T10:00:00", "1");
            app.sendMessage("1002", "2", "1", "Hola Alicia, todo bien. ¿Y tú?", "2024-09-15T10:10:00", "1");
            app.sendMessage("1005", "1", "2", "Bien! Vas a la reunion del grupo hoy", "2024-09-15T10:10:00", "1");
            app.sendMessage("1006", "2", "1", "Sii ahi voy a estar. A que hora era?", "2024-09-15T10:10:00", "1");
            app.sendMessage("1007", "1", "2", "A las 15 hs..Se puntual", "2024-09-15T10:10:00", "1");
            //mensajes  chat 2 Alice a Charly
            app.sendMessage("1003", "1", "3", "Hola Carlos, ¿qué tal? Venis a la reunion hoy", "2024-09-15T10:05:00", "2");
            app.sendMessage("1004", "3", "1", "Hola Alicia.. no no voy", "2024-09-15T10:05:00", "2");

            // Mostrar mensajes actuales
            System.out.println("Mensajes en chat 1 (Alicia y Pedro):");
            app.showCurrentMessages("1"); // Muestra los últimos 4  mensajes en el chat 1

            System.out.println("Mensajes en chat 2 (Alicia y Carlos):");
            app.showCurrentMessages("2"); // Muestra los últimos 4 mensajes en el chat 2

            // Mostrar historial completo de mensajes
            System.out.println("Historial  chat 1 (Aliceia y Pedro):");
            app.showChatHistory("1"); // Muestra todos los mensajes en el chat 1

            System.out.println("Historial chat 2 (Alicia y Carlos):");
            app.showChatHistory("2"); // Muestra todos los mensajes en el chat 2

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            app.close();
        }
    }
}