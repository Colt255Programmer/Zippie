
public class UnzipUtilityTest {
    public static void main(String[] args) {
	String zipFilePath=args[0];
        //System.out.println("Enter Directory to Save Extracted File Eg: C:/hello/java");
	//String destDirectory= sc.nextLine();
	//String destDirectory = "C:/Users/Asus/Desktop/Proj";
	String destDirectory= zipFilePath+" Decompressed";
        UnzipUtility unzipper = new UnzipUtility();
        try {
            unzipper.unzip(zipFilePath, destDirectory);
        } catch (Exception ex) {
            // some errors occurred
            ex.printStackTrace();
        }
    }
}