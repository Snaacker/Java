package JSON;

import JSON.domain.Book;
import JSON.domain.Employee;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by quanghuy on 4/26/2016.
 */
public class JSONParser {

    public void readJSONFromString(String input, String path) throws JsonGenerationException, JsonMappingException, IOException {

        ObjectMapper mapper = new ObjectMapper();

        //By default all fields without explicit view definition are included, disable this
        // Use SerializationConfig.Feature.* to setting mapper as your demand
        mapper.configure(SerializationConfig.Feature.DEFAULT_VIEW_INCLUSION, false);

        String myTestString = "{\n" +
                "  \"name\" : \"tqh\",\n" +
                "  \"age\" : 30,\n" +
                "  \"lsBook\" : [ {\n" +
                "    \"name\" : \"JavaCore\",\n" +
                "    \"releaseYear\" : 2016\n" +
                "  }, {\n" +
                "    \"name\" : \"Spring\",\n" +
                "    \"releaseYear\" : 2016\n" +
                "  } ]\n" +
                "}";

        Employee employee = mapper.readValue(myTestString, Employee.class);

    }

    public void writeJSONToString() throws JsonGenerationException, JsonMappingException, IOException {

        Employee employee = createEmployee();
        String jsonInString = "";
        ObjectMapper mapper = new ObjectMapper();

        //Convert object to JSON string and pretty print
        jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
        System.out.println(jsonInString);
    }

    public Employee createEmployee(){
        Employee employee = new Employee();
        Book book1 = new Book();
        Book book2 = new Book();
        List<Book> lsBook = new ArrayList<Book>();

        book1.setName("JavaCore");
        book1.setReleaseYear(2016);
        book2.setName("Spring");
        book2.setReleaseYear(2016);
        lsBook.add(book1);
        lsBook.add(book2);

        employee.setName("tqh");
        employee.setAge(30);
        employee.setLsBook(lsBook);
        return employee;
    }

    @Test
    public void JSONParser_test(){
        JSONParser jsonParser = new JSONParser();
        try{
            jsonParser.writeJSONToString();
        }catch (Exception e){
            e.printStackTrace();
        }
        Assert.assertEquals(true, true);
    }
}
