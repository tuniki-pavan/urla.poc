package usda.urla.poc;

import org.testng.annotations.Test;

import com.deque.html.axecore.results.AxeResults;
import com.deque.html.axecore.results.Results;
import com.deque.html.axecore.results.Rule;
import com.deque.html.axecore.selenium.AxeBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchInJPTest {
	@Test
	public void f() throws MalformedURLException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\July2023\\chromedriver.exe");

		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tscti.com/");
		AxeBuilder axeBuilder = new AxeBuilder();

		// Analyze the webpage
		Results results = axeBuilder.analyze(driver);

		String htmlReport = generateHTMLReport(results);
		System.out.print(htmlReport);

		// Save the HTML report to a file
		saveHTMLReport(htmlReport);

		// Quit the WebDriver instance
		driver.quit();

	}

	private static String generateHTMLReport(Results results) {
		StringBuilder htmlReport = new StringBuilder();
		htmlReport.append("<html><head><title>Accessibility Test Report</title>");
		htmlReport.append(
				"<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\"></head>");
		htmlReport.append("<body>");
		htmlReport.append("<div class=\"container\">");
		htmlReport.append("<h1 class=\"mt-5\">Accessibility Test Report</h1>");

		if (results != null && results.getViolations() != null && !results.getViolations().isEmpty()) {
			htmlReport.append("<h2 class=\"mt-4\">Accessibility violations found:</h2>");
			htmlReport.append("<table class=\"table table-striped\">");
			htmlReport.append("<thead><tr><th>Description</th></tr></thead>");
			htmlReport.append("<tbody>");

			for (Rule violation : results.getViolations()) {
				htmlReport.append("<tr><td>");
				htmlReport.append(violation.getDescription());
				htmlReport.append("</td></tr>");
			}

			htmlReport.append("</tbody></table>");
		} else {
			htmlReport.append("<h2 class=\"mt-4\">No accessibility violations found.</h2>");
		}

		htmlReport.append("</div></body></html>");

		return htmlReport.toString();
	}

	private static void saveHTMLReport(String htmlReport) {
		try{
			FileWriter fileWriter = new FileWriter("accessibility_report.html");
			fileWriter.write(htmlReport);
			fileWriter.close();
			System.out.println("HTML report saved to accessibility_report.html");
		} catch (IOException e) {
			System.out.println("Error saving HTML report: " + e.getMessage());
		}
	}
}
