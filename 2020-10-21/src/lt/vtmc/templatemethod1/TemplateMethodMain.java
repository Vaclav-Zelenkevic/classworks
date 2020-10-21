package lt.vtmc.templatemethod1;

public class TemplateMethodMain {
	public static void main(String[] args) {
		WebsiteTemplate page1 = new WelcomPage();
		WebsiteTemplate page2 = new NewsPage();
		
		page1.showPage();
		page2.showPage();
		page2.showPage();
	}
}
