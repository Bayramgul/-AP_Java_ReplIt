package certificate.oca;

public class Q_12 {

	public static void main(String[] args) {
		
	}

}

interface Exportable{
	void export();			// interface de method lar default olarak public abstract'tir.
}

class Tool implements Exportable{
	public void export() {				// protected line n1  // metodlar inheretance/override da child class tarafindan daraltilamaz genisletilebilir.
		System.out.println("Tool::export");
	}
}//public-default-protected-private

class ReportTool extends Tool implements Exportable{
	public void export() {					// line n2
		System.out.println("RTool::export");
	}
	
	public static void callExport (Exportable ex) {
		ex.export();
	}
	public static void main(String[] args) {
		Tool aTool=new ReportTool();
		Tool bTool=new Tool();
		callExport(aTool);
		callExport(bTool);
	}}