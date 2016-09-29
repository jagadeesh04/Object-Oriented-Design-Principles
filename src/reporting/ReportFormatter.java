package reporting;

public class ReportFormatter {

	String formattedOutput;
	
	public ReportFormatter(Object object, FormatType formatType){
		switch (formatType) {
		case xml:
			formattedOutput = convertObjectToXML(object);
			break;
		case csv:
			formattedOutput = convertObjectToCSV(object);
			break;

		default:
			break;
		}
	}
	
	private String convertObjectToXML(Object object){
		return "XML: <title> "+object.toString()+"<title>";
		
	}
	
	private String convertObjectToCSV(Object object){
		return "CSV: <title> "+object.toString()+"<title>";
	}
	
	protected String getFormattedValue(){
		return formattedOutput;
	}
	
}
