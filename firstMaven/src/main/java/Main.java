import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Main {
    public static void main(String[] args) {
        System.out.println("hh");
        MongoClient mongoClient = MongoClients.create();
        MongoDatabase mongoDatabase=mongoClient.getDatabase("firstDataBase");
        MongoCollection<Document> documentMongoCollection=mongoDatabase.getCollection("Users");
        Document doc=new Document("name","milad")
        .append("id",581000)
                .append("type","Soldier")
                .append("MobileNumber",new Document("first",918).append("seceand",991));
        documentMongoCollection.insertOne(doc);
    }
}
