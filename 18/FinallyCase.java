// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.nio.file.Files;
// import java.io.BufferedWriter;
// import java.io.IOException;


// class FinallyCase{
//     public static void main(String[] args) {
//         Path file = Paths.get("/Users/macbookair/Desktop/simple.txt");
//         BufferedWriter writer = null;
//         try{
//             writer = Files.newBufferedWriter(file);
//             writer.write("A");
//             writer.write("B");
//         }
//         catch(IOException e){
//             e.printStackTrace();
//         }
//         finally{
//             try{
//                 if(writer != null){
//                     writer.close();
//                 }   
//             }catch(IOException e){
//                 e.printStackTrace();
//             }
//         }
//         System.out.println("All Well Done");
//     }
// }